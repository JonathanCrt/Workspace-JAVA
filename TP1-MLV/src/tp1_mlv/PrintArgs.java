package tp1_mlv;

public class PrintArgs {
	public static void main (String[] args) {
		
		/* Si l'on ne passe pas d'arguments 
		 * sur la ligne de commande alors on relève une exception*/
	
		/*
		int i;
		for(i= 0; i <args.length; i++) {
			System.out.println(args[i]);
			
		}
		*/
		for(String s: args) {
			System.out.println(s);
		}
		
		
	}
}
