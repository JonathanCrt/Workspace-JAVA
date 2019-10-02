package tp1;
import java.util.Scanner;

public class ex2 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez votre age :");
		int age = sc.nextInt();
	
				if (age<26 || age >65){
				System.out.println("Tarif reduit ! ");
			}
	    else{
					System.out.println("Plein tarif! ");
			}

	}
}
