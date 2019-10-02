package fr.umlv.geom;

public class Main {
	public static void main(String[] args) {
		
		/* -- Exercice 1 --
		 * 1) Le code de la classe Point ne compile pas car dans la méthode translate(int x, int y) 
		 * on cherche à effectuer dans opérations sur les champs x et y qui sont "finaux", soit immutables
		 * (mot clé final)
		 * Le problème de cette implementation est que, si on suppose que un point est "partagé" par plusieurs 
		 * cercles,  si celui-ci voit ses coordonnées changer, alors tous les cercles seront affectés,
		 * ce qui pose un problème evident.
		 * 2) Ces deux champs doivent être immutables. En effet, le centre et le rayon d'un cercle doivent 
		 * être inchangés.
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
	     *  Soit d'abord les coordonnées du centre du cercle, puis la longueur du rayon du cercle.
	     *  On doit rendre la classe Point immutable ou utiliser des clone de Point dans la classe Circle.
	     *  
	     * public Point getCenter() {
       			return center;
     	   }
     	   La valeur retournée est le même objet Point alors que l'on souhaite que ce 
     	   même point n'affecte pas le cercle 
     	   
     	   
     	   7) On doit rédéfinir la méthode clone() dans la classe Point 
     	      qui renvoi un clone de l'objet Point(x,y)
     	   8) J'ai choisi d'afficher un arrondi de la surface pour des questions de lisibilité.
	     */ 
	    
	    /* 10) ... = varargs 
		 * 	   veut dire que les arguments sont des varargs
		 * 	   Soit une définition des méthodes à nombre variables d'arguments en utilisant la notation "..."
		 * 	   Apparu en JAVA 5, cela permet de simplifier le passage de tableaux en paramètre 
		 *     des méthodes de classes. Cette notation nous dispense de la création d'un tableau mais doit
		 *     toujours être le dernier paramètre donné à la méthode.
		 * 
		 * */
	    
	    /** -- Exercice 2 --
		 * 1) Il est judicieux de réaliser un héritage (avec le mot clé extends) dès que l'on souhaite 
		 * hériter, dans une classe fille, de tous les attributs privés et méthodes de la classe mère.
		 * Pour rappel, La classe existante est appelée classe de base ou classe mère, la nouvelle classe est appelée 
		 * classe dérivée ou classe fille. 
		 * L’un des principaux avantages de l’héritage est qu’il permet de réutiliser le code d’une classe de base.
		 * 
		 * 3) Dans le cas contraire on va lever un exception IllegalArgumentException avec un message en console précisant que la le rayon interne 
		 * n'est pas inférieur au rayon de l'anneau.
		 * 
		 * 4) Lors de l'affichage (méthode toString() de la classe Ring) 
		 * on va utiliser le mot clé super.method de manière à utiliser dans notre classe
		 * fille la méthode toString() de la classe mère (pour produire l'affichage demandé).
		 *	
		 * -- Ensuite...
		 * 
		 * 1) J'ai écris une méthode CalcDistance qui calcule la distance, pour éviter de 
		 * dupliquer du code.
		 * Pour que la méthode contains() de la classe Ring retourne true on va tester :  
		 * - A l'aide de cette méthode on compare si la distance est 
		 * supérieure ou non au rayon interne de
		 * l'anneau.
		 * ET 
		 * - On vérifie que que le point fais bien parti de l'anneau.
		 * 
		 * 3) On peut en conclure, comme l'a dit Kent Beck,
		 * que notre code JAVA ne doit contenir aucune duplication de code (don’t repeat yourself).
		 * En effet, si la duplication de code  permet d’aller vite dans un premier temps, elle  rend toutefois
		 * les applications JAVA extrêmement difficiles à maintenir puisqu’en cas d’erreur 
		 * dans le code dupliqué il faut penser à corriger l’erreur dans toutes les copies !
		 * En outre,  grâce à de héritage et du polymorphisme, on à réussi a créer du code 
		 * réutilisable et générique.
		 */
	    
	    Point p2=new Point(1,2);
	    Circle c3=new Circle(p2,2);
	    System.out.println(c3);
	    Ring r = new Ring(p2, 2, 1);
	    System.out.println(r);
	    
	    
	}
}
