package exemple_ldv;

import java.util.Scanner;

public class Pyramide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer un nombre de ligne ");
		int nb = scanner.nextInt();
		int nbEtoile = 1;
		int nbEspace = nb -1 ;
		
		for (int i = 0 ; i < nb ; i++){
			
			for (int k = 0 ; k < nbEspace ; k++){
				System.out.print(" ");
			}
			
			for (int j = 0 ; j < nbEtoile ; j++){
				System.out.print("*");
			}
			
			nbEtoile+=2;
			nbEspace--;
			System.out.println();
		}

	}

}
