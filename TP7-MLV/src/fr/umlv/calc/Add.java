package fr.umlv.calc;


public class Add extends AbstractExpr {
	
	/**
	 * @param left
	 * @param right
	 */
	public Add(Expr left, Expr right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public int eval() {
		// TODO Auto-generated method stub
		return getLeft().eval() + getRight().eval();
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getLeft() + "+" + getRight() + ")";
	}
}