package fr.umlv.bag;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
//import java.util.stream.IntStream;


public class BagImpl<T>  implements Bag<T> {
	private HashMap<T, Integer> map;

	public BagImpl() {
		this.map = new HashMap<>();
	}

	@Override
	public int add(T element, int count) {
		Objects.requireNonNull(element);
		if(count <= 0) {
			throw new IllegalArgumentException("count must be positive ! ");
		}
		//map.merge(element, count, Integer::sum);
		map.compute(element, (key, oldValue)-> {
			if(oldValue == null) {
				return count;
			}
			else {
				return oldValue + count;
			}
		});
		return count(element);
		
	}

	@Override
	public int count(Object element) {
		Objects.requireNonNull(element);
		if(map.get(element) == null) {
			return 0;
		}
		return map.get(element);
	}

	@Override
	public void forEach(Consumer<? super T> consumer) {
		Objects.requireNonNull(consumer);
		//map.keySet().forEach(consumer);
		//v1
		/*
		for(var entry: map.entrySet()) { //entrySet : liste des clés /valeurs
			T key = entry.getKey();
			for(int i = 0; i < entry.getValue(); i++) {
				consumer.accept(key);
			}
		}
		*/
		//v2
		map.forEach((key, value) -> {
			for(var i = 0; i < value; i++) {
				consumer.accept(key); // execute la méthode d'instance de consumer (interface fonctionnelle)
			}
		});
		//v3
		/*
		map.forEach((key, value) -> {
			IntStream.range(0, value).forEach(__ -> consumer.accept(key));
		});
		*/
	}

	@Override
	public Iterator<T> iterator() {
		
		var mapIterator = map.entrySet().iterator();
		return new Iterator<>() { // se souvenir dans l'elt ou l'on est
			
			private T current = null; // dernier element deja renvoye
			private int remaining = 0;  // nombre d'elements restants a voir - Si remaining = 0 je suis a la fin  
			// Etat : se positionner sur la prochaine valeur que l on va renvoyer : plus complique
									  
			@Override
			public boolean hasNext() { // Does it exists a next element? never change state of iterator
				return remaining != 0 || mapIterator.hasNext();
			}

			@Override
			public T next() {
				if(!hasNext()) {
					throw new NoSuchElementException(); // test si il y a bien un elt a renvoyer
				}
				if(remaining != 0) {
					remaining--;
					return current;
				}
				
				var next = mapIterator.next();
				current = next.getKey();
				remaining = next.getValue() -1;
				return current;
			}
			
		};
	}
	
	
	
}
