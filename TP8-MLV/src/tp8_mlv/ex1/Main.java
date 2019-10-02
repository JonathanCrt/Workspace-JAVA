package tp8_mlv.ex1;

public class Main {
	public static void main(String[] args) {
		/**
		 * 1- Pour le premier appel, 1 sera affiché car le champ x n'est pas modifié dans la classe A.
		 * 2- Pour le second appel, 2 sera affiché car bien que on hérite de la classe A, il s'agit du champ x
		 * de la classe B qui sera affiché.
		 * 
		 * 3- in A.printX
		 * x 1
		 * getX() 2
		 * Pour le troisieme appel, La valeur affichée est différente car le typage de l'objet appelé 
		 * se fait dynamiquement à l'exécution.
		 * L'appel au champ se fait de manière statique.
		 * L'appel a un champ et une méthode ne se fait pas au même moment.
		 * 
		 * 4- 1 car l'appel est réalisé sur la méthode de la classe A.
		 * 
		 */
	}
}
