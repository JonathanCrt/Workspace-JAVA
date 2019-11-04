package fr.umlv.bag;

import java.util.Iterator;
import java.util.function.Consumer;

public interface Bag<E> {
    public int add(E element, int count);
    public int count(Object element);
    public void forEach(Consumer<? super E> consumer);
    public Iterator<E> iterator();
    
    
    /**
     * 1 - pq object et pas un E -> On veut le type en paramétre le plus générique possible
     * 3- On ne doit jamais utiliser nos méthodes publiques dans nos méthodes d'instances , cela ne respecterai pas le principe d'encapsulation.
     * risque au moment de la redéfinition
     * mauvaise pratique d'utiliser des méthodes publiques dans des methodes d instances.
     * La methode nCopies retourne une Collection immutable
     */
    
    public static <T> Bag<T> createSimpleBag() {
    	return new BagImpl<T>(); //return classe which implement Bag
    	
    }
}



