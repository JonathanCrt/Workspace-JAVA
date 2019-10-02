package luminaire;

public class Luminaire implements Eclairage {

    private AmpouleIncandescente ampoule1;
    private AmpouleIncandescente ampoule2;
    private AmpouleIncandescente ampoule3;
    private AmpouleIncandescente ampoule4;

    
    /**     * Constructeur     
     * * cr�e un Luminaire avec 4 ampoules Incandescente 
     * mais il est possible d'impl�menter  un autre type aux 4 ampoules     */ 
    
    public Luminaire() {
        ampoule1 = new AmpouleIncandescente();
        ampoule2 = new AmpouleIncandescente();
        ampoule3 = new AmpouleIncandescente();
        ampoule4 = new AmpouleIncandescente();

    }

  /*** Comme dit dans l'enonc� c'est 4 ampoules qui sont allum�es a la fois *****/
    public void allumer() {
        ampoule1.allumer();
        ampoule2.allumer();
        ampoule3.allumer();
        ampoule4.allumer();

    }

 /*** De m�me ***/
    public void eteindre() {
        ampoule1.eteindre();
        ampoule2.eteindre();
        ampoule3.eteindre();
        ampoule4.eteindre();

    }

  
/*** La variation d'intensit�  est possible sur le luminaire   ***/

    public void diminuer() {
        ampoule1.diminuer();
        ampoule2.diminuer();
        ampoule3.diminuer();
        ampoule4.diminuer();

    }
    
    public void intensifier() {
        ampoule1.intensifier();
        ampoule2.intensifier();
        ampoule3.intensifier();
        ampoule4.intensifier();
    }
    
  
    public int etat() {
        int etat;
        etat = ampoule1.etat();
        if (ampoule2.etat() > etat) {
            etat = ampoule2.etat();
        }
        if (ampoule3.etat() > etat) {
            etat = ampoule3.etat();
        }
        if (ampoule4.etat() > etat) {
            etat = ampoule4.etat();
        }
        return etat;  /**   return va retourner l'�tat du luminaire  ****/
    }
    /**
     *  Controle  l'�tat du luminaire si il est en panne (-1) ou de 0 a 10  
     *    Le r�sultat total  est la plus grande valeur de tout les etats  des 4 ampoules du luminaire
     * 
     
     */
    
    
    /** Simple m�thode toString ***/
    
    public String toString() {
        return  "Etat du luminaire : \n"+ this.ampoule1+"\n" + this.ampoule2+" \n"+ this.ampoule3+"\n"+ this.ampoule4+"\n";
    }
   

}