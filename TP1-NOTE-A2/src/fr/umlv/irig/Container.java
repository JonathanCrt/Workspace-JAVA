package fr.umlv.irig;

import java.util.Objects;
import java.util.function.Function;


public class Container<Type> {
	private Container<?> container;
	private int nbElt;

	/**
	 * @param <T>
	 * @param container
	 */
	public  <Indice> Container (Function<Indice, Type> ft) {
		this.container = Objects.requireNonNull(container);
		this.nbElt = 0;
	}
	
	
	public void add(Container<Type> elt) {
		Objects.requireNonNull(elt);
		this.container = elt;
		
	}
	
	public int size() {
		return nbElt;
	}
	
	
}
