package _02_EntreesSorties;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entier :");
		
		int n = clavier.nextInt();
		
		System.out.println("Le carré de " + n + " vaut " + n * n);

		System.out.println("Entrez un nombre à virgule :");
		
		double d = clavier.nextDouble(); // Attention, il faut entrer les nombres à virgule aavec une virgule (pas un point)
		
		System.out.println("Vous avez entré : " + d);
		
		System.out.println("Entrez un mot : ");
		
		String mot = clavier.next(); // La méthode next permet de récupérer un mot
		
		System.out.println("mot = " + mot);
		
		System.out.println("Entrez une phrase : ");
		
		String phrase = clavier.next() + clavier.nextLine(); // La méthode nextLine permet de récupérer une ligne entière
		
		System.out.println("phrase = " + phrase);
		
		clavier.close();
	}
}
