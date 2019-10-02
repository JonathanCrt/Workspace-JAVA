package tp2_mlv;

public class Exercice1 {
	public static void main(String[] args) {
		
		   /*------------------------------------------------- */
		   /* 1)
		    * Equivalent � String s1 = new String("toto") 
		    * s1 est de type objet et il est manipul� par sa r�f�rence.*/ 
		   String s1 = "toto";
		   
	       String s2 = s1;
	       String s3 = new String(s1);
	       
	       /* Ici, l'op�rateur '==' teste l'�galit� des r�f�rences 
	        * de s1 et s2, or on souhaite comparer 
	        * les valeurs contenues dans les objets ! 
	        * En clair, on vient de tester si les deux r�f�rences contiennent la m�me 
	        * adresse m�moire.
	        * */
	       
	       /* Affichera true */
	       System.out.println(s1 == s2);
	       
	       /* Affichera false (Les r�f�rences aux objets ne contiennent pas la m�me adresse m�moire -- 2 objets String diff�rents) */
	       System.out.println(s1 == s3);
	       
	       
	       /* ------------------------------------------------- */
	       /**
	        * 2)
	        * Pour tester si le contenu des cha�nes de caract�res est le m�me,
	        * on va utiliser la m�thode equals() qui va renvoyer true si les cha�nes de caract�res 
	        * contenues dans les objets sont �gales (valeurs)
	        * A noter que l'implantation par d�faut dans java.lang.Object.equaks() fait juste un ==
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
	        *  Affichera true car la JVM a cr�e un seul objet 
	        * qu'elle a affect� aux 2 variables s6 et s7 (Ceci est une optimisation)*/
	       System.out.println(s6 == s7);
	       
	       /* 4)
	        * Immutable  = Classe qui ne permet pas la modification de l'�tat de ses objets
	        * Il est important que java.lang.string soit immutable pour ne pas que les 
	        * cha�nes de caract�res contenues dans les objets ne soient modifi�es apr�s avoir �t� cr�ees. 
	        * On dit que les cha�nes de caract�res sont des constantes  */
	       
	       
	       
	       /* ------------------------------------------------- */
	       /* 5)
	        * Le code suivant va afficher 'hello', 
	        * la m�thode toUpperCase()  ne modifie pas l'�tat courant, Elle cr�er un nouveau String qu'elle met en majuscule 
	        * Pour afficher en majuscule il faudrait appeler la m�thode toUpperCase() lors de l'affichage. */
	       String s8 = "hello";
	       s8.toUpperCase();
	       System.out.println(s8);
	       
	       
	       
	}
}
