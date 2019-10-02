package tp1;

import java.util.Scanner;

public class ex5 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez la quantité voulue :");
		int qt = sc.nextInt();
		int montant ;
		if (qt<10){
			montant = qt*150 ;
			System.out.println("Le montant est de "+ montant);
		}
		else if (qt>10 && qt<49){
			
			montant = qt*135 ;
			System.out.println("Le montant est de "+ montant);
		}
		else{
			montant = qt*110 ;
			System.out.println("Le montant est de " +montant);
		}
    }
}
