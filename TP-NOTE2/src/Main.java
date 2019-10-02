import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		/*
		Item item = new Item("corn flakes", 500);
		System.out.println(item.getPrice());        // affiche: 500
		System.out.println(item.getName());         // affiche: corn flakes
		*/
		
		
		
		/*
		Item item2 = new Item("corn flakes", 500);
		
		String.format("%d.%02d",  item2.getPrice());
		
		System.out.println(item2);                   // affiche: corn flakes: 5.00 €
		Item chewingGum = new Item("chewing gum",403);
		System.out.println(chewingGum);             // affiche: chewing gum: 4.03 €
		*/
		
		/*
		Item item1 = new Item("corn flakes", 500);
		Item item2 = new Item("caviar", 50000);
		Item item3 = new Item("water", 101);
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		System.out.println(cart.itemCount());       // affiche: 3
		System.out.println(cart.totalPrice());      // affiche: 50601
		*/
		
		/*
		ShoppingCart cart = new ShoppingCart();
		

		Item item = new Item("corn flakes", 500);
		cart.addItem(item);
		
		//System.out.println((cart.removeItem(new Item("corn flakes", 500))));
		System.out.println(cart.removeItem(item));
		System.out.println(cart.itemCount());       // affiche: 0
		*/
		
		
		Item item1 = new Item("corn flakes", 501, 1000);
		Item item2 = new Item("caviar", 50000, 500);
		Item item3 = new Item("water", 500, 5000);
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(item1);
		System.out.println("Weight: " + cart.totalWeight());
		cart.addItem(item2);
		System.out.println("Weight: " + cart.totalWeight());
		cart.addItem(item3);
		System.out.println("Weight: " + cart.totalWeight());

		cart.addItem(item3);     // lève java.lang.IllegalStateException
		cart.removeItem(new Item("eau", 500, 5000));
		cart.addItem(item3);     // lève java.lang.IllegalStateException
		cart.removeItem(new Item("water", 500, 5000));
		cart.addItem(item3);        // ajout possible!
		
		
	}
}
