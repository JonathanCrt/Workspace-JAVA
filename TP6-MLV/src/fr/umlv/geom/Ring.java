package fr.umlv.geom;

public class Ring extends Circle {
	
	private int internalRayon;
	
	public int requireInferiorInternalRayon(int rayon) {
		if(rayon > this.getRayon()) {
			throw new IllegalArgumentException("Internal rayon must be inferior");
		}
		return rayon;
	}
	
	/**
	 * @param center
	 * @param rayon
	 * @param insideRayon
	 */
	public Ring(Point center, int rayon, int internalRayon) {
		super(center, rayon);
		this.internalRayon = this.requireInferiorInternalRayon(internalRayon);
	}
	
	
	@Override
	public String toString() {
		//return "Ring [internalRayon=" + internalRayon + "]";
		StringBuilder st = new StringBuilder();
		st.append(super.toString());
		st.append("InternalRadius: ");
		st.append(this.internalRayon);
		
		return st.toString();
		
	}
	/**
	 * 
	 * @param point
	 * @param rings
	 * @return
	 */
	protected boolean contains(Point point, Ring... rings) {
		return super.contains(point, rings);
	}
	
	
	@Override 
	protected boolean contains(Point pt) {
		Boolean c;
		c = (super.calcDist(pt) > this.internalRayon) && super.contains(pt);
		
		return c;
	}

	

	
}
