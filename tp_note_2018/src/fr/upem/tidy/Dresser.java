package fr.upem.tidy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Dresser implements Iterable<Item> {
	private final Item[] drawers;
	private int size;
	private final HashMap<String, Integer> dictionnary;

	public Dresser(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Invalid capacity");
		}
		this.drawers = new Item[capacity];
		this.dictionnary = new HashMap<String, Integer>(capacity);
		this.size = 0;
	}

	public void store(int index, Item item) {
		if (index < 0 || index >= this.drawers.length) {
			throw new IllegalArgumentException("Invalid index");
		}

		if (this.drawers[index] != null) {
			throw new IllegalStateException("This index is not free");
		}
		this.drawers[index] = Objects.requireNonNull(item);
		this.dictionnary.put(item.getName(), index);
		this.size++;
	}

	public Item remove(int index) {
		if (index < 0 || index >= this.drawers.length) {
			throw new IllegalArgumentException("Invalid index");
		}
		Item tmp = this.drawers[index];
		this.drawers[index] = null;
		if (tmp != null) {
			this.dictionnary.remove(tmp.getName());
		}
		this.size--;
		return tmp;
	}

	public Item remove(String itemName) {
		Integer index = this.dictionnary.get(Objects.requireNonNull(itemName));
		if (index == null) {
			return null;
		}
		this.dictionnary.remove(itemName);
		return remove(index);
	}

	public int size() {
		return this.size;
	}

	@Override
	public Iterator<Item> iterator() {
		return null;
	}
}
