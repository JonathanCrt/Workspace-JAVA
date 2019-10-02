package tp3_mlv;

import java.util.Optional;

public class PrintBook {
	
	
	public static void main(String[] args) {
		
		/* 1) 
		 *  La m�thode toString de  java.lang.Object, 
		 *	permet de retourner une repr�sentation 
		 *	sous forme de cha�ne de l'objet.
		 *  
		 *  
		 *  2) Oui on peut, afin de demander au compilateur de v�rifier qu'on r�d�finit bien la m�thode 
		 *     toString()
		 *  */
		
		 Book book = new Book("Da Java Code", "Dan Duke");
		 System.out.println(book);
		 
		 //Book book2 = new Book("Harry Potter et la Chambre des secrets", "J.K Rowling");
		 Book book2 = new Book("", "<no author>");
		 Book book3 = new Book("");
		 //Book book2 = new Book(null);
		 
	     
	     //System.out.println(book2.getTitle());
	     
	     if((book2.getTitleOpt()).isPresent()){
	    	 System.out.println(book2);
	     }
    	 System.out.println(book3);
	     
	
	    
	}
}
