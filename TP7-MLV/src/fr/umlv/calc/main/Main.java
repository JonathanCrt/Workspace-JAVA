package fr.umlv.calc.main;

import fr.umlv.calc.Add;
import fr.umlv.calc.Expr;
import fr.umlv.calc.OpOrValue;
import fr.umlv.calc.Value;

public class Main  {
	public static void main(String[] args) {
		
		
		OpOrValue expression = new OpOrValue(OpOrValue.OP_ADD,
		     new OpOrValue(2),
		     new OpOrValue(3)
		     );
		System.out.println(expression.eval());
		    
		Expr addition = new Add(new Value(2),new Value(3));
		System.out.println(addition.eval());
	}
	 	
		
		
	
	/* -- Exercice 1 -- 
	   * 1) Ne pas laisser la possibilité à l'utilisateur de créer un objet qui serai un opérateur 
	   * et une valeur en même temps 
	   * 2) Ce constructeur permet d'initialiser des opérateurs qui peuvent ne peuvent ne pas être valides.
	   * Toute méthode publique doit vérifier que ses paramètres soit valides (ne pas créer un objet invalide, 
	   * un appel de méthode sur ceux-ci peut lever une exception, pré-conditions)
	   * On doit utiliser requireNonNull uniquement dans le cas ou OP_ADD et OP_SUB ne sont pas null.
	   * 3) L'interface  Iterator<E> (Scanner implémente Iterator<String>  )
	   * Les méthodes publiques doivent renvoyer, si cela est possible, renvoyer des interfaces.
	   * "programmer contre des interfaces"
	   * 
	   * -- Exercice 2 --
	   * 2) La méthode de classe parse(...) doit être dans la classe Value 
	   * 	 
	   * 4) Le fait d'utiliser notre interface Expr nous permet de donner un type commun : Expr
	   * 	Transformer la classe  Expr en classe abstraite peut nous permettre de factoriser les champs, les méthodes
	   * 
	   * 5) Il suffit que nos classes Sub et Add héritent de notre classe abstraite.
	   * 	Les différentes méthodes peuvent être public.
	   * 	La classe introduite a une visibilité abstraite.
	   * 	On a introduit conceptuellement "un arbre d'héritage" vu en cours.
	   * */
	
	 
	
}