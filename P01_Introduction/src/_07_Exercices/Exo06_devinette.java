package _07_Exercices;

import java.util.Random;
import java.util.Scanner;

public class Exo06_devinette {
	/*
	 * L'utilisateur doit deviner un nombre secret (généré automatiquement) entre 1
	 * et 1000. On va donc demander à l'utilisateur de trouver ce nombre secret.
	 * Tant qu'il n'a pas trouvé ce nombre on lui demandera encore et encore,
	 * jusqu'à ce qu'il le trouve.
	 * 
	 * Si l'utilisateur choisit un nombre trop petit, l'application lui dira que le
	 * nombre qu’il a rentré est trop petit.
	 * 
	 * Si l'utilisateur choisit un nombre trop grand, l'application lui dira que le
	 * nombre qu’il a rentré est trop grand.
	 * 
	 * Si l'utilisateur trouve le nombre recherché, l'application lui indiquera le
	 * nombre d'essais dont il a eu besoin
	 * 
	 * Exemple : Entrée : Entrer un nombre entre 1 et 1000 (1 - 1000) : 500
	 * 
	 * Sorties possibles :
	 * 
	 * - Votre nombre est trop grand !
	 * 
	 * - Votre nombre est trop petit !
	 * 
	 * - Trouvé en 8 essais ! Bien Joué !
	 */

	public static void main(String[] args) {

		int numberToFind = new Random().nextInt(1000) + 1;

		// int numberToFind = (int)(Math.random() * 999) + 1;

		int count = 1;

		Scanner clavier = new Scanner(System.in);

		System.out.println("Veuillez choisir un entier enre 1 et 1000 :");

		int choice = clavier.nextInt();

		while (choice != numberToFind) {

			if (choice > numberToFind) {
				System.out.println("Trop grand ! Essaye encore !");
			} else if (choice < numberToFind) {
				System.out.println("Trop petit ! Essaye encore !");
			}

			choice = clavier.nextInt();

			count++;
		}

		clavier.close();

		System.out.println("Trouvé en " + count + " coups !");
	}
}
