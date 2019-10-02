package tp8_mlv.ex2;

import java.util.Objects;

public class Apple implements Fruit {
	private final int weight;
	private final AppleKind name;
	//private int quantity;
	
	/**
	 * @param weight
	 * @param name
	 */
	public Apple(int weight, AppleKind name) {
		super();
		this.weight = weight;
		this.name = Objects.requireNonNull(name, "Apple must have a name ! ");
		//this.quantity = 1;
	}
	
	@Override
	public double getPrice() {
		return this.weight/2;
	}
	
	public int getWeight() {
		return weight;
	}

	public AppleKind getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(this.name);
		st.append(" ");
		st.append(this.weight);
		st.append(" g");
		//st.append(this.quantity);
		return st.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode() ^ this.weight;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Apple)) {
			return false;
		}
		Apple apple = (Apple)obj;
		return weight == apple.weight && name.equals(apple.name);

	}
	
}
