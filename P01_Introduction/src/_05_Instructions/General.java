package _05_Instructions;

public class General {
	public static void main(String[] args) {

		/*
		 * Une instruction se termine par un ';' Un bloc d'instruction est contenu par
		 * des accolades Les variables déclarées dans un bloc d'instructions ne sont
		 * accessibles que dans ledit bloc.
		 */
		
		System.out.println("Cette instrudction se termine nécessairement par un ';'");
		
		{
			System.out.println("Ceci est la première instruction d'un bloc d'instructions");
			
			int a = 10; // la variable 'a ' n'existe que dans ce bloc d'instructions (et ses éventuels blocs imbriqués)
			
			System.out.println("a = " + a);
			System.out.println("Ceci est la dernière instruction d'un bloc d'instructions");
		}
		
		// System.out.println("a = " + a); Erreur : la variable 'a' n'existe plus ici...
	}
}
