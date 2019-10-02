package tp8_mlv.ex2;

//import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		/*
		 * 2)
        Apple apple1 = new Apple(20, "Golden");
        Apple apple2 = new Apple(40, "Pink Lady");
   
        Basket basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);
        System.out.println(basket);
        
        
    	HashSet<Apple> set = new HashSet<>();
        set.add(new Apple(20, "Golden"));
        System.out.println(set.contains(new Apple(20, "Golden")));
        */
		
		/* 
		 * 3)
		Apple apple1 = new Apple(20, "Golden");
        Apple apple2 = new Apple(40, "Pink Lady");
        Pear pear = new Pear(5);
   
        Basket basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);  // une pomme
        basket.add(pear);    // une poire
        System.out.println(basket);
        
        */
		
		/*
        Apple apple1 = new Apple(20, "Golden");
        Apple apple2 = new Apple(40, "Pink Lady");
        Pear pear = new Pear(5);
   
        Basket basket = new Basket();
        basket.add(apple1, 5);      // 5 pommes
        basket.add(apple2);
        basket.add(pear, 7);        // 7 poires
        System.out.println(basket);
        */
		
		Apple apple1 = new Apple(20, AppleKind.Golden);
        Apple apple2 = new Apple(40, AppleKind.Pink_Lady);
        Pear pear = new Pear(5);
   
        Basket basket = new Basket();
        basket.add(apple1, 5);
        basket.add(apple2);
        basket.add(pear, 7);
        System.out.println(basket);
      }
	  /**
	   * R�ponses : 
	   * 5) La Classe FruitQuantity ne doit pas �tre declar�e publique dans la mesure ou on se doit de 
	   * resteindre l'acc�s au champs fruit et quantity de la classe.
	   * Une �num�ration est un type de donn�es particulier, dans lequel 
	   * les variables sont des constantes nomm�es.
	   * Ici, notre �num�ration AppleKind contient trois instances (Golden, Pink_Lady et Granny_Smith), qui poss�de
	   * chacune une m�thode toString() r�f�nie pour l'affichage sans '_'.
	   */

	
}
