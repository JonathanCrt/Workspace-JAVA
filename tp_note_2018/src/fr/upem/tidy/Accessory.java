package fr.upem.tidy;

import java.util.Objects;

public class Accessory extends AbstractItem {
	private final boolean useful;

	public Accessory(String name, boolean useful, Material material) {
		super(name, material);
		this.useful = Objects.requireNonNull(useful);
	}

	public Accessory(String name, boolean useful, Material material, int timeToLive) {
		super(name, material, timeToLive);
		this.useful = Objects.requireNonNull(useful);
	}

	public boolean isUseful() {
		return this.useful;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Accessory)) {
			return false;
		}
		
		Accessory a = (Accessory)o;
		return super.equals(a) && this.useful == a.useful;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), this.useful);
	}
	
	@Override
	public String toString() {
		String tmp = this.isUseful() ? "utile" : "inutile";
		return "[ACCESSOIRE] - " + tmp + super.toString();
	}

}
