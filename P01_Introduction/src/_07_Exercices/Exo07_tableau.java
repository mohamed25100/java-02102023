package _07_Exercices;

import java.util.Scanner;

public class Exo07_tableau {
	/*
	 * Insertion dans un tableau trié
	 * 
	 * Il faut insérer la nouvelle donnée directement à la bonne place.
	 * 
	 * C’est le mécanisme de base du tri par insertion.
	 * 
	 * L’insertion d’une donnée à une place précise libère la case qui doit recevoir
	 * la donnée, en décalant d’une case toute la partie droite du tableau à partir
	 * de cette position, puis copie la donnée dans la case libérée. Pour éviter
	 * toute perte de données, le décalage part de la fin pour remonter ver la
	 * position d’insertion. Le décalage débute à la dernière case qui contient une
	 * donnée, se poursuit sur l’avant-dernière case, et ainsi de suite.
	 * 
	 * Créer et initialiser un tableau, puis insérer un élément à la position
	 * spécifiée dans ce tableau (de 0 à N-1). Pour insérer un nouvel élément dans
	 * le tableau, déplacez les éléments de la position d'insertion donnée vers une
	 * position vers la droite.
	 * 
	 * Exemple
	 * 
	 * Données d'entrée : Saisir le nombre de notes : 4
	 * 
	 * Note 1 : 8.5
	 * 
	 * Note 2 : 9.5
	 * 
	 * Note 3 : 12.5
	 * 
	 * Note 4 : 18.0
	 * 
	 * Saisir la note 5 : 11.0
	 * 
	 * Données de sortie : [8.5, 9.5, 11.0, 12.5, 18.0]
	 */

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);

		System.out.print("Saisir le nombre de notes : ");

		int nNotes = clavier.nextInt();

		double[] notes = new double[nNotes + 1]; // +1 car on va insérer une note après

		for (int i = 0; i < nNotes; i++) {
			System.out.print("Notes " + (i + 1) + " : ");

			notes[i] = clavier.nextDouble();
		}

		System.out.print("Saisir la note " + (nNotes + 1) + " : ");

		double newNote = clavier.nextDouble();

		int newPos = 0;

		// Calcul de la position de la nouvelle note
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] < newNote) {
				newPos++;
			}
		}

		// Décallage des notes supérieures à la nouvelle note
		for (int i = nNotes; i >= newPos; i--) {
			notes[i] = notes[i - 1];
		}

		// Insertion de la nouvelle note
		notes[newPos - 1] = newNote;

		System.out.print("Nouveau classement : ");
		for (double note : notes) {
			System.out.print(note + " ");
		}

		clavier.close();

		/*
		 * Remarque : Si on avait eu le droit d'utiliser des collections, on aurait pu :
		 * - créer une arrayList,
		 * - y ajouter les notes au fur et à mesure
		 * - classer la collection avec la Collections.sort()
		 */
	}
}
