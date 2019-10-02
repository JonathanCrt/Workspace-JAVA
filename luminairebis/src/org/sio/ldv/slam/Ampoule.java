package org.sio.ldv.slam;

import java.util.Random;

public class Ampoule {
	
	protected String nom;
	protected int etat;
	protected double proba;
	
	
	
	
	public Ampoule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Ampoule(String nom, double proba) {
		super();
		this.nom = nom;
		this.proba = proba;
	}
	
	

	public Ampoule(String nom, int etat, double proba) {
		super();
		this.nom = nom;
		this.etat = etat;
		this.proba = proba;
	}



	/**
     * Calcule la probabilité qu'une ampoule tombe en panne
     * 
     * @return 0 l'ampoule fonctione, -1 l'ampoule est en panne
     */
    private int probaPanne() {
        Random alea = new Random();
        if (alea.nextInt(100) < this.proba) {
            return -1;
        }
        return 0;
    }
	
    public void allumer() {
        if (etat != -1 && probaPanne() != -1) {
            etat = 10;
        } else {
            etat = -1;
        }
    }
    
    public void eteindre() {
        if (etat != -1) {
            etat = 0;
        }

    }
    
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
