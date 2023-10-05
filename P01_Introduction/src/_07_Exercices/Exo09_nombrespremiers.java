package _07_Exercices;

import java.util.Scanner;

public class Exo09_nombrespremiers {
	/*
	 * Le problème est de déterminer si un nombre entier est un nombre premier.
	 * 
	 * Définition : Un nombre premier est un nombre :
	 * 
	 * - strictement supérieur à 1
	 * 
	 * - qui n’est divisible (au sens de la division entière) que par 1 et par
	 * lui-même.
	 * 
	 * Ainsi :
	 * 
	 * 2 est un nombre premier (il est uniquement divisible par 1 et par lui-même)
	 * 
	 * 3 aussi
	 * 
	 * 4 n’est pas premier (il est divisible par 2)
	 * 
	 * 5 est premier
	 * 
	 * etc...
	 * 
	 * Le nombre 1 pourrait être considéré comme un nombre premier (il n’est pas
	 * divisible sauf par 1 et par lui-même). Il est exclu de la liste des nombres
	 * premiers par commodité, car il ne respecte pas certaines lois communes à tous
	 * les autres nombres premiers.
	 * 
	 * La méthode de base consiste à prouver que le nombre à traiter n’est pas
	 * premier en recherchant un diviseur qui donne un reste égal à 0.
	 * 
	 * Si on en trouve un, le nombre n’est pas premier.
	 * 
	 * Si aucun diviseur n’est trouvé, il s’agit d’un nombre premier.
	 * 
	 * Ecrivez un premier programme qui effectue ce calcul. On utilisera une boucle
	 * FOR afin de tester tous les diviseurs de 2 au nombre – 1. Le programme
	 * demandera un nombre entier et indiquera s’il est premier ou non.
	 */

	public static boolean nombrePremier(int nombre) {
		
		for(int i = 2; i < nombre; i++) {
			if(nombre % i == 0) {
				return false; // on a trouvé un diviseur
			}
		}
		
		// On n'a pas trouvé de diviseur
		return true;
	}
	
	// Méthode Eliot
	private static boolean isPrime(int n) {

	    //gére les nombres pair, sauf 2 
	    if (n > 2 && n % 2 == 0) {
	        return false;
	    }

	    //gére les cas des nombres impaire

	    int length = (int) Math.sqrt( n);
	    for(int i = 3; i < length; i +=2) {
	        if (n % i == 0) {
	            return false;
	        }
	    }

	    return  true;


	}
	
	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Veuillez entrer un nombre entier positif : ");
		
		int nombre = clavier.nextInt();
		
		// if(nombrePremier(nombre)) {
		if(isPrime(nombre)) {
			System.out.println(nombre + " est un nombre premier");
		}
		else {
			System.out.println(nombre + " n'est pas un nombre premier");
		}
		
		clavier.close();
	}
}
