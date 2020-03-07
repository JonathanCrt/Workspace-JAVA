package fr.umlv.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CactusList<E> implements Iterable<E> {
	private ArrayList<E> list;
	private boolean isFrozen;
	//private boolean isNormalized;

	public CactusList() {
		this.list = new ArrayList<E>();
	}

	private void checkIfListIsFrozen() throws IllegalStateException {
		if (this.isFrozen) {
			throw new IllegalStateException();
		}
	}

	private void addLogic(E element) throws IllegalArgumentException {
		Objects.requireNonNull(element);

		if (element instanceof CactusList) {
			throw new IllegalArgumentException();
		}
		this.checkIfListIsFrozen();

		list.add(element);

	}

	public void add(E element) {
		this.addLogic(element);
	}

	public void addCactus(CactusList<? extends E> cactusList) {
		Objects.requireNonNull(cactusList);

		cactusList.isFrozen = true;
		this.checkIfListIsFrozen();

		for (var elt : cactusList) {
			this.add(elt);
		}

	}

	public int size() {
		return this.list.size();
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}

	public void forEach(Consumer<? super E> consumer) {
		this.list.forEach(consumer);
	}

	public boolean frozen() {
		return isFrozen;
	}

	@Override
	public String toString() {
		return list.stream().map(E::toString).collect(Collectors.joining(", ", "<", ">")).toString();
	}

	// Pas accés à E dans le static
	public static <T> CactusList<T> from(List<T> list) {
		var cactusList = new CactusList<T>();
		for (var elt : list) {
			cactusList.add(elt);
		}
		cactusList.isFrozen = true;
		return cactusList;
	}
	
	/*  ??
	public E get(int index) {
		this.list.stream()
		.flatMap()
	}
	*/

}
