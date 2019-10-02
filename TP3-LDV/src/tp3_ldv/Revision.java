package tp3_ldv;

public class Revision {

	public static void main(String[] args) {
		//Initialisation des variables  nécéssaires a l'exercice : 
		
		int nbsecret = (int) (Math.random() * 101  );
		int test = 0 ;
		int random = 0 ;
		int nombre_1,nombre_2,nombre_3 ;
		int tirage2 = 0 ;
		
		//faire ceci :
		
		do {
			random = (int) (Math.random() * 101  );
			test++;
			
		} while( nbsecret != random); //tant que le nb secret est différent de random
		
		System.out.println(" nombre trouvé en "+test+" test.");
	   
		
		do {
			nombre_1 = (int) (Math.random() * 101  );  
			nombre_2 = (int) (Math.random() * 101  );
			nombre_3 = (int) (Math.random() * 101  );
			System.out.println(nombre_1+" "+nombre_2+" "+nombre_3); 
			tirage2++;
			
		} while( nombre_1%2!=0 || nombre_2%2!=1 || nombre_3%2!=1); //Permettre la suite de nb pair et impair 
				// Pair     Impair       Impair
		System.out.println("nombre de tirages :  "+ tirage2);

	}

}