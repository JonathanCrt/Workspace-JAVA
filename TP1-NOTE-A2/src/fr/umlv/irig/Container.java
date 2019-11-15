package fr.umlv.irig;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Container<E> {
	private  final static int SIZE_INT = 2000;
	private ToIntFunction<? super E> myIntegerfunction;
	private Function<?super E, Integer> myFunction;
	private E[] table;
	private int nbElt;
	private int currentMaxLength;
	
	@SuppressWarnings("unchecked")
	public Container(ToIntFunction<? super E> myFunction) {
		this.nbElt = 0;
		this.myIntegerfunction = myFunction;
		this.table = (E[]) new Object[SIZE_INT];
		this.currentMaxLength = SIZE_INT;
	}
	
	/**
	 * test if length should be grow
	 * @param index
	 * @return true if size should be grow, false otherwise
	 */
	private boolean tableShouldBeGrow(int index) {
		if (currentMaxLength/2 < index) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void checkIfIndexIsPositive(int index) {
		if(index < 0) {
			throw new IllegalStateException("index must be positive");
		}
	}
	
	
	/**
	 * grow length of table
	 */
	private void growTable() {
		var newLength = (int) Math.pow(currentMaxLength, 2);
		this.table = Arrays.copyOf(table, newLength);
		currentMaxLength = newLength;
		
		/*
		var length = this.size * 2;
		var cloneTable  =this.table.clone();
		var newTable = (E[]) new Object[length];
		this.table = newTable;
		for(int i = 0; i < cloneTable.length; i++) {
			this.add(table[i]);
		}
		*/
	}
	
	/**
	 * Add an element into container
	 * @param elt
	 */
	public void add(E elt) {
		Objects.requireNonNull(elt);
		int index = myIntegerfunction.applyAsInt(elt); 
		this.checkIfIndexIsPositive(index);
		if(tableShouldBeGrow(index)) {
			this.growTable();
		}
		
		if(table[index] != null) {
			throw new IllegalStateException("case is already taken");
		}
		
		table[index] = elt;
		this.nbElt++;
	}
	
	/**
	 * Q2 -> Car on est sûr d'avoir des E dans notre structure de donnée
	 * @param elt
	 * @return
	 */
	public boolean contains(E elt) {
		Objects.requireNonNull(elt);
		var index = myIntegerfunction.applyAsInt(elt);
		this.checkIfIndexIsPositive(index);
		if(table[index] != null && table[index].equals(elt)) {
			return true;  // element already exist into container
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param action
	 */
	private void forEachContainer(Consumer<? super E> action) {
		Objects.requireNonNull(action);
		for(int i = 0; i < table.length; i++) {
			if(table[i] != null) {
				action.accept(table[i]);
			}
		}
	}
	
	public void forEach(Consumer<? super E> action) {
		this.forEachContainer(action);
	}
	
	/**
	 * return size of container
	 * @return int size of container
	 */
	public int size() {
		return this.nbElt;
	}
	
	/**
	 * 
	 * @return
	 */
	public Iterator<E> iterator(){
		return new Iterator<E>() {
			private int cursor;

			@Override
			public boolean hasNext() {
				if(cursor < table.length && table[cursor] != null) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public E next() {
				if(!hasNext()) {
					throw new NoSuchElementException();
				}
				var elt = table[cursor];
				cursor++;
				return elt;
			}
		};
	}
	
	
	
	@Override
	public String toString() {
		var st = new StringJoiner(", ", "{", "}");
		this.forEach((element) -> st.add(element.toString()));
		return st.toString();
	}
	
	
	
	
}
