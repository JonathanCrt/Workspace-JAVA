package fr.umlv.geom;

public class Main {
	public static void main(String[] args) {
		
		/* -- Exercice 1 --
		 * 1) Le code de la classe Point ne compile pas car dans la m�thode translate(int x, int y) 
		 * on cherche � effectuer dans op�rations sur les champs x et y qui sont "finaux", soit immutables
		 * (mot cl� final)
		 * Le probl�me de cette implementation est que, si on suppose que un point est "partag�" par plusieurs 
		 * cercles,  si celui-ci voit ses coordonn�es changer, alors tous les cercles seront affect�s,
		 * ce qui pose un probl�me evident.
		 * 2) Ces deux champs doivent �tre immutables. En effet, le centre et le rayon d'un cercle doivent 
		 * �tre inchang�s.
		 *  */
		
		Point p = new Point(1, 2);
	    Circle c = new Circle(p, 1);

	    Circle c2 = new Circle(p, 2);
	    c2.translate(1, 1);

	    System.out.println(c + " " + c2);
	    System.out.println(c.contains(p));
	    //System.out.println(c.getCenter());
	    
	    /**
	     * 6) Le code ci-dessus affiche les informations sur les deux cercles suivants :
	     *  // (2,3) 1 (2,3) 2
	     *  Soit d'abord les coordonn�es du centre du cercle, puis la longueur du rayon du cercle.
	     *  On doit rendre la classe Point immutable ou utiliser des clone de Point dans la classe Circle.
	     *  
	     * public Point getCenter() {
       			return center;
     	   }
     	   La valeur retourn�e est le m�me objet Point alors que l'on souhaite que ce 
     	   m�me point n'affecte pas le cercle 
     	   
     	   
     	   7) On doit r�d�finir la m�thode clone() dans la classe Point 
     	      qui renvoi un clone de l'objet Point(x,y)
     	   8) J'ai choisi d'afficher un arrondi de la surface pour des questions de lisibilit�.
	     */ 
	    
	    /* 10) ... = varargs 
		 * 	   veut dire que les arguments sont des varargs
		 * 	   Soit une d�finition des m�thodes � nombre variables d'arguments en utilisant la notation "..."
		 * 	   Apparu en JAVA 5, cela permet de simplifier le passage de tableaux en param�tre 
		 *     des m�thodes de classes. Cette notation nous dispense de la cr�ation d'un tableau mais doit
		 *     toujours �tre le dernier param�tre donn� � la m�thode.
		 * 
		 * */
	    
	    /** -- Exercice 2 --
		 * 1) Il est judicieux de r�aliser un h�ritage (avec le mot cl� extends) d�s que l'on souhaite 
		 * h�riter, dans une classe fille, de tous les attributs priv�s et m�thodes de la classe m�re.
		 * Pour rappel, La classe existante est appel�e classe de base ou classe m�re, la nouvelle classe est appel�e 
		 * classe d�riv�e ou classe fille. 
		 * L�un des principaux avantages de l�h�ritage est qu�il permet de r�utiliser le code d�une classe de base.
		 * 
		 * 3) Dans le cas contraire on va lever un exception IllegalArgumentException avec un message en console pr�cisant que la le rayon interne 
		 * n'est pas inf�rieur au rayon de l'anneau.
		 * 
		 * 4) Lors de l'affichage (m�thode toString() de la classe Ring) 
		 * on va utiliser le mot cl� super.method de mani�re � utiliser dans notre classe
		 * fille la m�thode toString() de la classe m�re (pour produire l'affichage demand�).
		 *	
		 * -- Ensuite...
		 * 
		 * 1) J'ai �cris une m�thode CalcDistance qui calcule la distance, pour �viter de 
		 * dupliquer du code.
		 * Pour que la m�thode contains() de la classe Ring retourne true on va tester :  
		 * - A l'aide de cette m�thode on compare si la distance est 
		 * sup�rieure ou non au rayon interne de
		 * l'anneau.
		 * ET 
		 * - On v�rifie que que le point fais bien parti de l'anneau.
		 * 
		 * 3) On peut en conclure, comme l'a dit Kent Beck,
		 * que notre code JAVA ne doit contenir aucune duplication de code (don�t repeat yourself).
		 * En effet, si la duplication de code  permet d�aller vite dans un premier temps, elle  rend toutefois
		 * les applications JAVA extr�mement difficiles � maintenir puisqu�en cas d�erreur 
		 * dans le code dupliqu� il faut penser � corriger l�erreur dans toutes les copies !
		 * En outre,  gr�ce � de h�ritage et du polymorphisme, on � r�ussi a cr�er du code 
		 * r�utilisable et g�n�rique.
		 */
	    
	    Point p2=new Point(1,2);
	    Circle c3=new Circle(p2,2);
	    System.out.println(c3);
	    Ring r = new Ring(p2, 2, 1);
	    System.out.println(r);
	    
	    
	}
}
