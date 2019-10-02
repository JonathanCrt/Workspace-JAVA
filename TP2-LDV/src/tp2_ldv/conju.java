package tp2_ldv;


	import java.util.*; 

	public class conju { 


	public static String lecture ( ) { 
	Scanner sc = new Scanner (System.in); 
	String str; 
	String terminaison; 
	do { 
	System.out.println ("Donner un verbe"); 
	str= sc.nextLine (); 
	terminaison = str.substring (str.length()-2); 

	} 

	while (! terminaison.equals("er")); 

	str = str.substring (0, str.length()-2); 
	return str; 
	} 


	public static void conjugaison (String str){ 
	String [] termin = {"e","es","e","ons","ez","ent"}; 
	String [] sujet = {"Je","Tu","Il/Elle/On","Nous","Vous","Ils/Elles"}; 
	int i; 
	for (i=0;i<6;i++){ 
	System.out.println (sujet[i]+" "+str+termin[i]); 
	} 
	} 




	public static void main (String args[]) { 
	// insert code here... 
	String verbe = lecture (); 
	conjugaison (verbe); 

	} 
	} 

