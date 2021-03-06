 package tp3_mlv;

import java.util.Objects;
import java.util.Optional;

public class Book {
	
	private final String title;
	private  final String author;
	
	public Book(String title, String author) {
		this.title = Objects.requireNonNull(title,   "Titre null");
		this.author = Objects.requireNonNull(author, "Auteur null");
	}
	
	public Book(String title) {
		
		this.title = title;
		this.author = "<no-author>";
	}
	// Eventuellement -> Dans Eclipse : Source > Generate toString
	
	@Override
	public String toString() {
		return (this.title + " by " + this.author);
	}
	
	/* 
	protected String title;
	protected String author;
	*/
	
	
	/*
	public static void main(String[] args) {
		Book book = new Book();
	    System.out.println(book.title + ' ' + book.author);
	}
	/* On manipule un objet par sa r�f�rence.
	 * Cette r�f�rence vaut par d�faut, null.
	 * En outre on cherche � acc�der � des champs priv�s accessible uniquement dans 
	 * notre classe Book.
	 * */

	
	public Optional <String> getTitleOpt() {
		
		                       
		return Optional.ofNullable(this.title);
	}
	
	
    public String getTitle() {
		
		return title;
		
	}
	

	public String getAuthor() {
		return author;
	}
	
	
	/* 6) Pour cela, On r�d�finie la m�thode equals */
	@Override
	public boolean equals(Object o) {
		return this.compareTwoString((Book)o);
	}
	/* method static with several arg
	public static boolean compareTwoString(String title, String author, String title2, String author2) {
		
		if(title.equals(title2) && author.equals(author2)) {
			return true;
		}
		return false;
	}
	*/
	
	/* method with objects */
	public  boolean compareTwoString(Book b) {
		
		if(this.author.equals(b.getAuthor()) && this.title.equals(b.getTitle())) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	
}
