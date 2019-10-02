package tp3_ldv;

import java.util.Scanner;

public class Frequence_mot {

	public static void main(String[] args) {
		
		Scanner entrée = new Scanner(System.in)	;
		
		int [] frequence = new int[26];
		
		System.out.println("entrer une phrase : ");
		String phrase = entrée.nextLine();
		
		
		String [] tabMot = phrase.split(" ");
		
		for(String mot : tabMot){
			frequence [mot.length()] += 1;
		}
			
		//boucle pour les ":"
		for (int i = 0 ; i < frequence.length ; i++){
			 if ( frequence[i] != 0)
				 System.out.println( frequence[i] + " : " + i);
		}
		
		

	}

}
