package luminaire;

import java.util.Random;


public class AmpouleTube implements Eclairage {
    
    private int etat;

    
     
    private int probaPanne() {
        Random alea = new Random();
        if (alea.nextInt(100) < 5) {
            return -1;
        }
        return 0;

    }

   
    public AmpouleTube() {
        etat = 0;
    }

    
    public void allumer() {
        if (etat != -1 && probaPanne() != -1)
        {
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


    public void intensifier() {
        allumer();   // on implémente la méthode allumer()
    }

    
    public void diminuer() {
        eteindre();            // on implémente la méthode éteindre()
    }
    

    
    
    public int etat() {
        return etat;
    }

  
    public String toString() {
        return this.getClass().getName() + " : " + etat;
    }

}
	
	
	
	
	
	
	
	


