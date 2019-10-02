package exemple_ldv;


import java.util.*;

public class NombreAmi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int somme1 = 0 ;
		int somme2 = 0 ;
		
		System.out.println("entrer un premier nombre : ");
		int nb1 = scanner.nextInt();
		 
		String nombre1=String.valueOf(nb1);
		for(int i = 0 ; i < nombre1.length() ; i++){
			somme1 +=  Character.getNumericValue(nombre1.charAt(i));
		}
		

		System.out.println("entrer un deuxième nombre : ");
		int nb2 = scanner.nextInt();
		
		String nombre2=String.valueOf(nb2);
		for(int i = 0 ; i < nombre2.length() ; i++){
			somme2 +=  Character.getNumericValue(nombre2.charAt(i));
		}

		if ( somme1 == somme2)
			System.out.println("nombres amis");
		else
			System.out.println("pas amis");
	}

	
}


