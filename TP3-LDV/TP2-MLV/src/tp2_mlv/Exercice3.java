package tp2_mlv;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Exercice3 {
	
	
	/* 4) */
	public static int[] convertIPAdressToArray(String chaine) {
	
		//CharSequence cs = chaine;
	
		/*
		 * compilation de la regex
		 * La chaine doit être des caractères numériques compris entre 0 et 9, 
		 * contenir  3 fois 1,2 ou 3 caractères numériques suivis  d'une point 
		 * puis une fois 1,2 ou 3 caractères numériques .
		 * Verifiée avec regex101.com
		 */
		Matcher match = Pattern.compile("([0-9]{1,3}.){3}[0-9]{1,3}").matcher(chaine);
		
		
		if(match.matches()) {
			/* Tab de 4 bytes */
			int tabInt[] = new int[4];
			
			match = Pattern.compile("[0-9]{1,3}").matcher(chaine);
			for(int i= 0; match.find() && i< 4; i++) {
				
				/* 
				 * la méthode group () renvoie la sous-séquence d'entrée correspondant au modèle précédent.  */
				 tabInt[i] = Integer.parseInt(match.group());
			}
			 return tabInt;
		}
		
		/* Si aucune correspondance */
		System.out.println("Erreur : Adresse IP incorrecte !");
		return null;
		
	}
	
	public static void main(String[] args) {
		/*
		 * 1)
		 * La java.util.regex.Pattern  permet de créer une représentation compilée d'une expression régulière 
		 * à l'aide de la méthode compile() qui compile l'expression regex dans une instance de la classe.
		 *  
		 * Cette classe permet de  créer un objet Matcher pouvant effectuer des opérations de correspondances 
		 * sur une séquence de chaînes de caractères à partir d'un Pattern (modèle)
		 *  */
		
		/* 2) */
		// compilation de la regex
		Pattern pattern;
		// création d'un "moteur de recherche"
	    Matcher match;
		
		for(String arg : args) {
			pattern = Pattern.compile("[^0-9]*[0-9]+");
			match = pattern.matcher(arg);
			
			/* si sa match (correspondance région et pattern) */
			if(match.matches()) {
				System.out.println(arg);
			}
			
		}
		
		/* 4) (Appel de la méthode de classe ci-dessus)*/
		int[] ip = convertIPAdressToArray("192.10.1.0");
		System.out.println(" \n Tableau contenant l'IP : ");
		for(int i: ip) {
			System.out.println(i);
		}
		
	}
}
