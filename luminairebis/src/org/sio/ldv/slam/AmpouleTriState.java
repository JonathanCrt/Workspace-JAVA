package org.sio.ldv.slam;

public class AmpouleTriState extends Ampoule implements Eclairage{
	
	
	

	public AmpouleTriState() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AmpouleTriState(String nom, double proba) {
		super(nom, proba);
		// TODO Auto-generated constructor stub
	}

	public AmpouleTriState(String nom, int etat, double proba) {
		super(nom, etat, proba);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void intensifier() {
		// TODO Auto-generated method stub
		if (etat != -1 && etat < 10) {
            etat += 5;
        }
		
	}

	@Override
	public void diminuer() {
		// TODO Auto-generated method stub
		 if ( etat > 0) {
	            etat -=5;
	        }
		
	}

}
