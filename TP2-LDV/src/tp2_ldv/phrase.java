package tp2_ldv;

import java.util.Scanner;

public class phrase {
public static void main(String[] args) 
{

Scanner scanner = new Scanner(System.in);
System.out.println("Entrez une phrase : ");
String phrase = scanner.nextLine();
int longueur = phrase.length();



if (longueur<20 )
{
	System.out.println("phrase courte");
}
else if(longueur<=50)
{
	System.out.println("phrase moyenne ");
}
else 
{
	System.out.println("phrase longue");
}

}


    
   
   
}
