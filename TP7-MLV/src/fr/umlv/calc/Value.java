package fr.umlv.calc;

import java.util.Iterator;

public class Value implements Expr {
	
	private final int value;

	/**
	 * @param value
	 */
	public Value(int value) {
		super();
		this.value = value;
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static Expr parse(Iterator<String> sc) {
		  
		  // var => prend le type de scanner.next() ici, pas besoin d'écrire le type
		  var token = sc.next();
		  
		  switch(token) {
			  case "+": {
				  var left = parse(sc);
				  var right = parse(sc);
				  return new Add(left, right);
				  
			  }
			  case "-": {
				  var left = parse(sc);
				  var right = parse(sc);
				  return new Sub(left, right);
			  }
			  default:{
				  var value = Integer.parseInt(token);
				  return new Value(value);
			  }
		  }
	  }
	
	
}
