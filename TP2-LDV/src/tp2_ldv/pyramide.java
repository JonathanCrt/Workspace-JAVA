package tp2_ldv;

import java.util.Scanner;

public class pyramide {

	
	public static void main(String[] args) 
	{
		
		
		Scanner entree = new Scanner(System.in);
		System.out.println("Cb de lignes ?: ");
		
		// Initialisation des variables nécessaires  : 

		int nb = entree.nextInt();
		int Etoile = 1;
		int Espace = nb -1 ;
		
		//Boucle(s) imbriqué pr les etoiles & l'espace de la figure : 
		           // Boucle for : 1.Initilisation 2. Condition 3. incrementation 
		for (int x = 0 ; x < nb ; x++){
			//boucle pour l'espace : 
			for (int y = 0 ; y < Espace ; y++){
				System.out.print(" ");
			}
			//Boucle pour le nombre d'étoiles : 
			for (int z = 0 ; z < Etoile ; z++){
				System.out.print("*");
			}
			//incrementation de fin de boucle : 
			Etoile+=2;
			Espace--;
			System.out.println();
		}

	}

}
