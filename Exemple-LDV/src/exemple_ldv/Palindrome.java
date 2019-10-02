package exemple_ldv;

import java.util.Scanner;

class Palindrome
{
	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un mot :");
		String mot = sc.next();
		String motInverse = new String("");
		int longueurMot = mot.length();

		for(int i = (longueurMot-1); i >= 0; i--){
			
			motInverse += mot.charAt(i);

		}
		System.out.println(motInverse);
		
		if(mot.endsWith(motInverse))
			System.out.println("palindrome");
		else
			System.out.println("pas palindrome");

	}

}



