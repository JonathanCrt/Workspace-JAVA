package fr.umlv.graph;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

// Personne ne pourra hériter des méthodes de la classes
final class MatrixGraph<T> implements Graph<T> {
	
	private final T[] mat;
	private final int n;
	
	
	@SuppressWarnings("unchecked")
	MatrixGraph(int n) { //visibilité package
		if(n <= 0) {
			throw new IllegalArgumentException();
		}
		
		this.mat = (T[]) new Object[n * n];
		this.n = n;
	}
	
	private int index(int i, int j) {
		return i * n + j ;
	}
	
	private void checkEdge(int i, int j) {
		Objects.checkIndex(i, n);
		Objects.checkIndex(j, n);
	}
	

	@Override
	public Optional<T> getWeight(int src, int dst) {
		this.checkEdge(src, dst);
		var i =  index(src, dst);
		return (this.mat[i] == null) ? Optional.empty() : Optional.of(mat[i]);
	}

	@Override
	public void addEdge(int src, int dst, T weight) {
		this.checkEdge(src, dst);
		Objects.requireNonNull(weight);
		var elt = this.index(src, dst);
		this.mat[elt] = weight;
	}
	
	/**
	 * n -> nombre d'arrete possible depuis n'importe quelle source
	 */
	@Override
	public void edges(int src, EdgeConsumer<? super T> consumer) {
		Objects.requireNonNull(consumer);
		Objects.checkIndex(src, n);
		
		IntStream.range(0, n).forEach(dst -> 
			this.getWeight(src, dst).ifPresent(w -> consumer.edge(src, dst, w)) // Attention a ne pas appliquer le consumer sur des cases vides.
		);
	
		/*
		for(var dst = 0; dst < n ; dst++) {
			var dest = dst;
			this.getWeight(src, dst)
				.ifPresent(w ->{
					var weight = mat[this.index(src, dest)];
					if(weight != null) {
						consumer.edge(src, dest, weight);
					}
				}); 
		}
		*/
		
		
	}

	@Override
	public Iterator<Integer> neighborIterator(int src) {
		
		return new Iterator<Integer>() {
			
			private int index = this.nextToReturn(0); // index du prochain a renvoyer
							   
			
			private int nextToReturn(int from) { // prochain à renvoyer en commençant à from.
				for(var dst = from; dst < n; dst++) {
					if(mat[index(src, dst)] != null) {
						return dst;
					}
				}
				return -1; // -1 si plus personne
			}
			
			@Override
			public boolean hasNext() {
				return index != -1;				
			}

			@Override
			public Integer next() { // Pas le droit de l'utiliser si on a pas vérifier hasNext()
				if(!this.hasNext()) {
					throw new NoSuchElementException(); // renvoie noSuchElementException si hasNext retourne false
				}
				var tmp = index; 
				index = this.nextToReturn(index + 1);
				return tmp;            
			}
		};
	}

	@Override
	public IntStream neighborStream(int src) {
		var spliteraror = new Spliterator.OfInt(){
			
			private final Iterator<Integer> it = neighborIterator(src);
			
			
			@Override
			public long estimateSize() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int characteristics() { // tous les elts sont distincts et non null
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public OfInt trySplit() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean tryAdvance(IntConsumer action) { // j'essaie d'avancer dans mon itérateur
				// TODO Appliquer le consumer
				return false; // je ne peut pas avancer
			}
			
		};
		
		return null;
		//return StreamSupport.intStream(spliterator, null);
	}
	
	
	
	/*
	 * Q1 - On multiplie i par la taille du tableau et un ajoute j
	 * Q2 - Erasure -> on ne peut pas créer un tableau de type paramétré (car le type param. n'existe plus à l'éxécution), sans le cast on doit caster les elements
	 * a chaque fois qu'on les insére. Je garanti qu'il n'u aura que des T dedans. Pas de getter sur la tableau
	 * Q4 - Optional -> Dans le cas ou le résultat d'un calcul ne peut pas exister, au lieu d'utiliser null, on utilise Optional
	 * nb :  static -> type param pas lié avec la type de la classe
	 * Q7 - remove(..) est déja implémenter dans l'interface Iterator comme méthode par défaut
	 */
	
	
	
	
}
