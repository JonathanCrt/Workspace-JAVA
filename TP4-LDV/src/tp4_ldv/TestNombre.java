package tp4_ldv;

import java.util.Scanner;

public class TestNombre 
{


     
	public static void main(String[] args) 
	{
      
		Scanner entr�e =new Scanner(System.in);
		 System.out.println("entrez un nombre 1  : ");
		int nb=entr�e.nextInt();
		
		
		Nombre Variable= new Nombre(nb);
				
      
      System.out.println("nb de diviseurs  : " + Variable.nbDiviseurs());
      
    
      
      
      
      
      
      
 
	}
	
}



