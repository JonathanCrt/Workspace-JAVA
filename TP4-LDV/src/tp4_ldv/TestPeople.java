package tp4_ldv;


public class TestPeople
{


     
	public static void main(String[] args) 
	{ 
		
		
		
		
		
		People Variable= new People("Jonathan",19,1.63,60,new Adresse("77 rue du général leclerc",77170,"Brie Comte Robert"));
        
		System.out.println("Votre nom : "+Variable.getNom());
		
		System.out.println("Votre age : "+ Variable.getAge()+ " ans");
		
		System.out.println("Votre taille : "+Variable.getTaille() + " m");
		
		System.out.println("Votre poids : "+Variable.getPoids()+ " kg");
		
	     
		System.out.println("Votre IMC est de : "+Variable.determineIMC());
		
		if (Variable.isAdult()){
		System.out.println(Variable.isAdult());
		System.out.println("Votre Etat :" + " vous êtes majeur");
		}
		else {
			System.out.println("Votre Etat : " + " vous êtes mineur");
		}
		
		System.out.println("Votre Statut : "+Variable.significationIMC());
		
		
	     System.out.println("Votre Adresse :"+Variable.getAdresse());
			
		
		
		
	}
	
}
