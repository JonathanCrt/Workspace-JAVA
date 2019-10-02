package tp2_ldv;

import java.util.*;

public class triangle {

	
	public static void main(String[] args) {
		
		//Demande du nb de lignes : 
		Scanner entree = new Scanner(System.in);
		System.out.println("Combien de  lignes désirez vous ? ");
		
		//Initilisation des nvlles variables:
		int nb = entree.nextInt();
		int Etoile = 1;
		
		//simple boucle imbriqué : 
		for (int x = 0 ; x < nb ; x++){
			
			for (int y = 0 ; y < Etoile ; y++){
				System.out.print("*");
			}
			// incrementation de fin de boucle : 
			Etoile++;
			System.out.println();
		}

		
	}

}
		

	