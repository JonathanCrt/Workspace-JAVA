package fr.upem.tidy;



public class Dresser  {
	
	private final int nb_dressers;
	private final Item[] drawers;
	private int nbItems;


	public int requirePositiveNBdressers(int nb_dressers) throws IllegalArgumentException {
		if(nb_dressers  < 0) {
			throw new IllegalArgumentException("nb dresser must be positive");
		}
		return nb_dressers;
	}
	
	
	/**
	 * @param drawers
	 */
	public Dresser(int nb_dressers) {
		super();
		this.nb_dressers = this.requirePositiveNBdressers(nb_dressers);
		this.drawers = new Item[nb_dressers];
		this.nbItems = 0;
	}
	
	/**
	 * 
	 * @param index
	 * @param item
	 * @throws NullPointerException
	 */
	public void store(int index, Item item) throws NullPointerException{
	
		if(item == null) {
			throw new NullPointerException("item is null !");
		}
		if(drawers[index] != null) {
			throw new ArrayIndexOutOfBoundsException(); 
		}
		this.drawers[index] = item;
		nbItems++;
		
	}

	public Item remove(int index) {
		if (index < 0 || index > this.drawers.length - 1) {
			throw new IllegalArgumentException("Invalid index");
		}
		Item tmp = this.drawers[index];
		this.drawers[index] = null;
		return tmp;
	}
	
	
	public int size() {
		return this.nbItems;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		st.append("number of items into commode: ");
		st.append(size());
		String space = System.getProperty("line.separator");
		st.append(space);
		for(int i = 0; i < this.drawers.length; i++) {
			st.append(drawers[i]);
			st.append(space);
		}
		
		return st.toString();
	}
	

	
}
