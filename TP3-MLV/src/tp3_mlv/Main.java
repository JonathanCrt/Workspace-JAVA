package tp3_mlv;

public class Main {
	public static void main(String[] args) {
		
		
		Book book = new Book("Harry Potter et la Chambre des secrets");
		//Book book = new Book("Harry Potter et la Chambre des secrets", "J.K Rowling");
	    //System.out.println(book.getTitle() + ' ' + book.getAuthor());
	}
	
	/*  3) On cherche � afficher la valeur des champs (r�f�rence) title et author,
	 *  ce qui est impossible car il sont priv�s au sein de la classe Book.
	 *  Pour palier cette erreur on peut rendre  public ou protected les champs dans la classe Book  
	 *  protected String title;
	 *  protected String author;
	*/

	/* 
	 * 4) 
	 * On rappel,  pour tout membres d'une classe,  les 4 visibilit�s suivantes:
	 *   
	 *  - private : accessible uniquement depuis l'int�rieur de la classe Book.
	 *  
	 *  - Par d�faut : (pas de modificateur) : accessible depuis toutes les classes qui sont dans le m�me paquetage que Book.
	 *  
	 *  - protected : accessible depuis toutes les classes qui sont dans le m�me paquetage que A,
	 *   et �galement depuis celles qui ne sont pas dans le m�me paquetage mais qui h�ritent de la classe Book.
	 *   
	 *   - public : accessible depuis n'importe o�.
	 *   
	 *   - On doit toujours d�clarer les champs priv�s pour �viter que les champs soient 
	 *     accessibles depuis l'ext�rieur de notre classe. Ceci oblige l'utilisation d'accesseurs (GETTERS/SETTERS).
	 * */
	
	/* 5)
	 * En POO, les attributs (champs) d'un objet sont, comme vu pr�c�dement, g�n�ralement priv�s.
	 * Ainsi, on ne peut acc�der aux attributs de l'objet que par l'interm�diaire de m�thodes (accesseurs)
	 * Les accesseurs peuvent contr�ler l'�tat de l'objet et garantir l'int�grit� des donn�es contenues 
	 * dans l'objet.
	 * Etant donn� que les accesseurs sont internes � l'objet, 
	 * on dit que l'objet est responsable de lui m�me : C'est l'encapsulation des donn�es
	 * -- Accesseurs :---
	 * GETTERS --> Lecture
	 * SETTERS --> Modification
	 * 
	 * Par cons�quent, les accesseurs permettent d'acc�der aux attributs priv�s d'une classe.
	 * 
	 * On dit utiliser des GETTERS, ici.
	 * */
	
	/* 6)
	 * Pour indiquer � un futur d�veloppeur de ne pas changer la valeur du champ title ou author, 
	 * il suffit d'ajouter le mot cl� "final".
	 * Le champ est alors constant et cela permet de garantir l'int�grit� des donn�es.
	 * 
	 * */
	
	/* 7) Le code ne fonctionne pas car les champs title et author ne sont pas visible dans notre classe Main
	 * Le seul moyen d'y acc�der est d'utiliser les accesseurs get lors de l'affichage, 
	 * apr�s avoir donn� des valeurs aux r�f�rences  de l'objet Book (lors de l'intaciation de celui-ci),
	 * */
	
	
	/* 8) Impl�mentation constructeur : 
	 * 
	 *  Si on souhaite utiliser le mot cl� this dans notre constructeur, on doit utiliser 
	 *  les m�mes noms pour les attributs et les param�tres
	 * 
	 * En clair avec le mot cl� this :
	 * 	Objet en cours d'�x�cution = param�tre.
	 * 
	 *  NB: Le mot clef this n'est pas obligatoire mais conseill�, il permet de faire r�f�rence aux attributs. 
	 *  This correspond � l'objet courant, c'est � dire l'objet en cours d'ex�cution.
	 * */

	/* 10) 
	 * Le compilateur sait quel constructeur appell� en fonction de la fa�on dont on instancie notre objet Book
	 * (Ici, le nombre d'arguments donn�s pour l'instanciation de l'objet Book.(1 ou 2) ).
	 * 
	 * */
	
	
	/* 11)
	 * Il suffit d'utiliser le mot cl� this(...)
	 * */
	
	
}
