package tp8_mlv.ex2;

import java.util.ArrayList;

public class Basket {
	private ArrayList<FruitQuantity> basket;

	/**
	 * @param basket
	 */
	public Basket() {
		super();
		this.basket = new ArrayList<FruitQuantity>();
	}
	/*
	public void add(Apple app) {
		this.basket.add(app);
	}
	
	public void add(Pear p) {
		this.basket.add(p);
	}
	*/
	
	/*
	 * to calculate total price of basket
	 * @param basket (type : FruitQuantity)
	 */
    public int calculatedPrice(ArrayList<FruitQuantity> basket){
        int totalPrice = 0;
        for(FruitQuantity obj: basket){
            totalPrice += obj.getFruitPrice();
        }
        return totalPrice;
    }
    
    
    /**
     * add one fruit in  basket
     * @param fruit
     */
    public void add(Fruit fruit){
        this.basket.add(new FruitQuantity(fruit, 1));
    }
    
    /**
     * Add fruits in basket 
     * @param fruit
     * @param quantity
     */
    public void add(Fruit fruit, int quantity){
        this.basket.add(new FruitQuantity(fruit, quantity));
    }
    
    
	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		/*
		int totalPrice = 0;
		for(Fruit app: basket) {
			st.append(app.toString());
			st.append("\n");
			totalPrice += app.getPrice();
		}
		st.append("Total price basket : " + totalPrice);
		*/
		st.append("Fruits in Basket : ").append("(").append(this.basket.size()).append(")\n");
		st.append("----------\n");
		for(Object obj: this.basket) {
			st.append(obj);
			st.append("\n");
		}
		st.append("Total price of Basket : ").append(calculatedPrice(this.basket));
		st.append(" €\n");
		return st.toString();
	}
	
	
	
	
}
