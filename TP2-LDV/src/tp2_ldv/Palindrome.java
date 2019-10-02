package tp2_ldv;

import java.util.Scanner;

class Palindrome
{
	public static void main (String[] args){

		Scanner palindrome = new Scanner(System.in);
		System.out.println("entrez un mot :");
		String mot = palindrome.next();
		String motinverse = new String("");
		int longMot = mot.length();

		for(int i = (longMot-1); i >= 0; i--){
			//Initialisation -- Condition --Incrementation 
			motinverse += mot.charAt(i);

		}
		//Affichage du mot inversé
		System.out.println(motinverse);
		
		//affichage du résultat
		if(mot.endsWith(motinverse))
			System.out.println("le mot est palindrome");
		else
			System.out.println("Le mot n'est pas palindrome");

	}

}
