package _07_Exercices;

import java.util.Scanner;

public class Exo03_pairimpair {
	/*
	 * Vérifier si un nombre est pair ou impair
	 * Un nombre pair est un multiple de 2. Il peut s’écrire sous la forme b = 2*k avec k un entier :
	 * 21 est un nombre impair car 21 = 2 * 10 + 1 (Le reste vaut 1 : R = 1)
	 * 30 est un nombre pair car 30 = 2 * 15 (R = 0)
	 */
	
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entre un entier :");
		
		int n = clavier.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " est pair");
		}
		else{
			System.out.println(n + " est impair");
		}
		
		clavier.close();
	}
}
