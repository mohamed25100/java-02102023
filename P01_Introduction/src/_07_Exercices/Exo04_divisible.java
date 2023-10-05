package _07_Exercices;

import java.util.Scanner;

public class Exo04_divisible {

	/*
	 * Vérifier si un nombre est divisible par 3 et 13 ou non. Un nombre entier est
	 * divisible par un autre quand le résultat de la division euclidienne est un
	 * entier sans reste. On peut écrire b = k*a + R, avec R = 0.
	 */

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

//		System.out.println("Entrez un nombre");
//
//		double n = clavier.nextInt();
//
//		double res3 = n % 3;
//		double res13 = n % 13;
//
//		if (res3 == 0 && res13 == 0) {
//			System.out.println("le nombre est divisible par 3 et 13");
//		} else if (res3 == 0) {
//			System.out.println("le nombre est divisible par 3");
//		} else if (res13 == 0) {
//			System.out.println("le nombre est divisible par 13");
//		} else {
//			System.out.println("le nombre n'est pas divisible par 3 ou 13");
//		}

		System.out.println("Saisissez un entier :");
		int e = clavier.nextInt();
		if (e % 3 == 0 && e % 13 == 0) {
			System.out.println(e + " est divisible par 3 et 13.");
		} else {
			System.out.println(e + " n'est pas divisible par 3 ou par 13.");
		}

		clavier.close();
	}
}
