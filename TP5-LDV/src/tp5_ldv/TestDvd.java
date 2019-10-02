package tp5_ldv;
import java.util.GregorianCalendar;

public class TestDvd {

	public static void main(String[] args)  { 
		
		
		Dvd DVD= new Dvd(); 
		Dvd dvd2=new Dvd("La porte",'R',new GregorianCalendar(2016,6,5));
		
		
		
		System.out.println("Prix  de location : "+dvd2.prixDVD() +" €");
		boolean Nouveau = dvd2.isNouveaute();
		
		if (Nouveau == true) 
		{
			System.out.println("Nouveauté");
		
	
			}
		else {
			
			System.out.println("Pas nouveau");
		}
			
			
		}
		
		

	}	
	

