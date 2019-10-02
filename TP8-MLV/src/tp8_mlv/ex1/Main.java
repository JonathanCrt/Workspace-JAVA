package tp8_mlv.ex1;

public class Main {
	public static void main(String[] args) {
		/**
		 * 1- Pour le premier appel, 1 sera affich� car le champ x n'est pas modifi� dans la classe A.
		 * 2- Pour le second appel, 2 sera affich� car bien que on h�rite de la classe A, il s'agit du champ x
		 * de la classe B qui sera affich�.
		 * 
		 * 3- in A.printX
		 * x 1
		 * getX() 2
		 * Pour le troisieme appel, La valeur affich�e est diff�rente car le typage de l'objet appel� 
		 * se fait dynamiquement � l'ex�cution.
		 * L'appel au champ se fait de mani�re statique.
		 * L'appel a un champ et une m�thode ne se fait pas au m�me moment.
		 * 
		 * 4- 1 car l'appel est r�alis� sur la m�thode de la classe A.
		 * 
		 */
	}
}
