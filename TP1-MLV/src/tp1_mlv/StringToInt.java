package tp1_mlv;

import java.util.Arrays;

public class StringToInt {
	
	/**
	 * 2. Statique signifie qu'une m�thode peut s'ex�cuter sans avoir �
	 *  instancier la classe qui la contient. 
	 *  L'appel � une m�thode statique se fait en
	 *  utilisant le nom de la classe, plut�t que le nom de l'objet.
	 *  
	 *  
	 *  4. Lorsqu'un mot pris en argument n'est pas un nombre l'exception suivante est lev�e :
	 *   java.lang.NumberFormatException
	 */
	
	
	 /**
	  * Renvoi un tableau de d'entiers � partir d'un tableau de cha�nes de caract�res pass� en param�tre.
	  * @param tab
	  * @return tabInt
	  */
	 public static int[] parseTab_StringToInt(String[] tab) {
		
		 int tabLength = tab.length;
		 int tabInt[] = new int[tabLength];
		 
		 int i;
		 
		 for(i= 0; i<tabLength; i++) {
			 tabInt[i] = Integer.parseInt(tab[i]);
		 }
		 
		 return tabInt;
		 
		
	 }
	 
	 
	 /**
	  * Renvoi la somme des entiers d'un tableau pass� en param�tre
	  * @param tab
	  * @return sum
	  */
	 public static int tabInt_Sum(int[] tab) {
		 
		 int i;
		 int sum = 0;
		 
		 for(i = 0; i < tab.length; i++) {
			 sum += tab[i];
		 }
		 
		 
		 return sum;
		 
	 }	

	public static void main(String[] args) {
		
		
		int parse[] = parseTab_StringToInt(args);
		System.out.println("Integers : " +  Arrays.toString(parse));
		
		int sum = tabInt_Sum(parse);
		
		System.out.println("sum : " + sum);
		
		
		
	}
	
	
	
	
	
}
