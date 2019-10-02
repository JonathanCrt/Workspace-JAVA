package fr.umlv.data;


public class Main {
	
	public static void main(String[] args) {
		/*
		LinkedLink llk = new LinkedLink(new Link(15, null), 5);
		System.out.println(llk);
		System.out.println("--add 7--");
		llk.add(7);
		System.out.println(llk);
		*/

		LinkedLink <String> string_lst = new LinkedLink<String>();

		string_lst.add("Harry");
		string_lst.add("Hermione");
		string_lst.add("Ron");
		//System.out.println(((String)string_lst.get(1)).length());
		System.out.println("LinkedList : " + string_lst);
		System.out.println((string_lst.get(1)).length());
		
		String s1 = "Harry";
		String s2 = "Hermione";
		String s3 = "Ron";

		System.out.println("LinkedList contains string ('Harry') ? : " + string_lst.contains(s1));
		System.out.println("LinkedList contains string ('Hermione') ? : " + string_lst.contains(s2));
		System.out.println("LinkedList contains string ('Ron') ? : " + string_lst.contains(s3));
		
		/**
		 * --Exercice 2 --
		 * 1) On se doit de lever une exception IllegalArgumentException.
		 * 
		 * 3) Note : "Toute expression peut être convertie implicitement (ou explicitement) 
		 * dans le type "référence vers String". Dans le cas où cette expression n'est pas statiquement constante, 
		 * il y a alors création dynamique d'un objet de classe String représentant la valeur de cette expression,
		 *  et l'expression résultant devient une référence vers cet objet."
		 * 
		 * 4) 
		 * On est obligé d'ajouter un type String pour pouvoir appeler la méthode String.length()
		 * Les cast  (transtypage) ne sont pas bon en JAVA car il nous oblige à donner un type. 
		 * En effet ici, on est pas forcément sûr du type de l'objet, ce qui peut conduire en cas de mauvais type à une  ClassCastException.
		 * Il faut être vraiment être sûr que à la ligne ou l'on veut faire le cast, que  l'objet est forcément du type désiré, pour caster.
		 */
		
		/**
		 * -- Exercice 3 -- 
		 * 1) L'utilisation du type paramétré nous permet de vérifier et propager un type (déclarer avec la syntaxe "diamant").
		 * <E> : Objet de type E
		 * 4) Pour implanter la méthode boolean contains(object o) on implante la méthode indexOf(Object o) qui retourne l'index de la première occurrence
		 *  de l'objet dans la LinkedList, et -1 si si ne trouve pas l'objet.
		 * De manière à créer une méthode contains qui fonctionne sur tous les objets. 
		 * On rappelle que la méthode contains() de la classe LinkedList<E> implemente l'interface List<E>.
		 */
		
	}
	
}
