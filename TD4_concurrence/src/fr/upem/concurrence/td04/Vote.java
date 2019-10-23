package fr.upem.concurrence.td04;

import java.util.HashMap;
import java.util.Objects;

public class Vote {
	private final HashMap<String, Integer> map;
	//private final int nbVotes;
	
	/**
	 * @param map
	 * @param nbVotes
	 */
	public Vote(int nbVotes) {
		this.map = new HashMap<>();
		//this.nbVotes = Objects.requireNonNull(nbVotes);
	}

	/**
	 * proposed a vote and blocks until the No votes arrived. Then it returns the winner
	 * @param st
	 * @return
	 */
	public String vote(String st) {
		Objects.requireNonNull(st);
		// key -> voter / Value -> nbVotes 
		map.compute(st, (voter, nbVotes) -> {
			if(nbVotes == null) {
				return 1;
			}
			else {
				return (nbVotes + 1);
			}
		});
	
		return this.computeWinner();
	}
	
	
	/**
	 * compute winner
	 * @return
	 */
	private String computeWinner() {
	    int currentWinnerScore = -1;
	    String currentWinner = null;
	    for (var e : map.entrySet()) {
	      if (e.getValue() > currentWinnerScore
	          || (e.getValue() == currentWinnerScore && e.getKey().compareTo(currentWinner) < 0)) {
	        currentWinner = e.getKey();
	        currentWinnerScore = e.getValue();
	      }
	    }
	    return currentWinner;
	  }	
	
	public static void main(String[] args) {
		Vote vote = new Vote(3);
	    new Thread(
	            () -> {
	              try {
	                Thread.sleep(10_000);
	                System.out.println("The winner is " + vote.vote("1"));
	              } catch (InterruptedException e) {
	                throw new AssertionError(e);
	              }
	            })
	        .start();
	    new Thread(
	            () -> {
	              try {
	                Thread.sleep(5_000);
	                System.out.println("The winner is " + vote.vote("0"));
	              } catch (InterruptedException e) {
	                throw new AssertionError(e);
	              }
	            })
	        .start();
	    System.out.println("The winner is " + vote.vote("0"));
	}

	
	
}
