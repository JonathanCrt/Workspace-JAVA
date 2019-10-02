
public class Item {
	private String name;
	private final long price;
	private int weight;
	/**
	 * @param name
	 * @param price
	 */
	public Item(String name, long price, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	
	
	
	
	
	
}
