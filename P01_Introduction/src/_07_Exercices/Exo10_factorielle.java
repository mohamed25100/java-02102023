package _07_Exercices;

import java.util.Scanner;

public class Exo10_factorielle {
	/*
	 * Demander à l'utilisateur de choisir un nombre entier et retourner sa
	 * factorielle. Utiliser la récursivité.
	 * n! = n*(n-1)! si n!=1
	 * 1! = 1;
	 * 2! = 2 * 1 = 2 * 1!
	 * 3! = 3 * 2 * 1 = 3 * 2!
	 */
	
	public static long factorielle(long nombre){
		
		if(nombre == 1) return 1;
		
		return nombre * factorielle(nombre -1);
	}
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		System.out.print("Saisir un entier (pas trop grand....) : ");

		long nombre = clavier.nextLong();
		
		System.out.println(nombre + "! = " + factorielle(nombre));
		
		clavier.close();
	}
}
