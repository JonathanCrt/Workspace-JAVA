package tp2_ldv;

import java.util.Scanner;


public class maj_min {
	public static void main(String[] args) 
	{
	
	//Demande du nom : 
	Scanner nm = new Scanner(System.in);
    System.out.println("Entrez votre nom : ");
    String nom = nm.nextLine();
    int longnom = nom.length();
    		
    //transformation en majuscule et affichage : 
    System.out.println( nom.toUpperCase()+","+  longnom+" lettres");
    
    //Demande du pr�nom : 
    Scanner pr = new Scanner(System.in);
    System.out.println("Entrez votre pr�nom : ");
    String prenom = pr.nextLine();
    int longpre = prenom.length();
    
    //transformation du pr�nom en minuscule except� la  premi�re lettre : 
    String nouveau=prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase();
    System.out.println(nouveau + ","+ longpre +" lettres" );
    
  
    
     
	}

}
