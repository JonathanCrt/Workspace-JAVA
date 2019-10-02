package tp4_ldv;

public class Adresse {

	
	private String rue;
	private int codePostal;
	private String ville;
	
	
	
	
	public Adresse(){
		
		super();
		
	}
	
	public Adresse(String rue, int codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	



/********************************* GETTERS ***************************************************/

	public String getRue() {
		return rue;
	}
	public int getCodePostal() {
		return codePostal;
	}

	public String getVille() {
		return ville;
	}


/************************************* SETTERS ***************************************************/


	

	public void setRue(String rue) {
		this.rue = rue;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}


	
	
	
	
	/**************toString() **************************/
	
	
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

}
	



