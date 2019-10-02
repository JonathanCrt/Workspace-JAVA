package tp2_ldv;

import java.util.Scanner;

public class lettremot {



	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un mot : ");
		String mot = scanner.next();
		char debut = mot.charAt(0);
		int groupe=mot.length();
		int test =groupe -1 ;
		char fin2 = mot.charAt(test);
		int longueur = mot.length();
		
		System.out.println("la premiére lettre du mot "+  mot + " est " + debut);
		System.out.println("la derniére lettre  du mot "+  mot + " est " + fin2 );
		System.out.println("la longueur du mot "+  mot + " est " + longueur + " lettres ");
	}

	


}
