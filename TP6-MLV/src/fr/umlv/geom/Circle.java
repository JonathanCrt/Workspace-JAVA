package fr.umlv.geom;



public class Circle  {
	
	private final Point center;
	private final int rayon;
	/**
	 * @param center
	 * @param rayon
	 */
	public Circle(Point center, int rayon) {
		super();
		this.center = center;
		this.rayon = rayon;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder st = new StringBuilder();
		st.append("Center of circle : ");
		st.append(this.center);
		st.append("\nRayon of circle : ");
		st.append(this.rayon);
		st.append("\nSurface of circle : ");
		st.append(this.surface() + "\n");
		
		return st.toString();
	}
	
	/**
	 * translate circle
	 * @param dx
	 * @param dy
	 */
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	/**
	 * getter
	 * @return
	 */
	public Point getCenter() {
	     return center.clone();
	}
	
	/**
	 * return surface of circle
	 * @return
	 */
	public double surface() {
		double surf = this.rayon * this.rayon*Math.PI;
		
		return (double) Math.round(surf*100)/100;
	
	}
	
	/**
	 * return true if point is into circle
	 * @param pt
	 * @return
	 */
	protected boolean contains(Point pt) {
		
		double coord_x = Math.pow(pt.getX() - this.center.getX(), 2);
		double coord_y = Math.pow(pt.getY() - this.center.getY(), 2);

		return (Math.sqrt(coord_x + coord_y) <= this.rayon);
	}

	/**
	 * return true if point is into circle
	 * @param p
	 * @param circles
	 * @return
	 */
	public boolean contains(Point p, Circle... circles) {
		boolean test = false;
		for(Circle circle: circles) {
			test = test || circle.contains(p); 
		}
		return test;
	}
	

	/**
	 * getter
	 * @return
	 */
	public int getRayon() {
		return rayon;
	}
	/**
	 * calculate distance
	 * @param pt
	 * @return
	 */
	double calcDist(Point pt) {
		double coord_x;
		double coord_y;
		
		coord_x = Math.pow(pt.getX() - this.center.getX(), 2);
		coord_y = Math.pow(pt.getY() - this.center.getY(), 2);
		
		double root = (Math.sqrt(coord_x + coord_y));

		return root;
	}
	
	
	
	
}
