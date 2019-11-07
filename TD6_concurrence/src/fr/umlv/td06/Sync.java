package fr.umlv.td06;

import java.util.function.Supplier;

public class Sync<V> {
	
	private final Object lock = new Object();
	private boolean isExecuting;
	
	/**
	 * 
	 * @return
	 */
	public boolean inSafe() {
		synchronized (lock) { // assurer la lecture en mémoire
			return isExecuting;
			/*
			if(!isExecuting) {
				return false;
			}
			return true;
			*/
		}
	}
	  
	/**
	 * 
	 * @param supplier
	 * @return
	 * @throws InterruptedException
	 */
	public V safe(Supplier<? extends V> supplier) throws InterruptedException { //  une seule lambda s'execute a la fois
		
		synchronized (lock) {
			while(isExecuting) {
				lock.wait();
			}
			isExecuting = true;
		}
		
	    try {
	    	return supplier.get(); // il n'y a pas de barrière mémoire
		} finally {
			synchronized (lock) {
				isExecuting = false;
				lock.notify();
			}
		}
	}
	
	
}
