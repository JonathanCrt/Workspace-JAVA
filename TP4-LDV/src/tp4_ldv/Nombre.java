package tp4_ldv;

public class Nombre {
	
	private int nb;
	
	
	public Nombre(){
		
		/** Constructeur par défaut ****/
		
	}
		
	public Nombre(int nb){
		this.nb=nb;
		
	}
	
	public int getInt(){
		return nb;
	}
	
	public void setNb(int nb){
		this.nb=nb;
		
	}
	
	
	public int sommeChiffres(){
		int somme =0;
		String nombre  = String.valueOf(this.nb);
		for(int i =0;i<nombre.length();i++){
			somme+=Integer.parseInt(nombre.substring(i, i+1));
		}
		return somme;
	}
	
	public boolean estPair(){
		/**Operateur ternaire :  return (this.nb%2==0)?  ***/
		if(this.nb%2==0)
			return true;
		else
			return false; 
	}
	
	public int nbDiviseurs(){
		
		int compteur = 0 ; 
		int diviseur=this.nb;
		
		while (diviseur >=1){
			if(this.nb% diviseur == 0)
				compteur++;
			diviseur--;
		}
		
		return compteur;
		
	}
	public boolean estPremier(){
		
		if (this.nbDiviseurs()==2)
			return true;
		else
			return false;
	}
	
	
	private boolean estParfait(){
			
		int tab[] = {6,28,496,8168,33550336};
		
		for(int i = 0 ; i<tab.length; i++){
			if(this.nb == tab[i])
				return true;
		}
		
		return false ;
		
		
		}
		
	public boolean estAmi (int nb2){
		
		int somme=0;
		String nombre=String.valueOf(nb2);
		for(int i = 0;i<nombre.length();i++){
			String lettre=nombre.substring(i, i+1);
			int let = Integer.parseInt(lettre);
			
			
			somme=somme+let;
			
		}
		if(this.sommeChiffres()==somme)
			return true;
		else
			return false;
	
		
	}
		
	}
	






//super() sert à appeler un constructeur de la classe parente d'une classe.
//Ceci est rendu nécessaire lorsque qu'on déclare une classe étendant une autre classe, 
//et que celle-ci ne possède pas de constructeur avec les mêmes arguments. 