package org.sio.ldv.slam;

public class App {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmpouleLed eclairage = new  AmpouleLed("Incandescente",0,1);
		/**
	     * Cycles d'éclairage et d'extinction d'une ampoule
	     */
		int nbCycles = 0;
        do{
            eclairage.allumer();
           while(eclairage.etat() > 0 ){
                eclairage.diminuer();
            }
            System.out.println(eclairage.toString());
            nbCycles ++;
        }while (nbCycles < 1000 && eclairage.etat() != -1);
	    
        System.out.println("nombre de cycles "+nbCycles);
	}

}
