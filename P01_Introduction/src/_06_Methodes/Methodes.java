package _06_Methodes;

public class Methodes {

	/*
	 * Pour la javadoc :
	 * 
	 * Projet => Generate Javadoc Spécifier le chemin du javadoc.exe
	 * Sélectionner les éléments à commenter Spécifier le dossier de destination Finish
	 * En cas de problème d'accent : avant de cliquer sur finish, next => next => Extra
	 * Javadoc options : -encoding utf8 -docencoding utf8 -charset utf8
	 */

	/*
	 * Une méthode représente un bloc d'instructions réutilisable. Elle permet
	 * d'éviter les répétitions de code. Une méthode se différencie d'une fonction
	 * en ce qu'elle est rattachée à un objet.
	 * 
	 * Déclaration (signature):
	 * 
	 * Visibilité [mot-clé(s)] type-retour nomMethode(params) {instruction(s)}
	 * 
	 * Une méthode peut avoir plusieurs signatures/prototypes (avec différents
	 * paramètres) : On parle de 'surcharge' de méthode
	 */
	
	/*
	 * Il existe différents niveaux de visibilité (ou modificateurs
	 * d'accès) permettant de gérer l'accès aux méthodes, aux
	 * variables et aux classes.
	 * 
	 * Les niveaux de visibilité déterminent quelles
	 * parties de votre code peuvent accéder à une méthode ou à une variable
	 * particulière. Les principaux niveaux de visibilité en Java sont les suivants
	 * :
	 * 
	 * public :
	 * 
	 * Les méthodes, variables ou classes déclarées avec le modificateur public sont
	 * accessibles depuis n'importe où dans votre programme, que ce soit à
	 * l'intérieur de la classe elle-même, d'une autre classe dans le même package
	 * ou d'une classe dans un package différent.
	 * 
	 * private :
	 * 
	 * Les méthodes ou variables déclarées avec le modificateur private sont
	 * accessibles uniquement à l'intérieur de la classe où elles sont définies.
	 * Elles ne sont pas accessibles depuis d'autres classes, même si elles sont
	 * dans le même package.
	 * 
	 * protected :
	 * 
	 * Les méthodes ou variables déclarées avec le modificateur protected sont
	 * accessibles à l'intérieur de la classe où elles sont définies, ainsi qu'à
	 * toutes les sous-classes (mêmes si elles sont dans un package différent) et
	 * aux classes du même package.
	 * 
	 * Package-Private (Aucun modificateur) :
	 * 
	 * Si vous ne spécifiez aucun modificateur (c'est-à-dire que vous n'utilisez pas
	 * public, private ou protected), la méthode ou la variable est considérée comme
	 * "package-private" ou "default". Cela signifie qu'elle est accessible
	 * uniquement aux classes du même package, mais pas aux classes d'autres
	 * packages.
	 */

	/**
	 * Méthode afficher
	 */
	public static void afficher() {
		System.out.println("Méthode afficher");
	}

	/**
	 * Méthode afficher surchargée
	 * 
	 * @param text description du paramètre
	 */
	public static void afficher(String text) {
		System.out.println(text);
	}
	
	/**
	 * Méthode afficher doubleme,nt surchargée
	 * 
	 * @param tab tableau d'entiers
	 */
	public static void afficher(int[] tab) {
		System.out.println("Afficher tableau");
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	/**
	 * Méthode permettant de sommer 2 entiers
	 * 
	 * @param v1 premier élément à sommer
	 * @param v2 second élément à sommer
	 * @return la somme des 2 entiers passés en paramètres
	 */
	public static int somme(int v1, int v2) {
		return v1 + v2;
	}

	/**
	 * Méthode permettant de ommer un tableau d'entiers
	 * 
	 * @param tab le tableau d'entiers à sommer
	 * @return la somme des éléments du tableau
	 */
	public static int somme(int[] tab) {
		int result = 0;

		for (int item : tab) {
			result += item;
		}

		return result;
	}

	/**
	 * Méthode afficher avec nombre d'arguements variables
	 * 
	 * @param tab liste des éléments à afficher
	 */
	public static void afficher(String... tab) {

		for (String item : tab) {
			System.out.println(item);
		}
	}

	/*
	 * Une méthode récursive est un méthode qui s'appuie sur sa propre exécution.
	 * 
	 * Elle s'appelle donc elle-même pour calculer un résultat.
	 * 
	 * Un algorithme récursif doit en premier lieu envisager les cas terminaux.
	 * 
	 * Ceci afin d'arrêter la récursivité
	 */

	/**
	 * Méthode power
	 * 
	 * @param valeur la valeur à élever à une puissance
	 * @param pow    puissance à calculer
	 * @return valeur élevée à la puissance pow
	 */
	public static int power(int valeur, int pow) {

		if (pow == 0)
			return 1;

		// 2^3 = 2*2*2 = 2 * 2^2
		// 2^n = 2*2*...*2 = 2 * 2^(n-1)
		// valeur^pow = valeur*valeur*valeur = valeur * valeur^(pow-1)

		return valeur * power(valeur, pow - 1);
	}

	/**
	 * Point d'entrée de l'application...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		afficher();

		afficher("Hello World !");

		int[] tab = { 20, 30, 40 };

		afficher(tab);

		afficher("Somme(2, 3) = " + somme(2, 3));

		afficher("Somme({ 20, 30, 40 }) = " + somme(tab));

		afficher("power(2, 3) = " + power(2, 3));
		System.out.println();
		afficher("riri");
		System.out.println();
		afficher("riri", "fifi");
		System.out.println();
		afficher("riri", "fifi", "loulou");
	}
}
