package fr.umlv.morse;

public class Morse {
	public static void main(String[] args) {
		
		/*
		int i;
		for(i= 0; i <args.length; i++) {
			System.out.print(args[i].toString() + " Stop. ");
			
		}
		*/
			/* 
			 * 2)
			 * Lorsqu'on souhaite modifier une chaine de caract�res, l'utilisation 
			 * des String peut co�ter cher en terme de performance  puisque la classe java.lang.String est immutable. 
			 * L'instanciation d'objets est  une op�ration qui peut prendre du temps en terme de volum�trie.
			 * Pour r�soudre ce probl�me, la classe StringBuilder  
			 * repr�sente une chaine de caract�res  avec  des objets de type StringBuilder qui sont MUTABLES. 
			 * D�s lors, les op�rations d'instanciations  co�tent donc moins cher en terme de performances, 
			 * et l'�tat d'un objet peut �tre modifi�.
			 * ------
			 * La m�thide append(String) renvoi un  objet de type StringBuilder  de mani�re � pouvoir modifier l'�tat de l'objet.
			 *
			 */
		
		int y;
		for(y= 0; y <args.length; y++) {
			StringBuilder str = new StringBuilder();
			System.out.print(str.append(args[y].toString() + " Stop. "));
			
		}
		/*
		 * Cette solution est plus performante
		 * l'objet est mutable
		 */
		
		
		
		
	}
}


