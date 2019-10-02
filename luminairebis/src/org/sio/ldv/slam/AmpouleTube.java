package org.sio.ldv.slam;

public class AmpouleTube extends Ampoule implements Eclairage {
    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */


    /**
     * Constructeur
     */
    public AmpouleTube() {
        etat = 0;
    }

    

   
    public AmpouleTube(String nom, double proba) {
		super(nom, proba);
		// TODO Auto-generated constructor stub
	}




	public AmpouleTube(String nom, int etat, double proba) {
		super(nom, etat, proba);
		// TODO Auto-generated constructor stub
	}




	/**
     * Augmente l'intensité lumineuse de l'ampoule
     */
    public void intensifier() {
        allumer();
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    public void diminuer() {
        eteindre();
    }

    /**
     * Permet de connaître l'état de l'ampoule
     * 
     * @return l'état de la lampe 0..10 ou -1 si en panne
     */
    public int etat() {
        return etat;
    }

    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    public String toString() {
        return this.getClass().getName() + " : " + etat;
    }

}