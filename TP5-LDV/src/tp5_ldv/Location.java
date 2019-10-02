/** Import du packet */
package tp5_ldv;

/**Cr�ation de la classe principale : */
public class Location {
	
	/** Attributs : */
	private String nomClient;
	private char categorie;
	private int nbJour;
	private double nbKm;
	
	
	
	public Location() {
		
		//Constructeur par d�faut qui reste vide ....
		
	}
	/** Impl�mentation du constructeur Location avec param�tres : */
	public Location(String nom, char categorie, int nbJour, double nbKm) {
		this.nomClient = nom;
		this.categorie = categorie;
		this.nbJour = nbJour;
		this.nbKm = nbKm;
	}
	/************************* GETTERS (ou acceseurs) *******************************/
	/*******Un accesseur est une m�thode qui va nous permettre d'acc�der aux variables 
	  de nos objets en lecture, et un mutateur nous permettra d'en faire 
	  de m�me en �criture ! Gr�ce aux accesseurs, 
	  vous pourrez afficher les variables de vos objets, 
	  et gr�ce aux mutateurs, vous pourrez les modifier.   ****/
	 
	public String getNom() {                                    /** Nom (1) */
		return nomClient;
	}
	
	public char getCategorie() {								/** Categorie (2) */
		return categorie;
	}
	
	public int getJour() {										/** Jour (3) */
		return nbJour;
	}
	
	public double getKm() {										/** Km (4) */
		return nbKm;
	}
	
	
	
	/***** les getters permettent de r�cup�rer la valeur retourn�e dans une autre m�thode ***/
	
	
	/**********************************SETTERS (ou Mutateurs) *************************/
	
	
	
	public void setNom(String pnomClient) {
		this.nomClient = pnomClient;
	}
	
	public void setCategorie(char pcategorie) {
		this.categorie = pcategorie;
	}

	public void setJour(int pjour) {
		this.nbJour = pjour;
	}
	
	public void setKm(double pnbKm) {
		this.nbKm = pnbKm;
	}
	/**************** Classe(s) impactant sur l'attribut nbKm *********************************************************************/
	
	/** Class kmSupplementaires */
	public int kmSupplementaires(){
		int kmEnplus = 0;
		if (this.nbJour*100 < this.nbKm)
			kmEnplus = (int)this.nbKm - this.nbJour*100;
		return kmEnplus;
	}

	

	/** Class prixkmSupplementaires */
	public double prixKmSupplementaires(){
		return this.kmSupplementaires()*(1/2);
	}
	
	/**************************************** Montant(s) *******************************************************************************/
	
	/** Class MontantJour : */
	public double montantJour(){
		double montantJour = 0;  /** initialisation */
		if (this.categorie == 'E')
			montantJour = 30;
		else if (this.categorie == 'C')
			montantJour = 50;
		
		else if (this.categorie == 'L')
			montantJour = 75;
		
		return montantJour;
	}
	
	/** Class MontantLocation : */
	public double montantLocation(){
		return this.nbJour*this.montantJour();                  /** retourne les valeurs jour & montantJour */
	}
	
	
	
	/** Class montantTotal */
	public double montantTotal(){
		return this.montantLocation()+this.prixKmSupplementaires();
		
	}
	
}
 