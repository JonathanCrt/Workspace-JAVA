package tp3_mlv;

import java.util.ArrayList;

public class Liberte  {
	public static void main(String[] args) {
		/*
		Book b1 = new Book("Da Java Code", "Duke Brown");
	    Book b2 = b1;
	    Book b3 = new Book("Da Java Code", "Duke Brown");

	    System.out.println(b1 == b2);
	    System.out.println(b1 == b3);
	    */
	    
	    /* 
	     * 1) 
	     * 	  Le code source ci-dessus affiche : 
	     *    Affichage n�1 : true.
		 *    Affichage n�2 : false.
		 *  
		 *    En premier, true est affich� 
		 *    car la JVM � cr�e un seul objet 
	     *    qu'elle a affect� aux 2 variables b1 et b2 (optimisation)
	     *    b1 et b2 pointe vers le m�me objet
		 *  
		 * 	  En revanche, on remarque dans un second temps que false est affich� car on a 
		 *    cr�e une nouvelle chaine de caract�re avec le mot cl� new, ce qui fait que 
		 *    l'on compare deux r�f�rences qui ne sont pas identiques.
		 *    Les variables b1 et b3 ne pointe donc pas vers le m�me objet.
		 *    
		 * 
	     * */
		    Book harry = new Book("Harry Potter et la Chambre des secrets", "J.K Rowling");
		    Book harry2 = new Book("Harry Potter et la Chambre des secrets", "J.K Rowling");
			
		    /*
		    System.out.println(Book.compareTwoString(harry.getTitle(), harry.getAuthor(), 
		    		           harry2.getTitle(), harry2.getAuthor()));
		    */
		    System.out.println(harry.compareTwoString(harry2));
	    
		/*    3) 
		 * 	  La m�thode indexOf de la classe ArrayList prend en argument un objet o et 
		 * 	  renvoie l'index de la premi�re occurrence de l'�l�ment sp�cifi� dans cette liste.
		 * 	  La m�thode renvoie -1 si la l'�l�ment n'est pas contenue dans la liste.
		 * 
		 *  */    
		    
		    
	    
	    /*
	        Book b1 = new Book("Da Java Code", "Duke Brown");
	        Book b2 = b1;
	        Book b3 = new Book("Da Java Code", "Duke Brown");

	        ArrayList list = new ArrayList();
	        list.add(b1);
	        System.out.println(list.indexOf(b2));
	        System.out.println(list.indexOf(b3));
	    */
	      
	    /*  4) 
	     *  La console affiche en sortie : 
	     *  Affichage n�1 : 0
	     *  Affichage n�2 : -1
	     *  
	     *  On ajout� a la liste l'objet b1
	     *  Encore une fois,  la JVM � cr�e un seul objet  qu'elle a affect� aux 2 variables b1 et b2 
	     *  (optimisation).
	     *  La m�thode indexOf � renvoy� 0 car elle a trouv� une occurrence pour l'objet b2.
	     *  Toutefois, la liste ne contient aucune occurence pour l'objet b3, donc la m�thode indexOf � renvoy� -1
	     *  
	     * */
	        
	     /* 5)
	      * La m�thode indexOf appelle la m�thode equals() de la classe object
	      * */
	     
	      /* 8) @Override est une annotation qui demande au compilateur de v�rifier qu'il existe une
				m�thode � red�finir dans le super-type
	      *  */
	        
	        Book aBook = new Book("Da Java Code", "Duke Brown");
	        //Book anotherBook = new Book(null, null);
	        Book anotherBook = new Book("", "");
	        ArrayList list = new ArrayList();
	        list.add(aBook);
	        System.out.println(list.indexOf(anotherBook));
	    	
	        /* 9)
	         *   Une exception java.lang.NullPointerException est lev�e.
	         *   Quand on appelle � la m�thode indexOf, on fait implicitement appel aux m�thodes de notre classe Book
	         *   La m�thode equals va comparer un string avec une valeur nulle ce qui est impossible.
	         *   Un code doit arr�ter de fonctionner et par exemple lever une exception si celui-ci est
	         *   mal utilis� par un d�veloppeur lambda dans la mesure ou il peut y avoir des cons�quences syst�mes,
	         *   m�tier qui peuvent nuire � la bonne �x�cution d'un projet en environnement de production par exemple.
	         *   On doit faire en sorte que les champs de la classe Book ne sont pas null.
	         *   Utilisation de la m�thode requireNonNull()
	         *  */
	        
	        /* 10) 
	         * 		On peut noter trois r�gle importante au niveau de la r�f�rence null : 
	         * 		- Une variable locale ne doit pas �tre null.
	         *      - Un Champ d'une classe ne doit pas �tre null.
	         *      - Une m�thode ne doit pas retourner null.
	         *      NB : Dans le cas d'une m�thode retournant un String on peut utiliser par exemple Optionnal
	         * 
	         * */
	        
	        
	        /* 11) 
	         *  java.util.Objects.requireNonNull : 
	         *  "Checks that the specified object reference is not null"
	         *  V�rifier si la r�f�rence � l'objet n'est pas nulle. 
	         *  Pour emp�cher de construire un livre null il suffit d'utilise la m�thode requireNonNull
	         *  au moment de la construction de l'objet Book (constructeur).
	         * 
	         * */
	}  
}
