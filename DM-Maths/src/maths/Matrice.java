package maths;

import java.util.Arrays;
import java.util.Optional;


/**
 * Devoir maison de Math�matiques
 * @authors jonathan CRETE & Emilie Marti
 */

public class Matrice {

	private final int n; /* nombre de lignes */
	private final int m; /* nombre de colonnes */
	private final Rational[][] coeff; /* liste des coefficients */

	/**
	 * Cr�ation d'une matrice
	 * 
	 * @param coeff coefficients de la matrice
	 */
	public Matrice(Rational[][] coeff) {
		n = coeff.length;
		m = coeff[0].length;
		this.coeff = coeff;
	}

	/**
	 * Cr�ation d'une matrice
	 * 
	 * @param coeff coefficients de la matrice, donn�s comme long
	 */
	public Matrice(long[][] coeff) {
		n = coeff.length;
		m = coeff[0].length;
		this.coeff = new Rational[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				this.coeff[i][j] = new Rational(coeff[i][j]);
			}
		}
	}

	/**
	 * Calcul de la somme matricielle this + M (si les dimensions de this et M
	 * l'autorisent)
	 * 
	 * @param M matrice � ajouter : tableau n x m
	 * @return somme this + M : tableau n x m
	 */
	public Matrice plus(Matrice M) {
		if (n != M.n || m != M.m) {
			throw new IllegalArgumentException("Dimensions incorrectes");
		}

		Rational[][] sum = new Rational[n][m];
		
		int i,j;
		for(i = 0; i < M.n; i++) {
			for(j = 0; j< M.m;  j++) {
				sum[i][j] = this.coeff[i][j].plus(M.coeff[i][j]);			
			}
		}
		return new Matrice(sum);
	}
	
	
	

	/**
	 * Calcul du produit matriciel this M (si les dimensions de this et M
	 * l'autorisent)
	 * 
	 * @param M matrice � multiplier : tableau m x p
	 * @return produit this M : tableau n x p
	 */
	public Matrice times(Matrice M) {
		if (m != M.n) {
			throw new IllegalArgumentException("Dimensions incorrectes");
		}
		int p = M.m;

		Rational[][] prod = new Rational[n][p];
		int i, j, k;
		for(i = 0; i < n; i++) {
			for(j = 0; j < p; j++) {
				Rational calc = new Rational(0);
 				for(k = 0; k < m; k++) {
					
					calc =  calc.plus(this.coeff[i][k].times(M.coeff[k][j]));

				}
 				prod[i][j] = calc;
			}
		}
		return new Matrice(prod);
	}

	/**
	 * Calcul de la transpos�e de this
	 * 
	 * @return transpos�e de this : tableau m x n
	 */
	public Matrice transpose() {
		Rational[][] trans = new Rational[m][n];
		
		int i,j;
		for(i = 0; i <m; i++) {
			for(j = 0; j < n; j++) {
				trans[j][i] = coeff[i][j];
			}
		}
		return new Matrice(trans);
	}

	/**
	 * �change les lignes i et j de la matrice
	 * 
	 * @param i premi�re ligne � �changer
	 * @param j deuxi�me ligne � �changer
	 */
	private void swapRows(int i, int j) {
		Rational[] swap = coeff[i];
		coeff[i] = coeff[j];
		coeff[i] = swap;
	}

	/**
	 * Ajoute a fois la ligne i de this � sa ligne j
	 * 
	 * @param i ligne � ajouter (multipl�e par a)
	 * @param j ligne � laquelle on ajoute a fois la ligne j
	 * @param a scalaire par lequel on multiplie la ligne i quand on l'ajoute
	 */
	private void transvection(int i, int j, Rational a) {
		/** Remplir ici le code manquant */
	}

	/**
	 * Mutiplie par a la ligne i de this
	 * 
	 * @param i ligne � multiplier par a
	 * @param a scalaire par lequel on multiplie la ligne i
	 */
	private void multiplyRow(int i, Rational a) {
		/** Remplir ici le code manquant */
	}

	/**
	 * Calcul de la matrice identit� de m�mes dimensions que this (si les dimensions
	 * de this l'autorisent)
	 * 
	 * @return matrice identit� : tableau n x n
	 */
	public Matrice identity() {
		if (m != n) {
			throw new IllegalArgumentException("Dimensions incorrectes");
		}
		Rational[][] id = new Rational[n][n];
		/** Remplir ici le code manquant */
		return new Matrice(id);
	}

	/**
	 * Calcul d'une copie de this
	 * 
	 * @return copie de this : tableau n x m
	 */
	public Matrice clone() {
		Rational[][] clone = new Rational[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				clone[i][j] = coeff[i][j];
			}
		}
		return new Matrice(clone);
	}

	/**
	 * Calcul de l'inverse de this
	 * 
	 * @return inverse de this : tableau n x n
	 */
	public Matrice inverse() {
		if (m != n) {
			throw new IllegalArgumentException("Dimensions incorrectes");
		}
		Matrice clone = clone();
		Matrice id = identity();
		/** Remplir ici le code manquant */
		/** On sugg�re tr�s fortement d'utiliser l'algorithme du pivot de Gauss */
		return id;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(coeff);
	}

}
