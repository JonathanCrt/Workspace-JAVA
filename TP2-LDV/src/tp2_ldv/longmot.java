package tp2_ldv;

import java.util.Scanner;

public class longmot {

	public static void main(String[] args) 
	{
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un mot : ");
    String mot = scanner.next();
    int longueur = mot.length();
    System.out.println("La longueur du mot est de " + longueur +" lettres");
    
	}
}
