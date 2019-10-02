package tp1;
import java.util.Scanner;


public class ex3 
{

		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("entrez votre departement :");
			int depart = sc.nextInt();
		
					if (depart>=75 && depart <=94){
					System.out.println("Vous habitez en Idf! ");
				}
		    else if (depart<75 || depart <99) {
						System.out.println("Vous habitez ailleurs! ");
				}
		    else if (depart>99) {
					    
			   System.out.println("Erreur! ");
		   }

		}
}

