package fr.umlv.geom;

public class Point {
	private  int x;
	private  int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	/**
	 * translate point
	 * @param dx
	 * @param dy
	 */
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
	
	@Override
	protected Point clone() {
		return new Point(x, y);
	}
	
	
	
	
}