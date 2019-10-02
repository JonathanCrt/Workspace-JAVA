
import java.util.*;


public class ShoppingCart {
	
	
	@SuppressWarnings("unused")
	private ArrayList<Item> shoppingCart;

	/**
	 * @param items
	 */
	public ShoppingCart() {
		super();
		this.shoppingCart = new ArrayList<Item>();
	}
	
	public void addItem(Item item)  throws IllegalStateException {
		
		if(this.totalWeight()< 10000) {
			shoppingCart.add(item);
		}
		else {
			throw new IllegalStateException();
		}
		
	}
	
	public boolean removeItem(Item item) {
		
		boolean test = shoppingCart.contains(item);

		
		if(test) {
			shoppingCart.remove(item);
			return true;
		}
		else {
			return false;
		}
		
		
		
	
		
		
	}
	
	public int itemCount() {
		return shoppingCart.size();
	}
	
	public long totalPrice() {
		long totalPrice = 0;
		for(Item item : shoppingCart) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	
	public int totalWeight() {
		int totalWeight = 0;
		for(Item item : shoppingCart) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	
	
}
