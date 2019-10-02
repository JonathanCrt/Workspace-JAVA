package tp5_ldv;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dvd {

	
	
	/********Attributs ******************/
	private String titre;
	private char couleur;
	private GregorianCalendar dateSortie;
	
	
	public Dvd() {
	
		// TODO Auto-generated constructor stub
		/*** Constructeur par défaut ***/
	}

	

	/*************Paramétres ************/
	public Dvd(String titre, char couleur, GregorianCalendar dateSortie) {
		this.titre = titre;
		this.couleur = couleur;
		this.dateSortie = dateSortie;
	}

	/*************Accesseurs/Getters ****************************/
	public String gettitre() {
		return titre;
	}
	
	public char getCouleur() {
		return couleur;
	}
	public GregorianCalendar getDateSortie() {
		return dateSortie;
	}

	
	
	/***************Mutateurs ******************************/
	
	public void setNom(String titre) {
		this.titre = titre;
	}
	
	public void setCouleur(char couleur) {
		this.couleur = couleur;
	}

	public void setDateSortie(GregorianCalendar dateSortie) {
		this.dateSortie = dateSortie;
	}
	
	
	/***********Autre classe ****************************/
	
	
	public double prixDVD(){
		double prix = 0;
		if(this.couleur=='V')
			prix = 2;
		else if (this.couleur=='R')
			prix = 3;
		return prix;
		
	}
	
	public boolean isNouveaute(){
		Date date = new Date();
		long difference = date.getTime()- this.dateSortie.getTime().getTime();
		long nbJours = difference / (1000*60*60*24); /**** Conversion ****/
		
		
		
		if (nbJours < 90)
			return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "Dvd [titre=" + titre + ", couleur=" + couleur + ", dateSortie=" + dateSortie + "]";
	}
	
}
