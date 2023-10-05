package _07_Exercices;

import java.util.Scanner;

public class Exo08_tableau2 {

	/**
	 * Suppression d’un élément dans un tableau trié
	 * 
	 * La suppression d’un élément d’un tableau contenant un ensemble de données
	 * décale vers la gauche les éléments situés à droite de l’élément à supprimer.
	 * 
	 * Le premier décalage écrase la valeur à supprimer par le contenu de la case de
	 * droite.
	 * 
	 * Les décalages successifs répètent cette opération sur les cases suivantes,
	 * jusqu’à la fin des données.
	 * 
	 * Créer et initialiser un tableau, puis supprimer un élément de ce tableau à la
	 * position spécifiée (de 0 à N-1).
	 * 
	 * Pour supprimer un élément du tableau, déplacez les éléments, juste après la
	 * position donnée vers une position à gauche et réduisez la taille du tableau.
	 * 
	 * Exemple :
	 * 
	 * Données d'entrée : Saisir le nombre de notes :
	 * 
	 * Note 1 : 8.5
	 * 
	 * Note 2 : 9.5
	 * 
	 * Note 3 : 11
	 * 
	 * Note 3 : 12.5
	 * 
	 * Note 4 : 18.0
	 * 
	 * Saisir la position de l'élément à supprimer : 2
	 * 
	 * Données de sortie : [8.5, 11.0, 12.5, 18.0]
	 * 
	 */
	
	// Méthode Eliot
	private static double[] delete(double[] arr, int index) {
		
        double[] result = new double[arr.length - 1];

        if(index >= arr.length || index < 0){
            return arr;
        }

        int i = 0;

        while(i < index) {
            result[i] = arr[i];
            i++;
        }

        i++;

        while(i < arr.length) {
            result[i - 1] = arr[i];
            i++;
        }

        return result;
    }
	

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		System.out.print("Saisir le nombre de notes : ");

		int nNotes = clavier.nextInt();

		double[] notes = new double[nNotes];

		for (int i = 0; i < nNotes; i++) {
			System.out.print("Notes " + (i + 1) + " : ");

			notes[i] = clavier.nextDouble();
		}

		int pos = -1;
		
		while(pos < 1 || pos > nNotes) {
			System.out.println("Saisir la position de l'élément à supprimer entre 1 et " + nNotes);
			
			pos = clavier.nextInt();
		}
		
//		for(int i = pos - 1; i < nNotes - 1; i ++) {
//			notes[i] = notes[i + 1];
//		}
//		
//		notes[nNotes -1] = 0; // Bricolage car la taille du tableau est fixe...
//		
//		nNotes--;
		
		double[] newNotes = delete(notes, pos - 1);
		
		System.out.print("Tableau mis à jour : ");
		
		for(int i = 0; i < newNotes.length; i++) {
			System.out.print(newNotes[i] + " ");
		}
		
		clavier.close();
	}
}
