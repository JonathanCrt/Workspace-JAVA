package tp2_mlv;

public class Exercice1 {
	public static void main(String[] args) {
		
		   /*------------------------------------------------- */
		   /* 1)
		    * Equivalent à String s1 = new String("toto") 
		    * s1 est de type objet et il est manipulé par sa référence.*/ 
		   String s1 = "toto";
		   
	       String s2 = s1;
	       String s3 = new String(s1);
	       
	       /* Ici, l'opérateur '==' teste l'égalité des références 
	        * de s1 et s2, or on souhaite comparer 
	        * les valeurs contenues dans les objets ! 
	        * En clair, on vient de tester si les deux références contiennent la même 
	        * adresse mémoire.
	        * */
	       
	       /* Affichera true */
	       System.out.println(s1 == s2);
	       
	       /* Affichera false (Les références aux objets ne contiennent pas la même adresse mémoire -- 2 objets String différents) */
	       System.out.println(s1 == s3);
	       
	       
	       /* ------------------------------------------------- */
	       /**
	        * 2)
	        * Pour tester si le contenu des chaînes de caractères est le même,
	        * on va utiliser la méthode equals() qui va renvoyer true si les chaînes de caractères 
	        * contenues dans les objets sont égales (valeurs)
	        * A noter que l'implantation par défaut dans java.lang.Object.equaks() fait juste un ==
	        */
	       
	       String s4 = "toto";
	       String s5 = new String(s4);

	       System.out.println(/* comparer valeurs de 2 objets */);
	       /* Affichera true */
	       System.out.println(s4.equals(s5));
	       
	       
	       /* ------------------------------------------------- */
	       
	       String s6 = "toto";
	       String s7 = "toto";
	       /*  3)
	        *  Affichera true car la JVM a crée un seul objet 
	        * qu'elle a affecté aux 2 variables s6 et s7 (Ceci est une optimisation)*/
	       System.out.println(s6 == s7);
	       
	       /* 4)
	        * Immutable  = Classe qui ne permet pas la modification de l'état de ses objets
	        * Il est important que java.lang.string soit immutable pour ne pas que les 
	        * chaînes de caractères contenues dans les objets ne soient modifiées après avoir été créees. 
	        * On dit que les chaînes de caractères sont des constantes  */
	       
	       
	       
	       /* ------------------------------------------------- */
	       /* 5)
	        * Le code suivant va afficher 'hello', 
	        * la méthode toUpperCase()  ne modifie pas l'état courant, Elle créer un nouveau String qu'elle met en majuscule 
	        * Pour afficher en majuscule il faudrait appeler la méthode toUpperCase() lors de l'affichage. */
	       String s8 = "hello";
	       s8.toUpperCase();
	       System.out.println(s8);
	       
	       
	       
	}
}
