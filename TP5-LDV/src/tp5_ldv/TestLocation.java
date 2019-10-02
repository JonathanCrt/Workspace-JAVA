package tp5_ldv;
import java.util.Scanner;

public class TestLocation {

public static void main(String[] args)  { 
		
		
		Scanner entrée1 = new Scanner(System.in);
		Scanner entrée2 = new Scanner(System.in);
		Scanner entrée3 = new Scanner(System.in);
		Scanner entrée4 = new Scanner(System.in);
		
		System.out.println("Entrez un nom de réservation  :  ");
		String nom = entrée1.next();
		System.out.println("Entrez la catégorie voulue E -->30.00€ , C-->50.00€ ou L-->75.00€  ? :  ");
		String cat = entrée2.next();
		char caté = cat.charAt(0);
		System.out.println("Entrez le nombre de jour de réservation  :  ");
		int jour =entrée3.nextInt();
		System.out.println("Entrez le nombre de km :  ");
		double km =entrée4.nextDouble();
		
	    
		
		
		
		Location loc= new Location(nom,caté,jour,km); 
		
		System.out.println("Voici les informations que vous avez saisies : ");
		System.out.println("Votre nom : "+ loc.getNom());
		System.out.println("La catégorie de votre location : "+ loc.getCategorie());
		System.out.println("Le nombre de jour de réservation :"+loc.getJour() +" jour");
		System.out.println("Le nombre de km parcouru : "+loc.getKm() +"km");
		System.out.println("                          ");
		
		
		
		System.out.println("Votre montant total : "+  loc.montantTotal()+ " €" );
		
		
		System.out.println("Et sur ceci, le détail suivant : ");
		System.out.println("                            ");
		System.out.println("Km(s) Supplémentaires hors location: "+ loc.kmSupplementaires()+" km");
		System.out.println("donnant lieu au tarif suivant : ");
		System.out.println("Prix km hors location :  "+loc.prixKmSupplementaires());
		
		System.out.println("                             ");
		System.out.println("Montant aux  nombre de jour de location : " +  loc.montantJour() +" €");
		System.out.println("impliquant un montant de location de : "+ loc.montantLocation()+ "€");
		
		
	}	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

