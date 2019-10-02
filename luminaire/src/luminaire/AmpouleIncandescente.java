package luminaire;

import java.util.Random;


public class AmpouleIncandescente implements Eclairage {    // Implements permet d'implementer la classe 

    /**
     * etat de la lampe : 0 éteinte, 10 allumée pleine intensité
     */
    private int etat;

    /**
     * Calcule la probabilitÃ© qu'une ampoule tombe en panne
     * 
     * @return 0 l'ampoule fonctione, -1 l'ampoule est en panne
     */
    private int probaPanne() {
        Random alea = new Random();
        if (alea.nextInt(100) < 10) {         // Si jamais c'est inférieur a 10% l'ampoule grille     
            return -1;
        }
        return 0;
    }

    
    /**
     * Constructeur
     */
    public AmpouleIncandescente() 
    {
        etat = 0;
    }

    /**
     * Allume l'ampoule a pleine puissance
     */
  
    public void allumer() {
        if (probaPanne() != -1 && etat != -1) {         // Si la proba que elle soit en panne est différent de -1 ( soit grillée)
            etat = 10;
        } 
        else 
        {
            etat = -1;
        }
    }

    /**
     * Eteint l'ampoule
     */
 
    public void eteindre() {
        if (etat != -1) 
        {
            etat = 0;   // L'ampoule est alors éteinte a l'etat 0 
        }

    }

    /**
     * Augmente l'intensité lumineuse de l'ampoule
     */

    public void intensifier() {
        if (etat < 10 && etat != -1) 
        {
            etat++;
        }
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */

    public void diminuer() {
        if ( etat > 0) 
        {
            etat--;
        }
    }

    /**
     * Permet de connaitre l''etat de l'ampoule
     * 
     * l'état de la lampe 0..10 ou -1 si en panne
     */

    public int etat() {
        return etat;   // on retourne l'etat 
    }
    /**
     *  l'état de l'objet sous la forme d'une chaine de caractére
     */
    public String toString() {
        return this.getClass().getName()+" : "+ etat;              // Permet de récupérer l'etat de l'objet  sous forme de chaîne de caractére 

    }

}






