package fr.umlv.data;

class Link <E> {
	private E value;
	private final Link<E> next;
	/**
	 * @param value
	 * @param next
	 */
	public Link(E value, Link<E> next) {
		this.value = value;
		this.next = next;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		st.append(value).append(" ").append(next);
		return st.toString();
	}
	public Link<E> getNext() {
		return next;
	}

	public E getValue() {
		return value;
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Link lk = new Link(13, new Link(144, null));
		System.out.println(lk);
	}
	/**
	 * -- Exercice 1 --
	 * 1) Par défaut 
	 * 2) javac chemin_du_fichier (avec des '/') .java -> Création du .class
	 * 	  java 	fr.exemple.test (pour exécuter)
	 *  
	 * 	  javac fr/umlv/data/Main.java 
	 * 	  java fr.umlv.data/Main 
	 *  
	 *  */
	
}
