package tp4_mlv;


public class Main {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	private int fooMlv;
	
	public int getFoo() {
		return fooMlv;
	}
	
	public void setFoo(int foo) {
		this.fooMlv = foo;
	}
	public Main(int foo) {
		super();
		this.fooMlv = foo;
	}


	/**
	 * Main
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello Eclipse");

		int calc = 2 + 3;
		int a = calc + 4;

		@SuppressWarnings("deprecation")
		Integer integer = new Integer(2);

		String s;




	}

	
	/**
	 * 7) 
	 * 		1.  sysout + CTRL + Space dans un main  permet d'ecrire rapidement  la methode d'affichage System.out.println() (raccourci)
	 * 		2.  toStr + CTRL + Space  dans une classe permet d'auto generer une nouvelle methode toString() e redefinir.(avec l'annotation override)
	 * 		    pour le compilateur.
	 * 		3.  get + Ctrl + Space genere le getter associe au champ foo de la classe Main.
	 * 		    set + Ctrl + Space genere le setter associe au champ foo de la classe Main.
	 * 		4.  Source > Generate constructor using fields()...
	 * 		5.  On peut renommer notre classe. De meme avec notre champ foo -> fooMlv
	 * 		6.  Alt + Shift +L : Remplace toutes les occurrences de l'expression selectionnee par des references de la variable locale.
	 * 		    2 + 3 est "stocker" dans la variable primitve calc.
	 * 		7.  Si l'on fait Ctrl +1 l'IDE nous propose un ensemble d'options, comme ajouter une annotation, supprimer la variable.
	 * 		8.  On accede au code source de la classe String
	 * 		9.	On accede au code source de la methode toString() et code source de la premiere classe Object
	 * 			toString herite de la classe Object.
	 * 	    10.	CTRL + Shift + G recherche les elements associe au champ foo (accesseurs, constructeur..)
	 * 		11. CTRL + Shift + O Realise les imports neccessaires.
	 */
	
}
