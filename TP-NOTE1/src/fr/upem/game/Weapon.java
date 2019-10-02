package fr.upem.game;

import java.util.Objects;

public class Weapon implements HandItem {
	private final String name;
	private final int damage;
	/**
	 * @param name
	 * @param damage
	 */
	public Weapon(String name, int damage) {
		super();
		this.name = Objects.requireNonNull(name, "name null");
		this.damage = damage;
	}
	
	
	@Override
	public String toString() {
		return (this.name + "(" + this.damage  + ")");
	}

	@Override
	public int getDamage() {
		return this.damage;
	}
	
	@Override
	public int getDefense() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		// Verifie si l'objet o est du même type que Weapon
		if(!(o instanceof Weapon)){
			return false;
		}
		Weapon w = (Weapon)o;
		return (this.name.equals(w.name)) &&  (this.damage == w.damage);
	}
	
	@Override 
	public int hashCode() {
		return this.name.hashCode() + this.damage;
	}
	
	
	
	

	
}
