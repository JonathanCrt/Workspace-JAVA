package fr.umlv.calc;

import java.util.Iterator;
import java.util.Objects;

public class OpOrValue {
  public static final int OP_NONE = 0;
  public static final int OP_ADD = 1;
  public static final int OP_SUB = 2;
  
  private final int operator;
  private final int value;
  private final OpOrValue left;
  private final OpOrValue right;
  
  private OpOrValue(int operator, int value, OpOrValue left, OpOrValue right) {
    this.operator = operator;
    this.value = value;
    this.left = left;
    this.right = right;
  }
  public OpOrValue(int value) {
    this(OP_NONE, value, null, null);
  }
  
  public void requireGoodOperator(int operator) throws IllegalArgumentException {
	  if (operator != OP_ADD && operator != OP_SUB) {
		  throw  new IllegalArgumentException("not a valid operator" + operator);
	  }
	  
  }
  
  public OpOrValue(int operator, OpOrValue left, OpOrValue right) {
    this(operator, 0, Objects.requireNonNull(left), Objects.requireNonNull(right)); 
    requireGoodOperator(operator);

  }
  
  public int eval() {
    switch(operator) {
    case OP_ADD:
      return left.eval() + right.eval();
    case OP_SUB:
      return left.eval() - right.eval();
    default: // case OP_NONE:
      return value;
    }
  }
  
  @Override
  public String toString() {
	
	  switch(operator) {
	  	case OP_NONE:
	  		return "" + value;
	    case OP_ADD:
	    	return "(" + left + "+" + right + ")";
	    case OP_SUB:
	    	return "(" + left + "-" + right + ")";
	    default: // case OP_NONE:
	      return "" + value;
	    }
  }
  
  //(Scanner sc) --> Iterator<String>
  // 
  public static OpOrValue parse(Iterator<String> sc) {
	  
	  // var => prend le type de scanner.next() ici, pas besoin d'écrire le type
	  var token = sc.next();
	  
	  switch(token) {
		  case "+": {
			  var left = parse(sc);
			  var right = parse(sc);
			  return new OpOrValue(OP_ADD, left, right);
		  }
		  case "-": {
			  var left = parse(sc);
			  var right = parse(sc);
			  return new OpOrValue(OP_SUB, left, right);
		  }
		  default:{
			  var value = Integer.parseInt(token);
			  return new OpOrValue(value);
		  }
	  }
  }
  
  
}