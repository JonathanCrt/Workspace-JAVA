package tp4_ldv;

import java.util.ArrayList;

public class People {

	/************************* Attributs ************************/
		  private String nom;
		  private int age;
		  private double taille;
		  private double poids;
           /**private Adresse adresse; ***/
          private ArrayList<Adresse>lesAdresses;
          
		 

		public People(String nom, int age, double taille, double poids, ArrayList<Adresse> lesAdresses) {
			super();
			this.nom = nom;
			this.age = age;
			this.taille = taille;
			this.poids = poids;
			this.lesAdresses = lesAdresses;
		}





		public People()
		{
		       
		     //Le constructeur qui n'attend rien....

		}  
		
		
		
		
		
   /**
	public People(String nom, int age, double taille, double poids, Adresse adresse,
				ArrayList<Adresse> lesAdresses) {
			super();
			this.nom = nom;
			this.age = age;
			this.taille = taille;
			this.poids = poids;
			this.adresse = adresse;
			this.lesAdresses = lesAdresses;
		}
     */


	/*****************************    Accesseurs    ***********************************************/
	public String getNom ( ) {
			return this.nom ;
		}

	public int getAge ( ) {
	     return this.age ;
	   }
	public double getTaille ( ) {
	     return this.taille ;
	   }
	public double getPoids ( ) {
	     return this.poids ;
	   }
	
	  /**public Adresse getAdresse() {
		return adresse;
	}   */

	public ArrayList<Adresse> getLesAdresses() {
		return lesAdresses;
	}

	
	/*******************Mutateurs******************************************/
		  
		public void setAge ( int age ){
		    this.age = age ;
		  }
		  
		  public void setTaille ( double taille ){
		    this.taille = taille ;
		  }
		 
		  
		  // De meme pour le poids
		 public void setPoids ( double poids ){
		    this.poids = poids ;
		  }
		 
		/** public void setAdresse(Adresse adresse) {
				this.adresse = adresse;
			}   ***/
		 
		 public void setLesAdresses(ArrayList<Adresse> lesAdresses) {
				this.lesAdresses = lesAdresses;
			}
		 
		 
		 
		 
		  
		

		public double determineIMC(){
			    return this.poids/(this.taille*this.taille);
			   }
		  
		 /* public String toString(){
		        String presentation = "nom de la personne : " + this.nom +"\nage  : " + this.age + "\ntaille : " +
		                 this.taille +"\npoids :"+this.poids;
		           return presentation;
		   } */

		  @Override
		public String toString() {
			return "People [nom=" + nom + ", age=" + age + ", taille=" + taille + ", poids=" + poids + ", lesAdresses="
					+ lesAdresses + "]";
		}
		

		   public boolean isAdult(){
		       if(this.age>=18)
		            return true;
		       else
		            return false;
		   }

		  
		   
/*******Autre classe *****************************/
		   


		public String significationIMC(){
		         String signification;
		         if(determineIMC()<18.5)
		              signification=" Poids�inf�rieur��la�normale  ";
		         
		         else if (determineIMC()<25)
		              signification="Poids normal  ";
		         
		         else if (determineIMC()<30)
		              signification="Surpoids";
		         
		         else
		             signification=" Vous �tes ob�se";
		       
		        return signification;
		   }
		}



/**	   
La m�thode toString est d�finie dans la classe Object ; 
 en cons�quence toutes les classes Java en h�rite.
 La m�thode toString d�finie dans la classe Object ne fait pas grand-chose :
elle renvoie le nom de la classe de l'objet concern� suivi de l'adresse de cet objet. 
Lorsqu'on d�finit une classe, il peut �tre tr�s utile de red�finir la m�thode toString afin 
de donner une description satisfaisante des objets de cette classe
*/  