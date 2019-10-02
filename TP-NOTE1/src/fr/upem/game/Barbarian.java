package fr.upem.game;

import java.util.ArrayList;
import java.util.Objects;

public class Barbarian {
	
	private final String name;
	private final int health;
	private HandItem leftHand;
	private HandItem rightHand;
	private ArrayList <HandItem> inventory;
	
	/**
	 * @param name
	 * @param damage
	 * @param health
	 * @param leftHand
	 * @param rightHand
	 */
	public Barbarian(String name, int health, HandItem  leftHand, HandItem rightHand ) {
		super();
		this.name = name;
		this.health = health;
		this.leftHand = Objects.requireNonNull(leftHand, "left hand of Barbarian is null ! ");
		this.rightHand = Objects.requireNonNull(rightHand, "right hand of Barbarian is null ! ");
		this.inventory = new ArrayList<HandItem>();
	}
	
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(this.getClass().getSimpleName());
		st.append(" ");
		st.append(this.name);
		st.append(" ");
		st.append("*");
		st.append(this.health);
		st.append("*");
		st.append(" L : ");
		st.append(this.leftHand);
		st.append(" R : ");
		st.append(this.rightHand);
		st.append("\n");
		st.append("-----\n");
		for(HandItem h : this.inventory) {
			st.append(h.toString());
			st.append("\n");
		}
		
		st.append("-----");
		
		
		
		return st.toString();
				
		//return (this.getClass().getSimpleName() + " " + this.name + " "  + "*"+ this.health + "*" + " " + "L : " +  this.leftHand +  " " + "R : "+  this.rightHand);
	}

	public String getName() {
		return name;
	}
	
	
	public int attack() {
		
		if(this.leftHand.equals(this.rightHand)) {
			int bonus = 2;
			return (this.leftHand.getDamage() + this.rightHand.getDamage()) + bonus;
		}
		return this.leftHand.getDamage() + this.rightHand.getDamage();
	}
	
	public int defense() {
		
		int newDefense = this.health;
		
		if(this.leftHand instanceof Shield) {
			newDefense += this.leftHand.getDefense();
		}
		if(this.rightHand instanceof Shield) {
			newDefense += this.rightHand.getDefense();
		}
		
		return newDefense;
		
	}
	
	
	public void fight(Barbarian br) {
		
		int defenseAttacker = this.defense();
		int defenseTarget = br.defense();
		
		int attackAttacker = this.attack();
		int attackTarget = br.attack();
		
		while (defenseAttacker > 0 || defenseTarget > 0) {
			
			defenseTarget   -= attackAttacker;
			defenseAttacker -= attackTarget;
			
			if(defenseTarget <= 0 && defenseAttacker >0) {

				System.out.println(this.name + " won the fight!");
				return;
			}
			else if(defenseAttacker <= 0  && defenseTarget >0) {

				System.out.println(br.name + " won the fight!");
				return;
			}
			else {
				System.out.println("nobody won the fight!");
				break;
			}

		}
		
	}

	public void addToInventory(HandItem item) {
		this.inventory.add(item);
	}
	
	// Wrapper
	private HandItem getItemFromInventory(int index) throws IllegalStateException {
		if(this.inventory.isEmpty() || index >= this.inventory.size()) {
			throw new IllegalStateException("Inventory is empty or has not item on this index");
		}
		return this.inventory.get(index);
	}
	
	public void swapLeftItem(int index) {
		this.leftHand = this.getItemFromInventory(index);
	}
	
	public void swapRightItem(int index) {
		this.rightHand = this.getItemFromInventory(index);
	}
	

	
}
