package tp4_ldv;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Exemple {

	
	public static void main(String[]args){
		
		
		
		
		List<People>lesPersonnes = new ArrayList<People>();
		
		Adresse adresse = new Adresse("6 rue de la gare",77300,"fontainebleau");
		Adresse adresse2= new Adresse ("10 rue du lapin qui fume",77000,"Melun");
		Adresse adresse3= new Adresse ("16 rue Lucien Boutet",88000,"Lille");
		Adresse adresse4= new Adresse ("14 rue Gérald Touquet",58000,"Marseille");
		
		
		
		
		ArrayList<Adresse>lesAdresses = new ArrayList<Adresse>();
		lesAdresses.add(adresse);
		lesAdresses.add(adresse2);
		lesAdresses.add(adresse3);
		lesAdresses.add(adresse4);
	
		
		
		
		lesPersonnes.add(new People("Jonathan",19,1.5,70.0,lesAdresses));
		/*lesPersonnes.add(new People("Angelaque",14,1.5,65.0,lesadresse2));
		lesPersonnes.add(new People("Donovan",25,2.0,50.0,adresse3));
		lesPersonnes.add(new People("Maxime",85,1.8,90.0,adresse4));*/
		
		System.out.println("Voici notre tableau de personnes  :"  + lesPersonnes);
		
		int caractere=0;
		int cara=0;
		
		for (People p : lesPersonnes){
			if(p.getLesAdresses().size()>=2){
				caractere= lesPersonnes.indexOf(p);
				System.out.println("Cette personne a plusieurs adresse : "+  lesPersonnes.get(caractere));	
			}
			else if (p.getLesAdresses().size()==1){
				cara=lesPersonnes.indexOf(p);
				
				
				System.out.println("Cette personne n'a pas seule adresse : "+ lesPersonnes.get(cara));
				
				
				
			}
			
			
			
			
		}
		
		
		
		/*People pi = new People("Jonathan",19,1.65,60,lesAdresses);
		pi.setlesAdresses(lesAdresses); ***/

		
		
}

	}

/***
List<People> lesPersonnes = new ArrayList<People>  ();		
lesPersonnes.add(new People("Jonathan",19,1.5,70.0,new Adresse("77 rue du général leclerc",77170,"Brie Comte Robert")));
lesPersonnes.add(new People("Angel",14,1.5,65.0,new Adresse("14 rue des trois horloges",77000,"Melun")));
lesPersonnes.add(new People("Rodolphe",25,2.0,50.0,new Adresse("12 rue du lapin qui fume",77170,"Brie Comte Robert")));
lesPersonnes.add(new People("Maxime",85,1.8,90.0,new Adresse("14 rue de Cossigny",77170,"Brie Comte Robert")));
lesPersonnes.add(new People("Clement",45,1.7,105.0,new Adresse("21 rue de la mare",77000,"Melun")));


double somme = 0 ;
double sommeP=0;

double max = 0 ;
double min = 1000;

int indice=0;
int indiceP=0;


	
	


	

for(People p : lesPersonnes){
	double taille = p.getTaille();
	double poids=p.getPoids();
	somme=somme+taille;
	sommeP+=poids;
	if(p.getTaille()>max) {
		max =p.getTaille();
	    indice=lesPersonnes.indexOf(p);
	}
	if(p.getPoids()<min){
		 min=p.getPoids();
	     indiceP=lesPersonnes.indexOf(p);
	     
	}
}


System.out.println("Le taille moyenne est : "+ (double)(somme/lesPersonnes.size()));
System.out.println("Le poids moyen est : " + (int)(sommeP/lesPersonnes.size()));

System.out.println("La personne la plus grande mesure "+ (double)(max)+" m");
System.out.println("Et voici ses caractéristiques : ");
System.out.println(lesPersonnes.get(indice));

System.out.println("La personne la plus maigre pése "+ (double)(min) + " kg");
System.out.println("Et voici ses caractéristiques : ");
System.out.println(lesPersonnes.get(indiceP));




System.out.println("                ");

	int aMelun;
	for(People p : lesPersonnes){
		if(p.getAdresse().getCodePostal()==77000){
			aMelun=lesPersonnes.indexOf(p);
			System.out.println("Cette personne  habite a Melun "+ lesPersonnes.get(aMelun));
			
			
		}
	
}


****/

