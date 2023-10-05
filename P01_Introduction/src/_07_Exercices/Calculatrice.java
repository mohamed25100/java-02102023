package _07_Exercices;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Saisir le premier nombre : ");
		// la méthode nextDouble permet de récupérer un nombre à virgule flottante
        double v1 = clavier.nextDouble();
        
        System.out.print("Saisir l'opérateur (+ - * /) : ");
        char operateur = clavier.next().charAt(0);

        System.out.print("Saisir le deuxième nombre : ");
        // la méthode nextDouble permet de récupérer un nombre à virgule flottante
        double v2 = clavier.nextDouble();

        double resultat = 0.0;
        boolean erreur = false;
        
        switch (operateur) {
        case '+':resultat = v1 + v2;break;
        case '-':resultat = v1 - v2;break;
        case '*':resultat = v1 * v2;break;
        case '/':
        	if (v2 != 0) {resultat = v1 / v2;} 
        	else {
        		System.out.println("Erreur : Division par 0 impossible.");
                erreur = true;
            }break;
        default:
            System.out.println("Erreur : Opérateur invalide.");
            erreur = true;
    }
        if (!erreur) {
            System.out.println("Résultat : " + resultat);
        }
        
        clavier.close();
	}

}