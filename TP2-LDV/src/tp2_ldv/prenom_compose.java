package tp2_ldv;

import java.util.Scanner;

public class prenom_compose {

	
	public static void main(String[] args) {
		
		Scanner pr = new Scanner(System.in);
		System.out.println("entrez votre prenom :");
		String prenomcompose = pr.nextLine();
		
		int tiret = prenomcompose.indexOf("-");
		String prenom1 = prenomcompose.substring(0,tiret );
		String prenom2 = prenomcompose.substring(tiret+1 );
		
		
		String prenom1Minuscule = prenom1.toLowerCase();
		String prenom1PremiereLettreMajuscule = prenom1Minuscule.replaceFirst(prenom1Minuscule.substring(0, 1),prenom1Minuscule.substring(0, 1).toUpperCase());
		
		String prenom2Minuscule = prenom2.toLowerCase();
		String prenom2PremiereLettreMajuscule = prenom2Minuscule.replaceFirst(prenom2Minuscule.substring(0, 1),prenom2Minuscule.substring(0, 1).toUpperCase());
		
		System.out.println(prenom1PremiereLettreMajuscule+"-"+prenom2PremiereLettreMajuscule);
	}
}