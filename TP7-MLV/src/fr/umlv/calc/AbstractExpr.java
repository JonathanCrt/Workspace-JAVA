package fr.umlv.calc;

import java.util.Objects;

abstract class AbstractExpr implements Expr {
	private final Expr left;
	private final Expr right;
	/**
	 * @param left
	 * @param right
	 */
	public AbstractExpr(Expr left, Expr right) {
		super();
		this.left = Objects.requireNonNull(left);
		this.right = Objects.requireNonNull(right);
	}
	
	public Expr getLeft() {
		return left;
	}
	public Expr getRight() {
		return right;
	};
	
}
