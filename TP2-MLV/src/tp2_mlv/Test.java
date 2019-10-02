package tp2_mlv;

public class Test {
	public static void main(String[] args) {
        String first = args[0];
        String second = args[1];
        String last = args[2];
        System.out.println(first + ' ' + second + ' ' + last);
      }
	
	/* 
	 * 4)
	 * On peut utiliser ' ' car il s'agit d'un caract�re (espace vide dans tous les cas) et non d'une cha�ne.
	 * La conversion d'un caract�re vers une chaine de caract�re ne pose pas de probl�me. 
	 * bytecode :
	 * 		Des m�thodes sont appel�es par la JVM sans que l'utilisateur ne s'en rende forc�ment compte
	 * 		(La m�thode StringBuilder.append est utilis�e)
	 * 5) 
	 *    On doit utiliser StringBuilder a la place de "+" car en cas de nombreuses concat�nations, 
	 *    dans une boucle for Each (par exemple);
	 *    Utiliser le "+" � la place de la m�thode append() n'est pas appropri�, tr�s peu productif, et oblige la JVM 
	 *    a r�allouer un buffer en m�moire chaque fois que l'on fais une modification (immutabilit�). 
	 *    
	 * */
}
