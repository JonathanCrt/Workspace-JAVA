package fr.umlv.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;

public class Fifo <E>  implements Iterable<E>{
	
		private final E [] fifo;
		private int tail;  // position prochaine element a inserer (pointeur)
		private int head; // position du premier element (pointeur)
		private int size; // compter les element pour tester la taille
		private int maxSize;
		
		public void shouldHasAnPositiveCapacityNotZero(int capacity) {
			if (capacity < 0 || capacity == 0) {
				throw new IllegalArgumentException();
			}
		}
	
		/**
		 * @param fifo
		 */
		@SuppressWarnings("unchecked")
		public Fifo(int capacity) {
			this.shouldHasAnPositiveCapacityNotZero(capacity);
			this.fifo = (E[]) new Object[capacity];
			this.head = 0;
			this.tail = 0;
			this.size = 0;
			this.maxSize = capacity;
		}
		
		/**
		 * add an E element into queue
		 * @param e element to add
		 */
		public void offer (E e ) {
			Objects.requireNonNull(e);
			if(this.size == this.maxSize) {
				 throw new IllegalStateException("queue is full");
			}
			fifo[tail] = e;
			tail = (tail + 1) % fifo.length; // re-calcule de la position de tail, retour en tête de fifo (0)
			this.size++;
		}
		
		/**
		 * remove an E element of fifo
		 * @return
		 */
		public E poll() {
			if(this.size == 0) {
				 throw new IllegalStateException("queue is  empty");
			}
			var eltToRemove = fifo[head];
			head = (head + 1) % fifo.length;
			this.size--;
			return eltToRemove;
		}
		
		
		/**
		 * return size of fifo
		 * @return
		 */
		public int size() {
			return size;
		}
		
		/**
		 * test if fifo is empty
		 * @return
		 */
		public boolean isEmpty() {
	        return size == 0;
	    }
		
		@Override
		public String toString() {
			var st =  new StringJoiner(", ", "[", "]");
			
		
			int i = head;
			for(int j = 0; j < this.size; j++  ) {
				st.add(fifo[i].toString());
				i =   (i +1) % fifo.length;
			}
			return st.toString();
		}
		
		
		public Iterator<E> iterator() {
			return new Iterator<E>(){
				private int iteratorCounter; // nombre d'element deja vus
				private int index = head; // prochain element dans l'iterator a renvoyer
				
				@Override
				public boolean hasNext() {
					// test if we have next
					//return (iteratorCounter < size);
					return iteratorCounter != size;
				}

				@Override
				public E next() {
				   if(!hasNext()) {
					   throw new NoSuchElementException();
				   }
				   var tmp = fifo[index];
				   this.index =  (index +1) % fifo.length; // re-calculer l'index pour le suivant
				   iteratorCounter++;
				   return tmp;
				}
			};
			
		}
		
		public static void main(String[] args) {
			/**
			 * 1 - Pour détecter si la fifo est vide ou pleine, on peut mettre le premier indice à -1. 
			 * Utiliser un compteur qui compte les elements dans la file
			 * 
			 * 3 - En testtant si la taille de la fifo n'est pas égale à la taille maximale etant à la capacity à l'initialisation
			 * 	Si la fifo est pleine , on lève une IlegalStateException
			 *
			 * 6 - memory leak -> fuite de memoire  
			 * ans un programme qui alloue régulièrement de nouveaux objets en mémoire, la cause la plus classique d'un tel bogue est l'absence de désallocation 
			 * (de libération) de l'espace utilisé lorsque ces objets ne sont plus référencés.  (wikipedia)
			 * 
			 * 8 - -- Utilisation d'un iterateur -- 
			 * 	  for(Iterator<MyObject> iter = myList.iterator(); iter.hasNext();) {
			 *	    MyObject element = iter.next();
			 *	    // To do...
			 *	  }
			 * 	  On peut utiliser un iterateur sur une structure de donnee des que l'on souhaite modifier 
			 *    ou supprimer des elements de celle-ci
			 * 	  Relativement perfomant, un iterateur est assez souple, et peut nous permettre d'utiliser plusieurs conditions d'arrets
			 *    et d'effectuer plusieurs pas d'un coup.
			 * 
			 *    Un iterateur doit retourner un E
			 *    Etat dans le parcoyrs de la Collection
			 */
		}
}
