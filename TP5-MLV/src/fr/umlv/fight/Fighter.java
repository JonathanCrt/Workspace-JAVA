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
		 * 1)  Un g�n�rateur pseudo-aleatoire g�n�re une s�quence de nombres pr�sentant certaines propri�t�s du hasard.
		 * Ces nombres ne sont en revanche pas totalement al�atoire mais ont simplement des propri�t�s id�ales.
		 * La graine (seed) est un nombre utilis� pour l'initialisation du g�n�rateur, elle represente un etat quelconque.
		 * Toute la s�quence de nombres al�atoires produits par le g�n�rateur d�coule de fa�on d�terministe de la valeur de la graine.
		 * 
		 * 3) Un champ doit toujours �tre avec une visibilit� private ou protected pour garantir l'encapsulation des donn�es, 
		 * de mani�re � resteindre l'acc�s\modification d'un champ � une quantit� finie de code.
		 * Un champ ne doit pas avoir d'acc�ssibilit�s public de mani�re a ne laisser aucune classe ext�rieure y acc�der ! 
		 * 
		 * 5) On peut en conclure que le copier/coller est une tr�s mauvaise pratique.(principe prog : Don't repeat yourself!)
		 * 6) La m�thode roolDice() doit avoir une visibilit� protected dans la mesure ou elle doit �tre accessible 
		 * dans la classe h�rit� mais pas en dehors du package, en revanche.
		 * 9)-- sous-typage --
		 * 	    On parle de sous-typage, d�s qu'une classe fille est un sous-type d'une autre classe m�re
		 * 		Ici, notre classe Fighter est un sous-type de Robot, et nos deux classes sont 2 sous-types de la classe de base Object.
		 * 
		 *  -- Polymorphisme -- 
		 *     On parle de polymorphisme d�s qu'on substitue une methode a une autre en fonction de la 
	     *     classe de l'objet sur lequel on appelle la methode. Par exemple, dans cette classe Fighter, 
	     *     les m�thodes roolDice() et toString() sont red�finies (avec l'annotation Override). 
	     *     Ces deux m�thodes sont alors appel�s durant la phase de RUN-TIME (execution).
		 */
		

 	
	
		
	}
	
	
}
