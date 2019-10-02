package tp2_ldv;

import java.util.Scanner;

public class carre {

	
	public static void main(String[] args) {
		
		// Demande du nb de lignes
		Scanner entrée = new Scanner(System.in);
		System.out.println("Combien de lignes voulez vous ? :  ");
		
		int nb = entrée.nextInt();
		// traduction en entier 
		
		for (int i = 0 ; i < nb ; i++){
		// Ini , Condition , Incre
			for (int j = 0 ; j < nb ; j++){
				System.out.print("*");
			}
			System.out.println(); // Affichage
		}

	}
}
