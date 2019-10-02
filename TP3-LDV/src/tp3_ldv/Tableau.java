package tp3_ldv;

import java.util.ArrayList; //Recherche de la classe ArrayList
import java.util.List;

public class Tableau {

	public static void main(String[] args) {
				
		List<Integer> listEntier = new ArrayList<Integer>();
		List<Integer> pair = new ArrayList<Integer>();
		
		for (int i = 0; i < 10 ; i++){
			int nbsecret = (int) (Math.random() * 101  );
			listEntier.add(nbsecret);
			
			if (nbsecret % 2 == 0)
				pair.add(nbsecret);
		}
		System.out.println("liste des nombres du tableau");
		for (int nombre : listEntier){        //foreach version java 
			System.out.println(nombre);			  
		}
		
		System.out.println("liste des nombres pairs");
		for (int nombre : pair){        //foreach version java poue les nombre pairs
			System.out.println(nombre);
		}
		
	}


}