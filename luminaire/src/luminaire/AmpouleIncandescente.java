package luminaire;

import java.util.Random;


public class AmpouleIncandescente implements Eclairage {    // Implements permet d'implementer la classe 

    /**
     * etat de la lampe : 0 �teinte, 10 allum�e pleine intensit�
     */
    private int etat;

    /**
     * Calcule la probabilité qu'une ampoule tombe en panne
     * 
     * @return 0 l'ampoule fonctione, -1 l'ampoule est en panne
     */
    private int probaPanne() {
        Random alea = new Random();
        if (alea.nextInt(100) < 10) {         // Si jamais c'est inf�rieur a 10% l'ampoule grille     
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
        if (probaPanne() != -1 && etat != -1) {         // Si la proba que elle soit en panne est diff�rent de -1 ( soit grill�e)
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
            etat = 0;   // L'ampoule est alors �teinte a l'etat 0 
        }

    }

    /**
     * Augmente l'intensit� lumineuse de l'ampoule
     */

    public void intensifier() {
        if (etat < 10 && etat != -1) 
        {
            etat++;
        }
    }

    /**
     * Diminuer l'intensit� lumineuse de l'ampoule
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
     * l'�tat de la lampe 0..10 ou -1 si en panne
     */

    public int etat() {
        return etat;   // on retourne l'etat 
    }
    /**
     *  l'�tat de l'objet sous la forme d'une chaine de caract�re
     */
    public String toString() {
        return this.getClass().getName()+" : "+ etat;              // Permet de r�cup�rer l'etat de l'objet  sous forme de cha�ne de caract�re 

    }

}






