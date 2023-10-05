package _05_Instructions;

import java.util.ArrayList;
import java.util.Scanner;

public class Boucles {

	/*
	 * Une boucle permet de répéter (itérer) un certain nombre de foi une
	 * instruction ou un bloc d'instructions. 3 mots clés perettent de définir des
	 * boucles : - for - while - do while
	 */
	public static void main(String[] args) {

		System.out.println("\n*********** BOUCLE FOR ***********\n");
		/*
		 * La boucle 'for' permet de répéter un nombre déterminé de fois.
		 * 
		 * Syntaxe : for(initExpr; testExpr; incExpr){Bloc d'instructions}
		 * 
		 * Avec : - initExpr : expression d'initialisation - textExpr : expression de
		 * test - incExpr : expression d'incrémentation
		 */
		String[] months = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Décembre" };

		for (int index = 0; index < months.length; index++) {
			System.out.println(months[index]);
		}

		System.out.println("\n*********** BOUCLE FOR AVEC BREAK ***********\n");

		for (int index = 0; index < months.length; index++) {

			if (months[index].equals("Octobre")) {
				System.out.println("L'instruction break permet de stopper l'exécution de la boucle");
				break;
			}

			System.out.println(months[index]);
		}

		System.out.println("\n*********** BOUCLE FOR AVEC CONTINUE ***********\n");

		for (int index = 0; index < months.length; index++) {

			if (months[index].equals("Octobre")) {
				System.out.println("L'instruction continue permet de passer directement à l'itération suivante");
				continue;
			}

			System.out.println(months[index]);
		}

		System.out.println("\n*********** BOUCLE FOR DE TYPE FOREACH ***********\n");

		/*
		 * La boucle foreach permet de répéter un bloc d'instruciton pour chaque élément
		 * d'un tableau ou d'une collection.
		 * 
		 * Java ne porpose pas le mot clé foreach. La boucle est do,nc mise en oeuvre
		 * avec le mot clé 'for'
		 * 
		 * syntaxe :
		 * 
		 * for(type element : collection){bloc d'instuctions à itérer}
		 */

		int[] intArray = { 10, 20, 30, 40, 50 };

		for (int value : intArray) {
			System.out.println(value);
		}

		System.out.println("\n***********.FOREACH() ***********\n");

		/*
		 * Il existe une méthode .foreach() applicable aux collections
		 */

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();

		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);

		intArrayList.forEach(x -> System.out.println(x));

		System.out.println("\n*********** BOUCLE WHILE ***********\n");

		/*
		 * La boucle 'while' permet de répter un bloc d'instructions tant qu'une
		 * condition est vérifiée.
		 * 
		 * Syntaxe : while(testExpr){bloc d'intructions}
		 */

		Scanner clavier = new Scanner(System.in);

		System.out.print("Entrez votre age : ");

		int age = clavier.nextInt();

		while (age <= 0) {
			System.out.println("Entrez un age positif");
			age = clavier.nextInt();
		}

		System.out.println("Vous avez " + age + " ans.");

		System.out.println("\n*********** BOUCLE DO WHILE ***********\n");

		/*
		 * La boucle do while se différencie de la boucle while en ce que la condition
		 * est vérifiée après l'exécution du bloc d'instructions.
		 * 
		 * On on est donc certain de passer au moins une fois dans le bloc
		 * d'instructions. Et ce même si la condition était fause dès le départ.
		 */

		age = 10; // age <= 0 est faux, mais on passera quand meêm au moins une fois dans la
					// boucle do while

		do {
			System.out.print("Entrez un age positif : ");
			age = clavier.nextInt();
		} while (age <= 0);

		System.out.println("Vous avez " + age + " ans.");

		System.out.println("\n*********** EXERCICES ***********\n");

		System.out.println("\n*********** SERIE HARMONIQUE ***********\n");

		// Série harmonique : Saisir un nombre entier n
		// Et calculer la somme des n premiers termes de la série harmonique :

		// S(1) = 1
		// S(2) = 1 + 1/2 = 1.5
		// S(3) = 1 + 1/2 + 1/3 =...
		// S(n) = 1 + 1 / 2 + 1 / 3 + 1 / 4 + ... +1 / n
		// ...
		// Afficher toutes les valeurs de la série harmonique jusqu'à l'ordre 'n'

		System.out.print("Entrez un entier positif n :");

		int n = clavier.nextInt();

		double result = 0.0;

		for (int i = 1; i <= n; i++) {
			result += 1.0 / i;
			System.out.println("S(" + i + ") = " + Math.round(result * 100) / 100.0);
		}

		System.out.println("\n*********** QUADRILLAGE ***********\n");
		// Quadrillage :Créer un quadrillage dynamiquement
		// Saisir le nombre de colonnes et de lignes
		// ex: pour 2 3
		// [0,0][0,1]
		// [1,0][1,1]
		// [2,0][2,1]

		System.out.print("Nombre de lignes :");
		int li = clavier.nextInt();

		System.out.print("Nombre de colonnes :");
		int co = clavier.nextInt();

		for (int l = 0; l < li; l++) {
			
			for (int c = 0; c < co; c++) {
				System.out.print("[" +l +"," + c +"]");
			}
			System.out.println();
		}

		clavier.close();
	}
}
