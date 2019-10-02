package fr.umlv.movies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;


public class Exercice1 {
	/**
	 * 1) La classe java.nio.file.Path a �t� introduite la classe apr�s java.io.File
	 *  (dans la version 7 de Java). Le package java.nio.file reprend la quasi totalit� 
	 *  des fonctionnalit�s de java.io.File en tentant de les am�liorer. 
	 *  Par exemple avant les m�thodes ne levaient pas d�exception en cas d�erreur, 
	 *  la fonction de renommage des fichiers �taient instables, on ne pouvait modifier 
	 *  les permissions des fichiers. La classe java.nio.file.Path est celle qui se rapproche 
	 *  le plus dans son fonctionnement de java.io.File.
		java.io.File est destin�e � ne plus �tre utilis�e.
		Il faut mieux utiliser le Path que File � cause de l'encodage.
		factory : m�thode statique qui permet de fabriquer un objet.
		try/catch -> 
		7) On utilise un try pour reprendre sur l'erreur, g�rer l'exception.
		Donner une exception plus pr�cise + avoir une Unchecked exception 
		pour ne pas avoir � la traiter
		Sinon un throws
		9) on est garanti que le close est effectu�.
	 */
	
	public static void main(String[] args) throws IOException {
		
		var path = Path.of("data/movies.txt");
		/*
		Stream<String> st = Files.lines(path);
		
		try {
			// Cr�er un stream des lignes du fichier
			st = Files.lines(path);
			
		} catch (IOException e) {
			
			return;
		}
	
		try {
			st.forEach(System.out::println);
		}
		finally{
			st.close();
		}
		*/
		try(Stream<String> st = Files.lines(path)){
			st.forEach(System.out::println);
		}
	
	}
	
	
	
	
	
	
}
