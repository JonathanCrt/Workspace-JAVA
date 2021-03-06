package fr.upem.tidy;

import java.util.Objects;

public class ClothingItem extends AbstractItem {
	private final Size size;

	/**
	 * @param name
	 * @param size
	 * @param material
	 * @param timeToLive
	 */
	public ClothingItem(String name, Size size, Material material, int timeToLive) {
		super(name, material, timeToLive);
		this.size = Objects.requireNonNull(size, "size not be null");
	}
	

	/**
	 * @param name
	 * @param size
	 * @param material
	 */
	public ClothingItem(String name, Size size, Material material) {
		super(name, material);
		this.size = Objects.requireNonNull(size, "size not be null");
	}
	


	public Size getSize() {
		return size;
	}
	

	// [VETEMENT] - XXL - Jeans bleu (COTTON) - {1000}
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("[VETEMENT] - ")
		.append(this.size)
		.append(" - ")
		.append(this.getName())
		.append(" (")
		.append(this.getMaterial())
		.append(") - {")
		.append(this.timeToLive())
		.append("}");
		
		return st.toString();
	}
	

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof ClothingItem)) {
			return false;
		}
		ClothingItem clt = (ClothingItem)o;
		return  super.equals(clt) && this.size.equals(clt.size);
	}
	
	@Override
	public int hashCode() {

		return super.hashCode() + this.size.hashCode();
	}
	
	
	
	
	
}
