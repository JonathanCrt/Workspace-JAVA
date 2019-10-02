package fr.umlv.movies;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Movies {
	public static void main(String[] args) throws IOException {
		/**
		 * qui associe des objets de type A à B.
		 * Map<B, A>
		 */
		var path = Path.of("data/movies.txt");	
		
		displayFirst50Actors(path);
		System.out.println(countTotalActors(path));
		
		/**
		 * flatMap -> "applatir un stream", ramener à une seule dimension (Liste d'acteurs à acteurs)
		 * 
		 */
	}
	
	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	/*
	public Map<String, List<String>> actorsByMovie(Path path) throws IOException {
		try(Stream<String> lines = Files.lines(path)){
			var moviesMap = new HashMap<String, List<String>>();
			lines.forEach(line  -> {
				// tableau de stream
				var tab = line.split(";");
				
				 //Je conserve le tableau
				 //je split.
				 //je construis un stream avec tout le tableau
				 //je "skip" pour garder tout sauf le premier élément.
				 //je re-transforme en List
				 
				moviesMap.put(tab[0], Arrays.stream(tab).skip(1).collect(Collectors.toList()));
				
				
				 //args -> (clé, valeur)
				 //type film - liste acteurs associés
				 
			});
			return moviesMap;
		}
		
	}
	
	
	/**
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	
	public static Map<String, List<String>> actorsByMovie(Path path) throws IOException {
		try(Stream<String> lines = Files.lines(path)){
			
			return lines.map(line -> line.split(";"))
					.collect(
							Collectors.toUnmodifiableMap(
									tab -> tab[0], tab -> Arrays.stream(tab).skip(1).collect(Collectors.toList())));
		}
		
	}
	
	/**
	 * display the 50 first actors which had played at least into 1 movie
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static void displayFirst50Actors(Path path) throws IOException {
		try(Stream<String> lines = Files.lines(path)){
			
			lines.flatMap(line -> Arrays.stream(line.split(";")).skip(1)).limit(50).forEach(System.out::println);
		}
	}
	
	/**
	 * count the total number of players who played in at least one film
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static Long countTotalActors(Path path) throws IOException {
		try(Stream<String> lines = Files.lines(path)){
			
			return lines.flatMap(line -> Arrays.stream(line.split(";")).skip(1)).count();
				
		}
	}
	/**
	 * Nous allons utiliser l'interface Set<E>
	 * 
	 * @param map
	 * @return
	 */
	public  static long numberOfUniqueActors(Map<String, List<String>> map) {
		
	
		
		map.entrySet().stream().map( (mapper)      ));
		return 0;
		
	}
	
	
	
	
	
	
}
