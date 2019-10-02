package exemple_ldv;

import java.util.Scanner;

public class Carre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer un nombre de ligne ");
		int nb = scanner.nextInt();
		
		for (int i = 0 ; i < nb ; i++){
						
			for (int j = 0 ; j < nb ; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
