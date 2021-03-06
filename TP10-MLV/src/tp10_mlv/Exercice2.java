package tp10_mlv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercice2 {
	
	/**
	 * set in uppercase all elements in a list
	 * @param list
	 * @return
	 */
	public static List<String> upperCase(List <String> list) {
		List<String> lst = new ArrayList<String>();
		
		for(String st : list) {
			 lst.add(st.toUpperCase());
		}
		return lst;
	}
	
	/**
	 * set in uppercase all elements in a list
	 * @param words
	 * @return
	 */
	 public static List<String> upperCase2(List<String> words) {
	      
		 ArrayList<String> uppercases = new ArrayList<>();
		 
		  words.stream()
		 .map(x-> x.toUpperCase())
		 .forEach(x-> uppercases.add(x));
		 
	     return uppercases;
	 }
	 
	 /**
	  * set in uppercase all elements in a list
	  * @param words
	  * @return
	  */
	 public static List<String> upperCase3(List<String> words){
		 ArrayList<String> uppercases = new ArrayList<>();

		  words.stream()

		 .map(String::toUpperCase)
		 .forEach(uppercases::add);
	     return uppercases;
	 }
	 /**
	  * set in uppercase all elements in a list
	  * @param words
	  * @return
	  */
	 public static List<String> upperCase4(List<String> words){
		 List<String> uppercases = new ArrayList<>();

		  uppercases = words.stream()
		 .map(x-> x.toUpperCase())
		 
		 .collect(Collectors.toList());
	     return uppercases;
	 }
	
	 
	public static void main(String[] args) {
		List<String> list = List.of("hello", "world", "hello", "lambda");
	    //System.out.println(upperCase(list));  // [HELLO, WORLD, HELLO, LAMBDA]
	    //System.out.println(upperCase2(list));  // [HELLO, WORLD, HELLO, LAMBDA]
	    System.out.println(upperCase3(list));  // [HELLO, WORLD, HELLO, LAMBDA]
	    //System.out.println(upperCase4(list));  // [HELLO, WORLD, HELLO, LAMBDA]
	    
	    /**
	     * 2) On peut apppeler la m�thode map() sur notre stream. la m�thode map() va prendre en argument 
	     * une lambda appelant sur un x la m�thode upperCase(). 
	     * map() nous permet de modifier directement ce que nous venons de r�cup�rer.
	     */
	    
	    
	}
}
