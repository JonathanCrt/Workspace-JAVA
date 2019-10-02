package tp1_mlv;

/**
 * Resultat temps d'execution en JAVA :
 * real	0m0,357s
 * user	0m0,114s
 * sys	0m0,012s
 * ------------------------------------
 * Resultat temps d'execution en C :
 * real	0m0,541s
 * user	0m0,450s
 * sys	0m0,023s
 * 
 *  Cette difference s'explique par le fait que JAVA est compile puis execute via 
 *  une machine virtuelle, tandis que le C est compile en langage machine 
 *  et execute par le processeur. La JVM va effectuer plusieurs optimisations de code pendant l'éxécution 
 *  du programme.
 *  
 */

public class Pascal {
	
	public static int pascal(int nBut, int pBut) {
		
		int tab[] = new int[nBut+1];
		
		int i, n;
		
		
		tab[0] = 1;
		
		for(n=1; n<=nBut; n++){
	         tab[n] = 1;

	         for(i=n-1; i>0; i--)
	           tab[i] = tab[i-1] + tab[i];
	       }
		
		int result =tab[pBut];
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
	
		System.out.println("cn, p = " + pascal(30000, 250));
		
		
	}
	
}
