package tp3_mlv;

public class Main {
	public static void main(String[] args) {
		
		
		Book book = new Book("Harry Potter et la Chambre des secrets");
		//Book book = new Book("Harry Potter et la Chambre des secrets", "J.K Rowling");
	    //System.out.println(book.getTitle() + ' ' + book.getAuthor());
	}
	
	/*  3) On cherche à afficher la valeur des champs (référence) title et author,
	 *  ce qui est impossible car il sont privés au sein de la classe Book.
	 *  Pour palier cette erreur on peut rendre  public ou protected les champs dans la classe Book  
	 *  protected String title;
	 *  protected String author;
	*/

	/* 
	 * 4) 
	 * On rappel,  pour tout membres d'une classe,  les 4 visibilités suivantes:
	 *   
	 *  - private : accessible uniquement depuis l'intérieur de la classe Book.
	 *  
	 *  - Par défaut : (pas de modificateur) : accessible depuis toutes les classes qui sont dans le même paquetage que Book.
	 *  
	 *  - protected : accessible depuis toutes les classes qui sont dans le même paquetage que A,
	 *   et également depuis celles qui ne sont pas dans le même paquetage mais qui héritent de la classe Book.
	 *   
	 *   - public : accessible depuis n'importe où.
	 *   
	 *   - On doit toujours déclarer les champs privés pour éviter que les champs soient 
	 *     accessibles depuis l'extérieur de notre classe. Ceci oblige l'utilisation d'accesseurs (GETTERS/SETTERS).
	 * */
	
	/* 5)
	 * En POO, les attributs (champs) d'un objet sont, comme vu précédement, généralement privés.
	 * Ainsi, on ne peut accèder aux attributs de l'objet que par l'intermédiaire de méthodes (accesseurs)
	 * Les accesseurs peuvent contrôler l'état de l'objet et garantir l'intégrité des données contenues 
	 * dans l'objet.
	 * Etant donné que les accesseurs sont internes à l'objet, 
	 * on dit que l'objet est responsable de lui même : C'est l'encapsulation des données
	 * -- Accesseurs :---
	 * GETTERS --> Lecture
	 * SETTERS --> Modification
	 * 
	 * Par conséquent, les accesseurs permettent d'accéder aux attributs privés d'une classe.
	 * 
	 * On dit utiliser des GETTERS, ici.
	 * */
	
	/* 6)
	 * Pour indiquer à un futur développeur de ne pas changer la valeur du champ title ou author, 
	 * il suffit d'ajouter le mot clé "final".
	 * Le champ est alors constant et cela permet de garantir l'intégrité des données.
	 * 
	 * */
	
	/* 7) Le code ne fonctionne pas car les champs title et author ne sont pas visible dans notre classe Main
	 * Le seul moyen d'y accéder est d'utiliser les accesseurs get lors de l'affichage, 
	 * après avoir donné des valeurs aux références  de l'objet Book (lors de l'intaciation de celui-ci),
	 * */
	
	
	/* 8) Implémentation constructeur : 
	 * 
	 *  Si on souhaite utiliser le mot clé this dans notre constructeur, on doit utiliser 
	 *  les mêmes noms pour les attributs et les paramètres
	 * 
	 * En clair avec le mot clé this :
	 * 	Objet en cours d'éxécution = paramètre.
	 * 
	 *  NB: Le mot clef this n'est pas obligatoire mais conseillé, il permet de faire référence aux attributs. 
	 *  This correspond à l'objet courant, c'est à dire l'objet en cours d'exécution.
	 * */

	/* 10) 
	 * Le compilateur sait quel constructeur appellé en fonction de la façon dont on instancie notre objet Book
	 * (Ici, le nombre d'arguments donnés pour l'instanciation de l'objet Book.(1 ou 2) ).
	 * 
	 * */
	
	
	/* 11)
	 * Il suffit d'utiliser le mot clé this(...)
	 * */
	
	
}
