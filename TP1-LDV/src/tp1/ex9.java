package tp1;

import java.util.Scanner;

public class ex9 
{

	public static void main(String[] args) 
	{
		System.out.println("Bienvenue ! Cherchez le nombre secret entre 1 et 10 ! Allez y , c'est a vous !:");
		Scanner scanner = new Scanner(System.in);
		int nbsecret = (int) (Math.random() * 10 + 1) ;
		int nombre;
		int essai = 0;

		do{
			System.out.println("trouver le nombre entre 1 et 10 : ");
			nombre = scanner.nextInt(); 
			essai=essai+1;
		}while ( nbsecret != nombre);
		
		System.out.println("le chiffre secret etait "+nbsecret );
		System.out.println(" vous avez reussi en "+ essai +" "+ "essais");
	     
				
	}
}
