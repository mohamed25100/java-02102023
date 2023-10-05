package _05_Instructions;

import java.util.Scanner;

public class Conditionnelles {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		System.out.print("Merci de renseigner un nombre entier :");

		int n = clavier.nextInt();

		System.out.println("\n********** if else if else ***********\n");

		if (n > 0) {
			System.out.println("Le nombre est positif");
		} else if (n == 0) {
			System.out.println("Le nombre vaut 0");
		} else if (n * n == 25) {
			System.out.println("Le nombre vaut -5");
		} else {
			System.out.println("le nombre est négatif");
		}

		System.out.println("\n********** Switch ***********\n");
		/*
		 * Switch permet de ne faire qu'une évaluation quel que soit le nombre de cas
		 * possibles.
		 */

		System.out.print("Merci de renseigner un jour de la semaine :");

		int jours = clavier.nextInt();

		switch (jours) {
		case 1:
			System.out.println("lundi");
			break;
		case 2:
			System.out.println("mardi");
			break;
		case 3:
			System.out.println("mercredi");
			break;
		case 4:
			System.out.println("jeudi");
			break;
		case 5:
			System.out.println("vendredi");
			break;
		case 6:
			System.out.println("samedi");
			break;
		case 7:
			System.out.println("dimanche");
			break;
		default:
			System.out.println("Entrée invalide");
		}

		switch (jours) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Semaine de travail");
			break;
		case 6:
		case 7:
			System.out.println("Weenend !");
			break;
		default:
			System.out.println("Entrée invalide");
		}

		// A partir de Java 17
		System.out.println(switch (jours) {
		case 1, 2, 3, 4, 5 -> "semaine de travail";
		case 6, 7 -> "Weekend !";
		default -> "Entrée invalide";
		});

		System.out.println("\n********** Opérateur ternaire ***********\n");
		// Opérateur ternaire
		String message;

		// Sans opérateur ternaire
		if (jours < 6) {
			message = "Semaine de travail";
		} else {
			message = "Week end !";
		}

		// Avec opérateur ternaire
		message = jours < 6 ? "Semaine de travail" : "Week end !";

		System.out.println(message);

		// Exercice : Calculatrice

		// Saisir dan la console :
		// - un nombre à virgule flottante v1
		// - une chaine de caractère opérateur ayant pour valide +, -, *, /
		// - un nombre à virgule flottante v2

		// Afficher :
		// - le résultat de l'opération
		// - Un message d'erreur si ll'opérateur est incirrect
		// - Un message d'erreur si on divise par 0

		System.out.println("\n********** Calcultatrice ***********\n");

		System.out.print("Saisissez un double : ");
		double v1 = Double.parseDouble(clavier.next().replace(',', '.'));

		System.out.print("Saisissez un opérateur (+, -, *, /)");

		String op = clavier.next();

		System.out.print("Saisissez un double : ");
		double v2 = Double.parseDouble(clavier.next().replace(',', '.'));

		switch (op) {
		case "+":
			System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
			break;
		case "-":
			System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
			break;
		case "*":
			System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
			break;
		case "/":
			if (v2 == 0) {
				System.out.println("Erreur : Division par 0");
			} else {
				System.out.println(v1 + " / " + v2 + " = " + (v1 / v2));
			}
			break;
		default:
			System.out.println("L'opérateur " + op + " est invalide");
			break;
		}

		clavier.close();
	}
}
