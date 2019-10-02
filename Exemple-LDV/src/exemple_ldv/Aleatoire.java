package exemple_ldv;
import java.util.Scanner;


public class Aleatoire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nbAleatoire = (int) (Math.random() * 10 + 1) ;
		int nombre;
		int nombreEssai = 0;

		do{
				System.out.println("trouver le nombre entre 0 et 10 : ");
				nombre = scanner.nextInt(); 
				nombreEssai++;
		}while ( nbAleatoire != nombre);
		
		System.out.println("le nombre aléatoire etait "+nbAleatoire );
		System.out.println(" vous l'avez trouvé en "+nombreEssai + "essais");
		
		

	}

}
