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
			 * Lorsqu'on souhaite modifier une chaine de caractères, l'utilisation 
			 * des String peut coûter cher en terme de performance  puisque la classe java.lang.String est immutable. 
			 * L'instanciation d'objets est  une opération qui peut prendre du temps en terme de volumétrie.
			 * Pour résoudre ce problème, la classe StringBuilder  
			 * représente une chaine de caractères  avec  des objets de type StringBuilder qui sont MUTABLES. 
			 * Dès lors, les opérations d'instanciations  coûtent donc moins cher en terme de performances, 
			 * et l'état d'un objet peut être modifié.
			 * ------
			 * La méthide append(String) renvoi un  objet de type StringBuilder  de manière à pouvoir modifier l'état de l'objet.
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


