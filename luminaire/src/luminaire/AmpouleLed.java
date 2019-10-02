package luminaire;

import java.util.Random;

public class AmpouleLed implements Eclairage {
 

	  private int etat;
	  
	  
	  
	  private int probaPanne() {
	        Random alea = new Random();
	        if (alea.nextInt(100) < 1) {
	            return -1;
	        }
	        return 0;
	    }
	
	  
	  public AmpouleLed() {
	        etat = 0;
	    }


	
	public void allumer() {
		  if ( probaPanne() != -1 && etat != -1 ) {
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
        if (etat != -1 && etat < 10) {
            etat++;
        }
    }

   
 
    public void diminuer() {
        if ( etat > 0) {
            etat--;
        }
    }

   
  
    public int etat() {
        return etat;
    }

    
    public String toString() {
        return this.getClass().getName()+" : "+etat;
    }
	 
}
