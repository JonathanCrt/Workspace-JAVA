package org.sio.ldv.slam;

public class AmpouleIncandescente extends Ampoule implements Eclairage {

    
    /**
     * Constructeur
     */
    public AmpouleIncandescente() {
        etat = 0;
    }

    public AmpouleIncandescente(String nom, double proba) {
		super(nom, proba);
		// TODO Auto-generated constructor stub
	}

	public AmpouleIncandescente(String nom, int etat, double proba) {
		super(nom, etat, proba);
		// TODO Auto-generated constructor stub
	}

	/**
     * Augmente l'intensité lumineuse de l'ampoule
     */
    @Override
    public void intensifier() {
        if (etat != -1 && etat < 10) {
            etat++;
        }
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    @Override
    public void diminuer() {
        if ( etat > 0) {
            etat--;
        }
    }

    /**
     * Permet de connaître l'état de l'ampoule
     * 
     * @return l'état de la lampe 0..10 ou -1 si en panne
     */
    @Override
    public int etat() {
        return etat;
    }

    /**
     * @return l'état de l'objet sous la forme d'une chaîne de caractères
     */
    public String toString() {
        return this.getClass().getName()+" : "+etat;

    }

}






