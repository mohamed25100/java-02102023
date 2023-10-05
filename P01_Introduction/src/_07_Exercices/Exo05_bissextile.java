package _07_Exercices;

import java.util.Scanner;

public class Exo05_bissextile {

	public static void main(String[] args) {
		/*
		 * Vérifier si l'année donnée par l'utilisateur est bissextile (366 jours) ou non.
		 * Une année est considérée comme une année bissextile si :
		 * elle est divisible par 4 et non divisible par 100 ;
		 *  ou si elle est divisible par 400
		 * « divisible » signifie que la division donne un nombre entier, sans reste (c'est à dire le reste égale à zéro) : 21 est divisible par 3. 22 non.
		 */
		
		Scanner clavier = new Scanner(System.in);

		System.out.println("Saisissez une année :");
		
		int f = clavier.nextInt();
		
		if ((f % 4 == 0 && f % 100 != 0) || f % 400 == 0) {
			
			System.out.println("L'année " + f + " est bissextile");
		}
		else {
			System.out.println("L'année " + f + " n'est pas bissextile");
		}
		
		clavier.close();
	}
}
