package fr.umlv.fight;

public class Robot {
	
	private final  String nom;
	protected  int ptDeVies;
	
	
	public Robot(String nom) {
		super();
		this.nom = nom;
		this.ptDeVies = 10;
	}
	
	@Override
	public String toString() {
		return ("Robot " + this.nom);
	}
	

	public String getNom() {
		return nom;
	}

	/**
	 * 
	 * @param rb
	 */
	public void fire(Robot rb) throws IllegalArgumentException {
		
		if(rb.isDead()) {
			throw new IllegalArgumentException(rb + " est DEAD impossible de lui tirer dessus ! .");
		}
		if(rollDice()) {
			rb.ptDeVies -= 2;
			System.out.println("Oh! " + rb + " a été touché par " + this + ".");
			if(rb.ptDeVies < 0) {
				rb.ptDeVies = 0; 
			}
		}
		
	}
	/**
	 * 
	 * @return boolean
	 */
	public  Boolean isDead() {
		if(this.ptDeVies == 0) {
			System.out.println("Le "+ getClass().getSimpleName() +" "+  this.nom + " est mort ");
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	protected boolean rollDice() {
		return true;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Robot bob = new Robot("bob");
	    System.out.println(bob);  // affiche "Robot bob"
	}
}
