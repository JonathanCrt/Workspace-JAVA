package tp10_mlv;

import java.util.List;

public class Exercice3 {

	public static long count3(List<String> lst, String pattern) {

		 return lst.stream()
		 
		.filter(x -> x.equals(pattern))
		.mapToInt(x -> 1)
		/**
		 *  La m�thode reduce effectue une r�duction sur les �l�ments du stream, 
		 *  en utilisant une fonction d'accumulation associative, et retourne un OptionnalInt 
		 *  d�crivant la valeur r�duite, le cas �ch�ant.
		 */
		.reduce((a, b) -> a + b).getAsInt();
	}
	
	
	public static void main(String[] args) {
		/**
		 * 1) Ici on va utiliser la m�thode mapToInt() car elle retourne un objet intStream, tandis que la m�thode map() retourne un simple stream.
		 * 
		 * Note : Exeample de r�duction simples : somme d'�l�ments, maximumm, nb d'�l�lements
		 */
		
		List<String> list = List.of("hello", "world", "hello", "lambda");
		System.out.println(list);
	    System.out.println(count3(list, "hello"));  // 2
	}
}
