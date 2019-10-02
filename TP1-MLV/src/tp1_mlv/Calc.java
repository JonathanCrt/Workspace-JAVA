package tp1_mlv;
/* Ici, on importe la classe Scanner gr�ce � l'instruction import
 * La classe Scanner se trouve dans la package java.util
 */

import java.util.Scanner;


public class Calc {
	public static void main(String[] args) {
		
		/* Variable 'scanner' de type Scanner(type objet) */ 
		/* Variable 'value' de type integer (type primitif) */
		
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		int value2 = scanner2.nextInt();
		
		/* operations */
		int sum = value + value2;
		int sub = value - value2;
		int prod = value * value2;
		int quot = value / value2;
		int mod = value % value2;
		
		/* nextInt n'est pas une fonction car un appel est r�alis� syntaxiquement avec le "."
		 * nextInt() est une m�thode de la classe,
		 * qui analyse le prochain jeton de l'entr�e en tant qu'entier.
		 * Elle renvoie la saisie de l'utilisateur sous forme de type int */
		
		
		System.out.println("Nombres saisi par l'utilisateur :");
		System.out.println(value);
		System.out.println(value2);
		System.out.println("------------");
		System.out.println("Somme des deux entiers : " + sum);
		System.out.println("Diff�rence des deux entiers : " + sub);
		System.out.println("Produit des deux entiers : " + prod);
		System.out.println("Quotient des deux entiers : " + quot);
		System.out.println("Reste des deux entiers : " + mod);
		
		
	}
}
