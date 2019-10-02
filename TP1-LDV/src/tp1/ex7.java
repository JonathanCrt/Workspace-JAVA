package tp1;

import java.util.Scanner;

public class ex7 
{

	
		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("entrez un nombre :");
			int nb = sc.nextInt();
			
			if (nb%2 ==0)
			{
				System.out.println("pair");
			}
			else
			{
				System.out.println("impair");
			}
			int compteur=0;
			while(compteur<10)
			{
				System.out.println(nb);
				nb=nb+2;
				compteur=compteur+1;
			}
		}
		
		
}

