package exemple_ldv;

import java.util.*;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer un nombre de ligne ");
		int nb = scanner.nextInt();
		int nbEtoile = 1;
		
		for (int i = 0 ; i < nb ; i++){
			
			for (int j = 0 ; j < nbEtoile ; j++){
				System.out.print("*");
			}
			nbEtoile++;
			System.out.println();
		}

		
		
		

	}

}
