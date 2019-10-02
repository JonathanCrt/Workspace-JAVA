package fr.upem.game;

public class Shield implements HandItem {
	private int ptDefense;

	/**
	 * @param ptDefense
	 */
	public Shield(int ptDefense) {
		super();
		this.ptDefense = ptDefense;
	}
	
	@Override
	public String toString() {
		return (this.getClass().getSimpleName() + "(" + this.ptDefense  + ")");
	}
	

	public int getPtDefense() {
		return ptDefense;
	}
	
	
	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDefense() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
