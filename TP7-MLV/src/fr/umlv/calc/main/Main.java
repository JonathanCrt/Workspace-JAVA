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
	   * 1) Ne pas laisser la possibilit� � l'utilisateur de cr�er un objet qui serai un op�rateur 
	   * et une valeur en m�me temps 
	   * 2) Ce constructeur permet d'initialiser des op�rateurs qui peuvent ne peuvent ne pas �tre valides.
	   * Toute m�thode publique doit v�rifier que ses param�tres soit valides (ne pas cr�er un objet invalide, 
	   * un appel de m�thode sur ceux-ci peut lever une exception, pr�-conditions)
	   * On doit utiliser requireNonNull uniquement dans le cas ou OP_ADD et OP_SUB ne sont pas null.
	   * 3) L'interface  Iterator<E> (Scanner impl�mente Iterator<String>  )
	   * Les m�thodes publiques doivent renvoyer, si cela est possible, renvoyer des interfaces.
	   * "programmer contre des interfaces"
	   * 
	   * -- Exercice 2 --
	   * 2) La m�thode de classe parse(...) doit �tre dans la classe Value 
	   * 	 
	   * 4) Le fait d'utiliser notre interface Expr nous permet de donner un type commun : Expr
	   * 	Transformer la classe  Expr en classe abstraite peut nous permettre de factoriser les champs, les m�thodes
	   * 
	   * 5) Il suffit que nos classes Sub et Add h�ritent de notre classe abstraite.
	   * 	Les diff�rentes m�thodes peuvent �tre public.
	   * 	La classe introduite a une visibilit� abstraite.
	   * 	On a introduit conceptuellement "un arbre d'h�ritage" vu en cours.
	   * */
	
	 
	
}