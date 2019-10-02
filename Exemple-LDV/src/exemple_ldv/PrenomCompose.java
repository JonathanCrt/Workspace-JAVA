package exemple_ldv;

import java.util.Scanner;

public class PrenomCompose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrer votre prenom");
		String prenomCompose = scanner.next();
		
		int placeTiret = prenomCompose.indexOf("-");
		String prenom1 = prenomCompose.substring(0,placeTiret );
		String prenom2 = prenomCompose.substring(placeTiret+1 );
		
		String prenom1Minuscule = prenom1.toLowerCase();
		String prenom1PremiereLettreMajuscule = prenom1Minuscule.replaceFirst(prenom1Minuscule.substring(0, 1),prenom1Minuscule.substring(0, 1).toUpperCase());
		
		String prenom2Minuscule = prenom2.toLowerCase();
		String prenom2PremiereLettreMajuscule = prenom2Minuscule.replaceFirst(prenom2Minuscule.substring(0, 1),prenom2Minuscule.substring(0, 1).toUpperCase());
		
		System.out.println(prenom1PremiereLettreMajuscule+"-"+prenom2PremiereLettreMajuscule);
		
		
		
		

	}

}
