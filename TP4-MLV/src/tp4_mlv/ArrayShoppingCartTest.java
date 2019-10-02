
/**
 * @author Jonathan CRETE
 * @date   09
 */



package tp4_mlv;

import java.util.Arrays;
import java.lang.StringBuilder;

public class ArrayShoppingCartTest {
	
	/**
	 * 1) Si on declare le nombre maximum de livres dans  un champ statique (static), 
	 * 	celui-ci sera placee dans un espace memoire commun e tous les objets de la classe ArrayShoppingCartTest. 
	 *  Si un des objets modifie la valeur d'un champ statique (par exemple), tous les objets verront la valeur de ce champ modifiee.
	 *  Il n'est donc pas interessant d'utiliser un champ statique, le nombre de livres depend en effet du caddie.
	 *  */
	
	
	
	final private  int nbMaxBook;
	final private Book[] cart;
	private int nbBooks;
	
	
	public ArrayShoppingCartTest(int nbMaxBook) {
		this.nbMaxBook = nbMaxBook;
		this.cart = new Book[nbMaxBook];
		this.nbBooks = 0;
	}
	
	/**
	 * Add book to the Shopping cart
	 * @param bk
	 * @return nothing
	 */
	public void add(Book bk) throws ArrayIndexOutOfBoundsException  {
		
		if(this.cart[this.nbMaxBook-1] != null || this.nbMaxBook == 0) {
			throw  new  ArrayIndexOutOfBoundsException(); 
		}
		
		this.cart[nbBooks] = bk;
		nbBooks++;
		
		/*
		while (this.cart[nbBooks] != null) {
			cart[nbBooks] = bk;
			nbBooks++;
		}
		*/
	}
	
	/**
	 * Return number of books in  Shopping cart
	 * @param nbBooks
	 * @return nbBooks
	 */
	public int numberOfBooks() {
		return this.nbBooks;
	}
	
	
	
	/**
	 * Print the table(of Shopping cart)
	 * @param nothing
	 * @return st
	 */
	@Override
	public String toString() {
		
		StringBuilder st = new StringBuilder();
		st.append(numberOfBooks());
		String space = System.getProperty("line.separator");
		st.append(space);
		int i;
		for(i= 0; i < this.numberOfBooks(); i++) {
			st.append(cart[i].getTitle());
			st.append(cart[i].getAuthor());
			st.append(space);
		}
		
		return st.toString();
		
		
	}
	
	/**
	 * Return the book with the longest title
	 * @param nothing
	 * @return bk
	 */
	public  Book longestTitle() {
		
		int i;
		int idxMax = 0;
		Book bk = null;

		for(i=0; i < this.cart.length; i++) {

			
			if( (this.cart[i].getTitle().length()) > (this.cart[idxMax].getTitle().length()) ) {
				idxMax = i;
				bk = cart[i];
				
			}
			
		}
		return bk;
		
	
	}
	
	/**
	 * Remove all occurrences of the book passed in parameter
	 * @param bk
	 * @return nothing
	 */
	public void removeAllOccurences(Book bk) {
		
		int i;
		for(i = 0; i <this.cart.length; i++) {
			if(cart[i] == bk) {
				cart[i] = cart[numberOfBooks()-1];
				cart[numberOfBooks()-1] = null;
				nbBooks--;
			}
			// if elt is equal to the last book
			if(cart[i] == cart[numberOfBooks()-1]) {
				i--;
			}
		}

	}
	
	public static void main(String[] args) {
		
		
		Book bk = new Book("Harry Potter et l'ecole des sorciers", " J.K Rowling");
		Book bk2 = new Book("Harry Potter et la chambre des secrets", " J.K Rowling");
		Book bk3 = new Book("Harry Potter et le prisonnier d'A", " J.K Rowling");
		
		
		ArrayShoppingCartTest Cad = new ArrayShoppingCartTest(3);
		try {
			Cad.add(bk);
			Cad.add(bk2);
			Cad.add(bk3);
			
		}catch (Exception e) {
			System.out.println("Your Shopping Cart is full");
		}
		
		try {
			System.out.println("Shopping cart init :");
			System.out.println(Cad.toString());
			System.out.println("----------");
			
			System.out.println("Length of titles:");
			System.out.println("book 1: " + bk.getTitle().length());
			System.out.println("book 2: " + bk2.getTitle().length());
			System.out.println("book 3: " + bk3.getTitle().length());
			System.out.println("Book with the longest title:  " + Cad.longestTitle());
			/* 
			 * 5) Si le Caddie est vide on doit lever une exception (NullPointerException) 
			 * ou alors afficher un message dans la console à l'utilisateur.
			 * */
			System.out.println("----------");
			
			System.out.println("After remove :");
			Cad.removeAllOccurences(bk3);
			
			System.out.println(Cad.toString());
			
			/*
			int i;
			for(i = 0; i < Cad.cart.length; i++) {
				System.out.println(Cad.cart[i]);
			}
			*/
			
			/* 2) Test pour nbLivre > nbMaxProducts ?
			 * A premiere vue , l'Exception 
			 * java.lang.ArrayIndexOutOfBoundsException 
			 * est levee car on a depasse la taille maximale du tableau alloué
			 * Methode add : On doit tester ce cas precis avant d'ajouter un ou des livres dans le caddie.
			 * 3) 
			 *  */
			
		}catch (Exception e) {
			System.out.println("Your Shopping cart is empty");
			
		}
		
		
		
		
		
		
	}
}
