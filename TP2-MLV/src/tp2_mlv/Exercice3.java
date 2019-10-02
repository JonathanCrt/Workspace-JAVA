package tp2_mlv;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Exercice3 {
	
	
	/* 4) */
	public static int[] convertIPAdressToArray(String chaine) {
	
		//CharSequence cs = chaine;
	
		/*
		 * compilation de la regex
		 * La chaine doit �tre des caract�res num�riques compris entre 0 et 9, 
		 * contenir  3 fois 1,2 ou 3 caract�res num�riques suivis  d'une point 
		 * puis une fois 1,2 ou 3 caract�res num�riques .
		 * Verifi�e avec regex101.com
		 */
		Matcher match = Pattern.compile("([0-9]{1,3}.){3}[0-9]{1,3}").matcher(chaine);
		
		
		if(match.matches()) {
			/* Tab de 4 bytes */
			int tabInt[] = new int[4];
			
			match = Pattern.compile("[0-9]{1,3}").matcher(chaine);
			for(int i= 0; match.find() && i< 4; i++) {
				
				/* 
				 * la m�thode group () renvoie la sous-s�quence d'entr�e correspondant au mod�le pr�c�dent.  */
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
		 * La java.util.regex.Pattern  permet de cr�er une repr�sentation compil�e d'une expression r�guli�re 
		 * � l'aide de la m�thode compile() qui compile l'expression regex dans une instance de la classe.
		 *  
		 * Cette classe permet de  cr�er un objet Matcher pouvant effectuer des op�rations de correspondances 
		 * sur une s�quence de cha�nes de caract�res � partir d'un Pattern (mod�le)
		 *  */
		
		/* 2) */
		// compilation de la regex
		Pattern pattern;
		// cr�ation d'un "moteur de recherche"
	    Matcher match;
		
		for(String arg : args) {
			pattern = Pattern.compile("[^0-9]*[0-9]+");
			match = pattern.matcher(arg);
			
			/* si sa match (correspondance r�gion et pattern) */
			if(match.matches()) {
				System.out.println(arg);
			}
			
		}
		
		/* 4) (Appel de la m�thode de classe ci-dessus)*/
		int[] ip = convertIPAdressToArray("192.10.1.0");
		System.out.println(" \n Tableau contenant l'IP : ");
		for(int i: ip) {
			System.out.println(i);
		}
		
	}
}
