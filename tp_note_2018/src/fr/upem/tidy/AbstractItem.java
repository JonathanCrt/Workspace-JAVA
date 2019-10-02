package fr.upem.tidy;

import java.util.Objects;

public abstract class AbstractItem implements Item {
	private final String name;
	private final Material material;
	private final int timeToLive;
	public final static int DEFAULT_TTL = 1000;

	public AbstractItem(String name, Material material, int timeToLive) {
		this.name = Objects.requireNonNull(name);
		this.material = Objects.requireNonNull(material);
		this.timeToLive = Objects.requireNonNull(timeToLive);
	}

	public AbstractItem(String name, Material material) {
		this.name = Objects.requireNonNull(name);
		this.material = Objects.requireNonNull(material);
		this.timeToLive = DEFAULT_TTL;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int timeToLive() {
		return this.timeToLive;
	}

	@Override
	public Material getMaterial() {
		return this.material;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof AbstractItem)) {
			return false;
		}
		AbstractItem abItem = (AbstractItem) o;
		return this.name.equals(abItem.name) && this.material.equals(abItem.getMaterial())
				&& this.timeToLive == abItem.timeToLive();
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() ^ this.material.hashCode() ^ this.timeToLive;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" - ");
		sb.append(this.getName());
		sb.append(" (");
		sb.append(this.getMaterial());
		sb.append(") - ");
		sb.append("{");
		sb.append(this.timeToLive());
		sb.append("}");
		return sb.toString();
	}
}
