package tp10_mlv;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Exercice4 {
	
	
	/**
	 * 
	 * @param sup
	 */
	public static void printAndTime(Supplier <Long> sup) {
		long start = System.nanoTime();
		long result = sup.get();
	    long end = System.nanoTime();
	    System.out.println("result " + result);
	    System.out.println(" elapsed time " + (end - start));
	}
	
	
   /**
    * 
    * @param lst
    * @param pattern
    * @return
    */
   public static long count (List<String> lst, String pattern) {
		
		long cpt = 0;
		for(String st : lst) {
			if(st.equals(pattern)) {
			//if(st.contains(pattern)) {
				cpt++;
			}
		}
		return cpt;
	
	}
	
    /**
     * 
     * @param lst
     * @param predicate
     * @return
     */
	public static long count2(List<String> lst, String predicate) {

		 return lst.stream()
		.filter(x -> x.equals(predicate))
		.count();
	}
	
	/**
	 * 
	 * @param lst
	 * @param pattern
	 * @return
	 */
	public static long count3(List<String> lst, String pattern) {

		 return lst.stream()
		 
		.filter(x -> x.equals(pattern))
		.mapToInt(x -> 1)
		.reduce((a, b) -> a + b).getAsInt();
	}
	
	
	
	public static void main(String[] args) {
		
		/* 1) La variable locale list2 contient une liste d'entiers  al�atoires allant jusqu'a 100 et avec une taille de 1 000 000 d'�l�ments.
		 * 3) 
		 * Pour �viter de dupliquer du code on va utiliser une interface fonctionelle ce qui nous permet de passer en param�tre
		 * une r�f�rence vers des m�thodes statiques 
		 * On va prendre l'interface fonctionelle void -> T j.u.function.Supplier<T>.get 
		 * Dans la mesure ou le type de retour est g�n�rique(ce qui nous arrange danns notre cas)
		 * 
		 *  result 9952
			 	elapsed time 32549400
			result 9952
			 	elapsed time 23120200
			result 9952
			 	elapsed time 24095600
			   
			4)   Le temps d'�x�cution de la m�thode count() est plus �lev� que pour les m�thode count2() et count3()
			ce qui est normal car on effectue davantage de comparaisons d'�galit� soit O(n).	
			Le temps de la m�thode count3() est l�gerement sup�rieure � celui de la m�thode count2(), ce qui eput s'expliquer 
			par l'appel de plus de m�thodes(on sollicite davantage la VM � l'�x�cution-- phase RUNTIME), comme mapToInt() et reduce.			
		 * */
		List<String> list2 =
			      new Random(0)
			        .ints(1_000_000, 0, 100)
			        .mapToObj(Integer::toString)
			        .collect(Collectors.toList());
		System.out.println(list2);
		
		printAndTime(() -> count(list2, "33"));
	    printAndTime(() -> count2(list2, "33"));
	    printAndTime(() -> count3(list2, "33"));
		
	}
	
	
}
