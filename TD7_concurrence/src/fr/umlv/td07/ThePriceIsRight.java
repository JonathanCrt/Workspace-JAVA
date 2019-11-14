package fr.umlv.td07;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * 
 * @author jcrete
 * 1 -GESTION DE L ALGO 
 * 	champ et structure de donnee
 * LinkedHashMap -> table de hachage qui se souvient de l'ordre 
 * stocke les threads dans l'ordre d arrivee
 * 2- GESTION DE LA CONCURRENCE : 
 * 	Enum pour indiquer les diff etats possible
 * 3- NE PAS GERER LES INTERUPTIONS DANS LA PREMIER TEMPS -> ASSERTIONERROR
 */
public class ThePriceIsRight {
	
	private int realPrice;
	private int nbPlayers;
	private LinkedHashMap<Thread, Integer> map;
	private final Object lock = new Object();
	
	
	public ThePriceIsRight(int realPrice, int nbPlayers) {
		super();
		this.realPrice = realPrice;
		this.nbPlayers = nbPlayers;
		this.map = new LinkedHashMap<>();
	}
	
	/**
	 * calculate distance between price and just price
	 * @param price
	 * @return  distance
	 */
	private int distance(int price) {
		  return Math.abs(price - this.realPrice);
	}
	
	/**
	 * calculate winner if exists
	 * @return 
	 */
	public Optional<Entry<Thread, Integer>> findWinner() {
		return  map.
				entrySet().
				stream()
				.min((k1, k2) -> Integer.compare(this.distance(k1.getValue()), this.distance(k2.getValue())));
	}
	
	public int propose (int price) {
		
	}
	
}
