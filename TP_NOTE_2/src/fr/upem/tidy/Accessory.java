package fr.upem.tidy;

import java.util.Objects;

public class Accessory extends AbstractItem {
	private final boolean useful;

	/**
	 * @param name
	 * @param material
	 * @param timeToLive
	 * @param useful
	 */
	public Accessory(String name, boolean useful, Material material, int timeToLive) {
		super(name, material, timeToLive);
		this.useful = Objects.requireNonNull(useful);
	}
	
	
	public Accessory(String name, boolean useful, Material material) {
		super(name, material);
		this.useful = Objects.requireNonNull(useful);
	}
	
	
	public boolean isUseful() {
		return this.useful;
	}
	
	
	// [ACCESSOIRE] - inutile -  cravate � pois (SILK) - {2000}
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("[ACCESSOIRE] - ")
		.append(this.isUseful() ? "utile" : "inutile")
		.append(" - ")
		.append(this.getName())
		.append(" (")
		.append(this.getMaterial())
		.append(") - {")
		.append(this.timeToLive())
		.append("}");
		
		return st.toString();
	}
	
	
	
}
