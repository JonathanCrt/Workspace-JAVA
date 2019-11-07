package fr.umlv.td06;

public class Counter {
	private int counter;
	private final Sync<Integer> synchronizer = new Sync<>();

	
	public Counter(int counter) throws InterruptedException {
		this.counter = synchronizer.safe(() -> counter++);
	} 
	
	
	
	
}
