package habitation;

public class HabitationPro extends Habitation {

	
	



	public HabitationPro(String nom, String adresse, double surface) {
		super(nom, adresse, surface);
		// TODO Auto-generated constructor stub
	}



	public double impotSupplementaire(){
		
		double impotSupplementaire;
		if(this.nbSalaries < 10)
			impotSupplementaire=0;
		else if (this.nbSalaries < 50)
			impotSupplementaire=100;
		else if (this.nbSalaries < 100)
			impotSupplementaire=200;
		else
			impotSupplementaire=300;
				
		return impotSupplementaire;
		
	}


	@Override
	public String toString() {
		return "HabitationPro [proprietaire=" +nom + ", surface=" + surface + ", adresse=" + adresse
				+ ", nbSalaries=" + nbSalaries + "]";
	}
	
	
}
