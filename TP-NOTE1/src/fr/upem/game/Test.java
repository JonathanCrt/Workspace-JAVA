package fr.upem.game;

public class Test {
	public static void main(String[] args) {
		Weapon sword = new Weapon("Excalibur", 50);
	    System.out.println(sword); // Excalibur (50)
	    
	    System.out.println("damage of sword : " + sword.getDamage());
	    
	    Barbarian hulk = new Barbarian("Hulk", 100, new Weapon("Dagger", 8), new Weapon("Axe", 12));
	    System.out.println(hulk); // Barbarian Hulk *100*, L : Dagger (8), R : Axe (12)
	    
	    System.out.println(hulk.attack());
	    
	    Barbarian olaf = new Barbarian("Olaf", 80, new Weapon("Mace", 5), new Weapon("Pique", 15));
	    System.out.println(olaf.attack()); // 20
	    Barbarian zorg = new Barbarian("Zorg", 75, new Weapon("Sword", 9), new Weapon("Sword", 9));
	    System.out.println(zorg.attack()); // 20
	    
	    
	    //hulk.fight(olaf); // Hulk won the fight!
	    //olaf.fight(zorg); // nobody won the fight!
	    
	    
	    System.out.println(new Shield(50)); // Shield (50)
	    
	    hulk.addToInventory(new Weapon("Club", 14));
	    hulk.addToInventory(new Shield(61));
	    hulk.addToInventory(new Weapon("Spear", 11));

	    System.out.println(hulk);
	    
	    // Barbarian Hulk *100*, L : Dagger (8) , R : Axe (12) 
	    // ------
	    // Club (14) 
	    // Shield (61) 
	    // Spear (11) 
	    // ------
	    
	    Ranger ranger = new Ranger("Léon", new Weapon("Sword", 11), 130); 
	    System.out.println(ranger); // Ranger Léon *130*, Sword (11), spell = 0
	    
	    
	    ranger.learnNewSpell(4);
	    System.out.println(ranger);   // Ranger Léon *130*, Sword (11), spell = 4 
	    ranger.learnNewSpell(2);
	    System.out.println(ranger);   // Ranger Léon *130*, Sword (11), spell = 4 
	    
	    
	}
}
