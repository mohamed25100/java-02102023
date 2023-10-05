package _07_Exercices;

import java.util.Scanner;

public class Exo02_racinecarree {

	//Ecrire un programme qui demande à l'utilisateur de rentrer un nombre entier et qui retourne sa racine carrée.

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer un entier : ");
		
		int n = clavier.nextInt();
		
		System.out.println("La racine carrée de " + n + " vaut " + Math.sqrt(n));
		
		clavier.close();
	}
}
