package tp5_ldv;
import java.util.Scanner;

public class TestLocation {

public static void main(String[] args)  { 
		
		
		Scanner entr�e1 = new Scanner(System.in);
		Scanner entr�e2 = new Scanner(System.in);
		Scanner entr�e3 = new Scanner(System.in);
		Scanner entr�e4 = new Scanner(System.in);
		
		System.out.println("Entrez un nom de r�servation  :  ");
		String nom = entr�e1.next();
		System.out.println("Entrez la cat�gorie voulue E -->30.00� , C-->50.00� ou L-->75.00�  ? :  ");
		String cat = entr�e2.next();
		char cat� = cat.charAt(0);
		System.out.println("Entrez le nombre de jour de r�servation  :  ");
		int jour =entr�e3.nextInt();
		System.out.println("Entrez le nombre de km :  ");
		double km =entr�e4.nextDouble();
		
	    
		
		
		
		Location loc= new Location(nom,cat�,jour,km); 
		
		System.out.println("Voici les informations que vous avez saisies : ");
		System.out.println("Votre nom : "+ loc.getNom());
		System.out.println("La cat�gorie de votre location : "+ loc.getCategorie());
		System.out.println("Le nombre de jour de r�servation :"+loc.getJour() +" jour");
		System.out.println("Le nombre de km parcouru : "+loc.getKm() +"km");
		System.out.println("                          ");
		
		
		
		System.out.println("Votre montant total : "+  loc.montantTotal()+ " �" );
		
		
		System.out.println("Et sur ceci, le d�tail suivant : ");
		System.out.println("                            ");
		System.out.println("Km(s) Suppl�mentaires hors location: "+ loc.kmSupplementaires()+" km");
		System.out.println("donnant lieu au tarif suivant : ");
		System.out.println("Prix km hors location :  "+loc.prixKmSupplementaires());
		
		System.out.println("                             ");
		System.out.println("Montant aux  nombre de jour de location : " +  loc.montantJour() +" �");
		System.out.println("impliquant un montant de location de : "+ loc.montantLocation()+ "�");
		
		
	}	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

