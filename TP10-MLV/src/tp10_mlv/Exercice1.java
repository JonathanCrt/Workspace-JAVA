package tp10_mlv;
import java.util.List;


public class Exercice1 {
	
	/**
	 * count the number of occurrences of a word in a list
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
	 * count the number of occurrences of a word in a list
	 * @param lst
	 * @param pattern
	 * @return
	 */
	public static long count2(List<String> lst, String pattern) {

		 return lst.stream()
				 
		.filter(x -> x.equals(pattern))
		.count();
		
	}
	
	
	public static void main(String[] args) {
		List<String> list = List.of("hello", "world", "hello", "lambda");
		System.out.println(list);
	    System.out.println(count(list, "hello"));  // 2
	    System.out.println(count2(list, "hello"));  // 2
	    
	    /**
	     * 2) On appelle la m�thode stream sur l'objet de type List
	     * Pour filtrer un stream on utilise la m�thode filter(Predicate<? super String> predicate) qui retourne
	     * un stream compos� des �l�ments de ce stream qui correspondent au pr�dicat donn�.
	     * Pour compter le nombre d'�lements on utilise la m�thode count().
	     * Dans notre cas le type correspondant � T est un String.
	     * 
	     * Appeller la m�thode stream() sur l'objet de type list
	     * Appeler la m�thode filter()
	     * Ecrire le pr�dicat qui est une lambda expression.
	     * Appeler la m�thode count() pour compter et retourner  le nombre d'el�ments dans le stream.
	     */
	    
	}
}
