package _07_Exercices;

import java.util.Scanner;

public class Exo11_PGDVC {

	/* PGCD : Plus Grand Dénominateur Commun
	 * Appliquer l’Algorithme d’Euclide qui dit :
	 * si b divise a alors pgcd(a,b) = b
	 * sinon pgcd(a,b) = pgcd(b, a mod b)
	 * 
	 * où a mod b est le reste de la division de a par b.
	 * Ecrivez un programme permettant de trouver le PGCD à partir cet algorithme.
	 */
	
	
	public static int pgcd(int a, int b) {
		
//		if(a % b == 0) {
//			return b;
//		}
		
		// Méthode Krisandra
		if (b == 0) {

			return a;
		}
		
		return pgcd(b, a % b);
	}
	
	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		System.out.print("Saisir un entier : ");
		int n1 = clavier.nextInt();
		
		System.out.print("Saisir second un entier : ");
		int n2 = clavier.nextInt();
		
		System.out.println("Le pgdv de " + n1 + " et " + n2 + " vaut " + pgcd(n1, n2));
		clavier.close();
	}
}
