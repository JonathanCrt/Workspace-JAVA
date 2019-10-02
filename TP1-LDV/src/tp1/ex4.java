package tp1;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez le 1er chiffre :");
		int chiff1 = sc.nextInt();
		
		Scanner ip = new Scanner(System.in);
		System.out.println("entrez le 2eme chiffre :");
		int chiff2 = ip.nextInt();
		
		/*Editer l'opération : */
		int operation = chiff1*chiff2;
		
		
		if (operation<0){
			System.out.println("Le produit est négatif ! ");
		}
		else {
			System.out.println("Le produit est positif ! ");
		}
	}
}

