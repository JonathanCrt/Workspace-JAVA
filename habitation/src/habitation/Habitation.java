package habitation;

public class Habitation {
	
	protected String nom;
	protected String adresse;
	protected double surface;
	
	
	
	
	public Habitation(String nom, String adresse, double surface) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.surface = surface;
	}


	public double impotdeBase(){
		return this.surface*2;
	}

}
