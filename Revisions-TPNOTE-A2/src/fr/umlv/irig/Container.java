package fr.umlv.irig;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Container<E> {

	private final ToIntFunction<? super E> myFunction;
	private E[] container;
	private static final int INIT_SIZE = 2000;
	private int counter;

	@SuppressWarnings("unchecked")
	public Container(ToIntFunction<? super E> myFunction) {
		this.myFunction = Objects.requireNonNull(myFunction);
		this.container = (E[]) new Object[INIT_SIZE];
		this.counter = 0;
	}

	public int size() {
		return this.counter;
	}

	private void grow() {
		var newLength = container.length * 2;
		this.container = Arrays.copyOf(container, newLength);
	}

	private boolean mustBeGrow(int index) {
		return (container.length / 2) < index;
	}

	private void addWrapper(E element) {
		Objects.requireNonNull(element);
		var index = myFunction.applyAsInt(element);
		System.out.println("index " + index);

		if (index < 0) {
			throw new IllegalStateException();
		}

		while (mustBeGrow(index)) {
			this.grow();
		}

		if (container[index] != null) {
			throw new IllegalStateException();
		}

		container[index] = element;
		counter++;
	}

	public boolean add(E element) {
		this.addWrapper(element);
		return true;
	}

	public boolean contains(E element) {
		Objects.requireNonNull(element);
		var index = myFunction.applyAsInt(element);
		if (index < 0) {
			throw new IllegalStateException();
		}
		return (container[index] != null) && container[index].equals(element);
	}

	private void forEachWrapper(Consumer<? super E> consumer) {
		for (var elt : container) {
			if (elt != null) {
				consumer.accept(elt);
			}
		}
	}

	public void forEach(Consumer<? super E> consumer) {
		Objects.requireNonNull(consumer);
		forEachWrapper(consumer);
	}

	@Override
	public String toString() {
		var joiner = new StringJoiner(", ", "{", "}");
		forEachWrapper((elt) -> joiner.add(elt.toString()));
		return joiner.toString();
	}
	
	
	public Iterator<E> iterator() {
		
		return new Iterator<E>() {
			
			private int  getNextToReturn(int from) {
				for(var i = from; i < container.length; i++) {
					if(container[i] != null) {
						return i;
					}
				}
				return -1;
			}
			
			private int cursor =  getNextToReturn(0);
			private int lastRemoveIndex  = -1;
			
			@Override
			public boolean hasNext() {
				return (cursor != -1);
			}

			@Override
			public E next() {
				if(!hasNext()) {
					throw new NoSuchElementException();
				}
				var tmp = cursor;
				lastRemoveIndex = tmp;
				cursor = getNextToReturn(cursor + 1);
				return container[tmp];
			}
			
			
			@Override
			public void remove() {
				
				if(lastRemoveIndex == -1) {
					throw new IllegalStateException();
				}
				container[cursor] = null;
				lastRemoveIndex = -1;

			}
			
			
			
		};
		
		
		
	}
	
	
	
	

}
