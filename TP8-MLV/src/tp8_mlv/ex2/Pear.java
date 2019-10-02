package tp8_mlv.ex2;


public class Pear implements Fruit {
	private final static int MIN_JUICE = 0;
	private final static int MAX_JUICE = 9;
	private int juiceFactor = 0;
	
	public int requireValidJuiceFactor(int juiceFactor) throws IllegalArgumentException {
		if(juiceFactor <= MIN_JUICE || juiceFactor > MAX_JUICE) {
			throw new IllegalArgumentException("Error : Need a valid juice factor !");
		}
		return juiceFactor;
	}
	/**
	 * @param juiceFactor
	 */
	public Pear(int juiceFactor) {
		super();
		this.juiceFactor = this.requireValidJuiceFactor(juiceFactor);
	}

	@Override
	public double getPrice() {
		return this.juiceFactor*3;
	}
	
	public int getJuiceFactor() {
		return juiceFactor;
	}

	public void setJuiceFactor(int juiceFactor) {
		this.juiceFactor = juiceFactor;
	}

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("Pear (juice factor: ");
		st.append(this.juiceFactor);
		st.append(") ");
		return st.toString();
	}
	
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof  Pear))
            return false;

        Pear pear = (Pear)obj;
        return juiceFactor == pear.juiceFactor;
    }
    
	
}
