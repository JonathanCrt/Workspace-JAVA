package fr.umlv.fight;

public class Arena  {
	/**
	 * 
	 * @param rb1
	 * @param rb2
	 * @return winner
	 */
	/*
	public static Robot fight(Robot rb_1, Robot rb_2) {
		
		System.out.println(rb_1.toString() + " affronte " + rb_2.toString());
		Robot winner = rb_1;
		
		while (!rb_1.isDead() || !rb_2.isDead()) {
			
			rb1.fire(rb2);
			System.out.println("Oh! Le " + rb_2.toString() + " a été touché");

			rb2.fire(rb1);
			System.out.println("Oh! le " + rb_1.toString() + " a été touché");

			if(rb2.isDead()) {
				System.out.println("Le " + rb_1.toString() + " a gagné !");
				winner = rb_1;
				return winner;		
			}
		}
		
		return winner;
	}
	*/
	// On 'factorise' le code en récursif : 
	/**
	 * 
	 * @param rb_1
	 * @param rb_2
	 * @return rec
	 */
	public static Robot fight(Robot rb_1, Robot rb_2) {
		if (rb_1.isDead()) {
			
			System.out.println("Oh! Nous avons un gagnant ! c'est " + rb_2 + ", il remporte 10 000 credits.");
			return rb_2;
		}
		rb_1.fire(rb_2);
		
		return fight(rb_2, rb_1);
		
	}
	
	
	public static void main(String[] args) {
		
		Robot d2r2 = new Robot("d2r2");
		Robot data = new Robot ("data");
		Fighter john = new Fighter("John", 1);
	    Fighter jane = new Fighter("Jane", 2);

		
		System.out.println(fight(d2r2, data));
		System.out.println(fight(john, jane) + " wins");
		
		
	}
}
