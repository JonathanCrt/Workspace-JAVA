package fr.upem.tidy;

import java.util.Objects;

public class ClothingItem extends AbstractItem {
	private final Size size;

	public ClothingItem(String name, Size size, Material material, int timeToLive) {
		super(name, material, timeToLive);
		this.size = Objects.requireNonNull(size);
	}

	public ClothingItem(String name, Size size, Material material) {
		super(name, material);
		this.size = Objects.requireNonNull(size);
	}

	public Size getSize() {
		return this.size;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ClothingItem)) {
			return false;
		}
		
		ClothingItem c = (ClothingItem)o;
		return super.equals(c) && this.size == c.size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.size);
	}
	

	@Override
	public String toString() {
		return "[VETEMENT] - " + this.size + super.toString();
	}

}
