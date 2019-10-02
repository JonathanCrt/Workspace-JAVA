package fr.upem.game;

import java.util.Objects;

public class Ranger {
	private final String name;
	private int health;
	private Weapon wp;
	private int spell;
	
	/**
	 * @param name
	 * @param health
	 * @param wp
	 * @param spell
	 */
	public Ranger(String name, Weapon wp, int health) {
		super();
		this.name = name;
		this.wp = Objects.requireNonNull(wp, "Ranger must have a weapon ! ");
		this.health = health;
		this.spell = 0;
	}

	@Override
	public String toString() {
		StringBuilder st  = new StringBuilder();
		st.append(this.getClass().getSimpleName() + " ");
		st.append(this.name);
		st.append(" *");
		st.append(this.health);
		st.append("*, ");
		st.append(this.wp + ",");
		st.append(" spell = ");
		st.append(this.spell);
		
		return st.toString();
	}
	
	
	public void learnNewSpell(int spell) {
    	if(spell > this.spell) {
    		this.spell = spell;
    	}
    }
	
	
	
	
	
	
	
	
}
