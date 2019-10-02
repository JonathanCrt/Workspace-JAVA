package tp8_mlv.ex2;

class FruitQuantity  {
	private final Fruit fruit;
	private final int quantity;
	/**
	 * 
	 * @param quantity
	 * @return
	 * @throws IllegalArgumentException
	 */
	public int requireValidQuantity(int quantity) throws IllegalArgumentException {
		if(quantity <= 0) {
			throw new IllegalArgumentException("Need a valid quantity ! 1 or plus...");
		}
		return quantity;
	}
	
	/**
	 * @param apple
	 * @param quantity
	 */
	public FruitQuantity(Fruit fruit, int quantity) {
		super();
		this.fruit = fruit;
		this.quantity = this.requireValidQuantity(quantity);
	}
	/**
	 * 
	 * @return
	 */
	public double getFruitPrice(){
        return this.fruit.getPrice() * this.quantity;
    }

    @Override
    public String toString() {
        return this.fruit.toString() + " x " + this.quantity + ".";
    }
	
	
}
