package tp4_mlv;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


public class FreeShoppingCart {
	
	private List<Book>books; 
	
	
	
	public FreeShoppingCart(List<Book> books) {
		super();
		this.books = books;
	}

	
	/**
	 * Add one book to the collection of books
	 * @param bk, collection of books
	 * @param books
	 */
	@SuppressWarnings("unchecked")
	public void add(Book bk, List<Book>books) {
		
		books.add(bk);
	}
	
	public int numberOfBooks(List<Book>books) {
		return books.size();
	}
	
	/**
	 * Return the book with the longest title
	 * @param Collection of books
	 * @return elt of books
	 */
	public Book longestTitle1(List<Book>books) {
		
		int i;
		int idxMax = 0;
		Book bk = null;
		
		for(i = 0; i < books.size(); i++) {
			if((books.get(i).getTitle().length()) > (books.get(idxMax).getTitle().length()) ){
				idxMax = i;
				bk=  books.get(i);
			}
		}
		
		return bk;
		
	}
	
	/**
	 * Return the book with the longest title
	 * @param Collection of books
	 * @return bk
	 */
	public Book longestTitle2(List<Book>books) {
		
		Iterator<Book> iter = books.iterator();
		Book bk = this.books.get(0); // At the beginning
		
		
		while(iter.hasNext()) {
			 
			
			Book tmp = iter.next();
			// Après l'appel à la méthode .next(), l'itérateur ce situe après le premier élément de la collection
			if(tmp.getTitle().length() > bk.getTitle().length()) {
				bk = tmp;
			}
			
		}
		return bk;

	}
	
	/**
	 * Return the book with the longest title
	 * @param Collection of books
	 * @return bk
	 */
	public Book longestTitle3(List<Book>books) {
		
		Book bk = this.books.get(0);
		
		for(Book book : books) {
			if(book.getTitle().length() > bk.getTitle().length()) {
				bk = book;
			}
		}
		
		/* 5) 
		 * Ecrire une boucle foreach comme ceci for(Type var: iterable)
		 * 
		 * revient à ecrire, dans notre cas : 
		 *   for (Iterator<Book> iter = iterable.iterator(); iter.hasNext();) {
    			...
    	     }
    	     Par consequent le compilateur compile une boucle foreach sur une collection 
    	     en utilisant les methodes  ArrayList.iterator et Iterator.hasNext()
    	     Il s'agit d'une itération dit externe(On utilise sur la collecton un Iterator qui  nous permet de
    	     parcourir la collection en retournant un élément à  chaque appel.
    	     
		 * */
		
		return bk;
	}
	
	
	/**
	 * Remove the first occurrence of the book
	 * @param b
	 * @param books
	 */
	public void removeFirstOccurence(Book b, List<Book>books ) {
		
		for(Book bk: books) {
			if(bk.equals(b)) {
				books.remove(bk);
				break;
			}
		}
	
	}
	/* 6) La complexite de cette methode est en moyenne et dans le pire des cas est de O(n)
	 * 
	 * 7) Le programme compile toujours, car les methodes de ArrayList et LinkedList
	 * sont exactement les mêmes.
	 * Il s'agit simplement d'une façon differente de structure les donnees, tout en 
	 * gardant la taille dynamique.
	 *    ArrayList                     |    LinkedList
	 *    (Tableau dynamique)           |    (Liste doublement chaînee)                              
	 *                                  |
	 *    Insertion au début : O(n)     |    Insertion au début : O(1)
	 *    Insertion a la fin : O(1)     |    Insertion a la fin : O(1)
	 *    Acces avec un index: O(1)     |    Acces avec un index: O(n)
	 *    
	 * 8) En faisant appel à cette methode (remove()) sur la collection, avec comme argument
	 * le livre a supprimer.
	 * Ensuite on "break" ce qui nous permet de pas avoir un second tour de boucle et 
	 * donc de supprimer seulement la premiere occurrence, comme demandee.
	 * La complexite est toujours O(n)
	 * 
	 * 9) -- Utilisation de la boucle foreach -- 
	 * 	  for(MyObject element : myList) {
			  // To do...
		  }
	 * 	  L'utilisation de ce type de boucle ce fait dans le cas ou l'on souhaite lire les élement d'une liste,  
	 *    sans ce soucier de la taille.
	 * 	  L'utilisation d'un foreach est plus performant qu'une boucle for() sur les collections
	 * 	  La syntaxe est très pratique, et elle implémente l'interface Iterator.
	 * 	  
	 * 
	 * 	  -- Utilisation d'un iterateur sur une collection -- 
	 * 	  for(Iterator<MyObject> iter = myList.iterator(); iter.hasNext();) {
	 *	    MyObject element = iter.next();
	 *	    // To do...
	 *	  }
	 * 	  On peut utiliser un itérateur sur une collection dés que l'on souhaite modifier ou supprimer des éléments de celle-ci
	 * 	  Relativement perfomant, un itérateur est assez souple, et peut nous permettre d'utiliser plusieurs conditions d'arrêts
	 *    et d'effectuer plusieurs pas d'un coup.
	 * */
	
	
	
	public static void main(String[] args) {
		
		LinkedList<Book>books = new LinkedList<Book>();
		Book bk = new Book("Harry Potter et l'ecole des sorciers", " J.K Rowling");
		Book bk2 = new Book("Harry Potter et la chambre des secrets", " J.K Rowling");
		Book bk3 = new Book("Harry Potter et le prisonnier d'A", " J.K Rowling");
		Book bk4 = new Book("Harry Potter et le prisonnier d'A", " J.K Rowling");
		Book bk5 = new Book("Harry Potter et la coupe de feu", " J.K Rowling");
		
		FreeShoppingCart Cad = new FreeShoppingCart(books);
		Cad.add(bk, books);
		Cad.add(bk2, books);
		Cad.add(bk3, books);
		Cad.add(bk4, books);
		Cad.add(bk5, books);
		
		System.out.println("Length of titles:");
		System.out.println("book 1: " + bk.getTitle().length());
		System.out.println("book 2: " + bk2.getTitle().length());
		System.out.println("book 3: " + bk3.getTitle().length());
		System.out.println("book 4: " + bk4.getTitle().length());
		System.out.println("book 5: " + bk5.getTitle().length());
		System.out.println("(1) Book with the longest title:  " + Cad.longestTitle1(books));
		System.out.println("(2) Book with the longest title:  " + Cad.longestTitle2(books));
		System.out.println("(3) Book with the longest title:  " + Cad.longestTitle3(books));
		
		System.out.println("----------");
		Cad.removeFirstOccurence(bk3, books);
		Cad.removeFirstOccurence(bk2, books);
		
		System.out.println("After remove :");
		for(Book b: books) {
			System.out.println(b);
		}
		
		
		/**
		 * 1) Utiliser l'annotation @SuppressWarnings("unchecked")
		 */
	}
}
