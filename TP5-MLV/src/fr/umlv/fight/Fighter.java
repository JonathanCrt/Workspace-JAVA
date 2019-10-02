package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {
	
	
	private final Random random;
	
	/**
	 * @param nom
	 * @param seed
	 */
	public Fighter(String nom, int seed) {
		super(nom);
		random = new Random(seed);
	}
	
	@Override
	public String toString() {
		return (this.getClass().getSimpleName() + " " + this.getNom());
	}
	
	@Override
	protected boolean rollDice() {
		return random.nextBoolean();
	}
	
	/*
	public  void testFire(Fighter human, Robot rb) {
		Random rand = new Random();
		
		boolean shoot = rand.nextBoolean();
		
		System.out.println("Success shoot ? : " + shoot);
		
		if(shoot) {
			rb.setPtDeVies(ptDeVies-2);
			if(rb.getPtDeVies() < 0) {
				rb.setPtDeVies(0); 
			}
			
		}
		
	}
	*/

	public static void main(String[] args) {
		/*
		 * 1)  Un générateur pseudo-aleatoire génère une séquence de nombres présentant certaines propriétés du hasard.
		 * Ces nombres ne sont en revanche pas totalement aléatoire mais ont simplement des propriétés idéales.
		 * La graine (seed) est un nombre utilisé pour l'initialisation du générateur, elle represente un etat quelconque.
		 * Toute la séquence de nombres aléatoires produits par le générateur découle de façon déterministe de la valeur de la graine.
		 * 
		 * 3) Un champ doit toujours être avec une visibilité private ou protected pour garantir l'encapsulation des données, 
		 * de manière à resteindre l'accès\modification d'un champ à une quantité finie de code.
		 * Un champ ne doit pas avoir d'accéssibilités public de manière a ne laisser aucune classe extérieure y accéder ! 
		 * 
		 * 5) On peut en conclure que le copier/coller est une très mauvaise pratique.(principe prog : Don't repeat yourself!)
		 * 6) La méthode roolDice() doit avoir une visibilité protected dans la mesure ou elle doit être accessible 
		 * dans la classe hérité mais pas en dehors du package, en revanche.
		 * 9)-- sous-typage --
		 * 	    On parle de sous-typage, dés qu'une classe fille est un sous-type d'une autre classe mère
		 * 		Ici, notre classe Fighter est un sous-type de Robot, et nos deux classes sont 2 sous-types de la classe de base Object.
		 * 
		 *  -- Polymorphisme -- 
		 *     On parle de polymorphisme dès qu'on substitue une methode a une autre en fonction de la 
	     *     classe de l'objet sur lequel on appelle la methode. Par exemple, dans cette classe Fighter, 
	     *     les méthodes roolDice() et toString() sont redéfinies (avec l'annotation Override). 
	     *     Ces deux méthodes sont alors appelés durant la phase de RUN-TIME (execution).
		 */
		

 	
	
		
	}
	
	
}
