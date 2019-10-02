package tp2_ldv;


import java.util.*;

public class nb_ami {

	public static void main(String[] args) {
		
		Scanner entrée = new Scanner(System.in);
		int somme1 = 0 ;
		int somme2 = 0 ;
		
		// Demande du 1er nombre: 
		System.out.println("entrer un 1er nombre : ");
		int nb1 = entrée.nextInt();
		 
		String nombre1=String.valueOf(nb1);
		
		for(int i = 0 ; i < nombre1.length() ; i++){
			// Initialisation , Condition, incrementation 
			somme1 +=  Character.getNumericValue(nombre1.charAt(i));
		}
		
        // Demande du 2éme nombre : 
		System.out.println("entrer un 2éme nombre : ");
		int nb2 = entrée.nextInt();
		
		//de meme
		String nombre2=String.valueOf(nb2);
		for(int i = 0 ; i < nombre2.length() ; i++){
			somme2 +=  Character.getNumericValue(nombre2.charAt(i));
		}
        //Test &comparaison : 
		if ( somme1 == somme2)
			System.out.println(" Les  2 nombres sont amis ! ");
		else
			System.out.println(" Les 2 nombres ne sont pas amis");
	}

	
}
