package fr.umlv.set;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class IntHashSet {
	private static final int SIZE_INIT = 8;
	private Entry[] table;
	private int counter;
	
	// intern class
	static class Entry {
		final int value;
		final Entry next;
		
		public Entry(int value, Entry next) {
			this.value = value;
			this.next = next;
		}
	}
	
	
	public IntHashSet() {
		this.table = new Entry[SIZE_INIT];
		this.counter = 0;
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public int hash (int value) {
		return value &(table.length-1);
	}
	
	/**
	 * 
	 * @param index
	 */
	public void add(int valparam) {
		Objects.requireNonNull(valparam);
		var position = hash(valparam);
		var tmp = this.table[position];
		while(tmp != null) {
			if(tmp.value == valparam) {
				return;
			}
			tmp = tmp.next;
		}
		table[position] = new Entry(valparam, table[position]);
		counter++;
		
		/*
		if(this.table[index] == null) {
			table[index] = new Entry(value, null);
			counter++;
		}
		else {
			var temp  =  table[index];
			table[index] = new Entry(value, temp);
		}
		*/
	}
	
	/**
	 * 
	 * @return
	 */
	public int size () {
		return counter;
	}
	
	/**
	 * 
	 * @param consumer
	 */
	public void forEach(IntConsumer consumer) {
		Objects.requireNonNull(consumer);
		for(var elt: table) {
			for(var entry = elt; entry != null; entry = entry.next) {
				consumer.accept(entry.value);
			}
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		Objects.requireNonNull(value);
		var position= hash(value);
		for(var tmp = table[position]; tmp != null; tmp = tmp.next) {
			if(tmp.value == value) {
				return true;
			}
	
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		/**
		 * On cherche à stocker les collissions dans une lsite chaînées
		 * 1 - la visibilité de la classe doit être visibilité package car on est 'mettre à bord dans notre package
		 * 
		 * modificateur champ : visiblité package - final
		 * * la fonction de hashage est un tableau 
		 * tab.length = 2 ?
		 * 
		 * 2 - %2
		 * l'opérateur une opération lente, d'un point de vue CPU.
		 * 
		 * 3 -
		 * size (nombre de cases)
		 * compteur (combien d'élément)
		 * 
		 * SIZE O(1) -> utiliser un compteur
		 * 
		 * 
		 * 5- Foreach ->  consumer
		 * java.util.functions.Consumer<T>
		 */
	}
	
	
	
}
