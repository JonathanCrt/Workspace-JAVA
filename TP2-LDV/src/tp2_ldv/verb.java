package tp2_ldv;

import java.util.Scanner;

public class verb {

	public static void main(String[] args) 
	{
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez un verbe : ");
    String verbe = scanner.next();
    boolean groupe = verbe.endsWith("er");
    boolean groupe2=verbe.endsWith("ir");
   
    if (groupe)
    {
    	System.out.println("le verbe  " + verbe +" est du premier groupe ");
    }
    else if(groupe2)
    {
    	System.out.println("le verbe  " + verbe +" est du deuxiéme groupe ");
    }
    else 
    {
    	System.out.println("Le verbe " + verbe + " est du troisiéme groupe");
    }
    
	}
}
