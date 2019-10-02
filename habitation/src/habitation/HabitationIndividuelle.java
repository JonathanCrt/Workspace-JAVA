package habitation;

public class HabitationIndividuelle {
	
	
	private String proprietaire;
	private double surface;
	private String adresse;
	private int nbSalaries;
	private boolean piscine;
	private int piece;
	
	
	
	public HabitationIndividuelle(String proprietaire, double surface, String adresse, int nbSalaries, boolean piscine,
			int piece) {
		super();
		this.proprietaire = proprietaire;
		this.surface = surface;
		this.adresse = adresse;
		this.nbSalaries = nbSalaries;
		this.piscine = piscine;
		this.piece = piece;
	}
	
	public double impotdeBase(){
		return this.surface*2;
	}
	
	
	public double impotSupplementaire(){
		double impotSupplementaire = this.piece * 50;
		if(this.piscine)
			impotSupplementaire+=100;
		
		return impotSupplementaire ;
	}

	@Override
	public String toString() {
		return "HabitationIndividuelle [proprietaire=" + proprietaire + ", surface=" + surface + ", adresse=" + adresse
				+ ", nbSalaries=" + nbSalaries + ", piscine=" + piscine + ", piece=" + piece + "]";
	}
	
	
}
