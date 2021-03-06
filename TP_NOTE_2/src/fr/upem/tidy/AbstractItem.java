package fr.upem.tidy;

import java.util.Objects;

public abstract class AbstractItem implements Item {
	private final String name;
	private final Material material;
	private final int timeToLive;
	private final static int DEFAULT_TTL = 1000;
	
	
	public int requirePositiveTTL(int timeToLive) {
		if(timeToLive < 0) {
			throw new IllegalArgumentException("TTL must be positive");
		}
		return timeToLive;
	}
	
	
	/**
	 * @param name
	 * @param material
	 * @param timeToLive
	 */
	public AbstractItem(String name, Material material, int timeToLive) {
		super();
		this.name = Objects.requireNonNull(name, "name not be null");
		this.material = Objects.requireNonNull(material, "material not be null");
		this.timeToLive = this.requirePositiveTTL(timeToLive);
	}
	
	public AbstractItem(String name, Material material) {
		this.name = Objects.requireNonNull(name, "name not be null");
		this.material = Objects.requireNonNull(material, "material not be null");
		this.timeToLive = DEFAULT_TTL;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Material getMaterial() {
		return material;
	}
	
	@Override
	public int timeToLive() {
		return timeToLive;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof AbstractItem)) {
			return false;
		}
		AbstractItem abs = (AbstractItem)o;
		return  timeToLive == abs.timeToLive 
				&& this.name.equals(abs.getName()) 
				&& this.material.equals(abs.getMaterial());
	}
	
	@Override
	public int hashCode() {

		return this.name.hashCode() + this.material.hashCode() + timeToLive;
	}
	
	
	
}
