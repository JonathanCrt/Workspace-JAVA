package fr.umlv.seq;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Seq <E>{
	
	private final List<Object> seq;
	private Function<Object,  E> myFunction; // Object -> anything, function return E 
	
	/**
	 * this contructor is private because of our factory method 
	 * @param seq
	 * @param size
	 */
	private Seq(List<Object> seq) {
		this.seq = Objects.requireNonNull(seq);
	}
	
	private Seq(List<Object> seq, Function <Object,  E> func) {
		this.seq = seq;
		//this.function = Function.identity(); // Function.indenity renvoie la même chose qu'en entrée avec le même type
		this.myFunction = func;
	}
	
	
	/**
	 * I want to add elements into sequence
	 * parameter -> We want same type of T or sub-Type
	 * @param list
	 */
	public static <T> Seq<T> from(List<? extends T> list) {
		return new Seq<>(List.copyOf(list), x -> (T)x); // T not mandatory
	}
	
	/**
	 * initialize a Seq with element split by comma
	 * @param <T>
	 * @param args
	 */
	@SafeVarargs
	public  static <T> Seq<T> of(T...args){ // we have garanty of only vargs of T
		Objects.requireNonNull(args);
		return new Seq<>(List.of(args));
	}
	
	/**
	 * memo -> P-E-C-S or RTFM to see doc of Collections 
	 * @param consumer
	 */
	public void forEach(Consumer<? super E> consumer) {
		Objects.requireNonNull(consumer);
		//seq.forEach(consumer);
		for(var elt : seq) {
			consumer.accept((E) this.myFunction.apply(elt))  ; 
		}
	}
	
	
	/**
	 * Function<T,R>
	 * prend les lements la structure de donnee et les transforme
	 * Moment ou l'application de la fonction a ete faite -> get(...), toString(...), foreach(...)
	 * Les méthodes donnent acces aux elements qui sont dans la sequence
	 * Sequenc de E
	 * 
	 * Type :
	 * 
	 * 
	 */
	
	public <W> Seq<W> map (Function<? super E, ? extends W> mapper) {
		Objects.requireNonNull(mapper);
		return new Seq<W>(seq, this.myFunction.andThen(mapper)); // compose -> compose avec l'argument puis avec le this
		
		//return null; -> first to test
	}
	
	/**
	 * return element which match with index gives in parameter
	 * @param index
	 * @return
	 */
	public E get(int index) {
		//return seq.get(index);
		var elt = seq.get(index);
		return myFunction.apply(elt);
	}
	
	/**
	 * 
	 * 
	 * @return
	 */
	public int size() {
		return this.seq.size();
	}
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "<", ">");
		seq.forEach((elt) -> {
			joiner.add(elt.toString());
		});
		return joiner.toString();
	}
	
	public static void main(String[] args) {
		  var seq = Seq.from(List.of(78, 56, 34, 23));
	      System.out.println(seq.size());  // 4
	      System.out.println(seq.get(2));  // 34
	      
	      
	}
}
