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
	 * On peut utiliser ' ' car il s'agit d'un caractère (espace vide dans tous les cas) et non d'une chaîne.
	 * La conversion d'un caractére vers une chaine de caractère ne pose pas de problème. 
	 * bytecode :
	 * 		Des méthodes sont appelées par la JVM sans que l'utilisateur ne s'en rende forcément compte
	 * 		(La méthode StringBuilder.append est utilisée)
	 * 5) 
	 *    On doit utiliser StringBuilder a la place de "+" car en cas de nombreuses concaténations, 
	 *    dans une boucle for Each (par exemple);
	 *    Utiliser le "+" à la place de la méthode append() n'est pas approprié, très peu productif, et oblige la JVM 
	 *    a réallouer un buffer en mémoire chaque fois que l'on fais une modification (immutabilité). 
	 *    
	 * */
}
