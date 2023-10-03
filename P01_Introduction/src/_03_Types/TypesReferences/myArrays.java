package _03_Types.TypesReferences;

import java.util.ArrayList;
import java.util.Arrays;

public class myArrays {

	public static void main(String[] args) {

		/*
		 * Un tableau est de type référence. Une fois initialisé, il n'est plus possible
		 * de changer sa taille. Mai comme pour la classe String, il est néamoin
		 * possible de réaffecter un nouveau tableau à la variable originale.
		 */

		int[] tab; // Déclaration d'un tableau d'entiers non initialisé

		String[] names = { "riri", "fifi" }; // Déclaration et initialisation d'un tableau de chaines de caaractères

		// La propriété length retourne la taille d'un tableau.
		System.out.println(names.length); // 2

		System.out.println(names[1]); // fifi

		names[1] = "loulou"; // Affectation de la valeur 'loulou' à l'élément d'indice 1 du tableau 'names'

		System.out.println(names[1]);

		System.out.println("--------- Parcours du tableau avec boucle for ---------");

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("--------- Parcours du tableau avec boucle for 'type foreach' ---------");

		for (String name : names) {
			System.out.println(name);
		}

		/*
		 * Tableaux de tableaux
		 */

		String[][] names2D = { { "riri", "fifi", "loulou" }, { "donald", "daisy", "picsou" } };

		System.out.println("Parcours d'un tableau 2D avec boucles 'for' imbriquées.");

		for (int line = 0; line < names2D.length; line++) {
			for (int column = 0; column < names2D[line].length; column++) {
				System.out.print(names2D[line][column] + " ");
			}
		}

		/*
		 * Apparté : ArrayList
		 * 
		 * Un arrayList est un objet de type "collection" (et na pas tableau). Comme un
		 * tableau, une Colelction permet de stoker un ensemble de valeurs. Mais à la
		 * différence d'un tableau, une collection a une taille dynamique. 
		 */
		
		ArrayList<String> namesCollection = new ArrayList<>(); // Collection initialisée sans lui paser de taille
		namesCollection.add("riri");
		namesCollection.add("fifi");
		namesCollection.add("loulou");
		
		System.out.println("Size = " + namesCollection.size()); // 3
		
		//namesCollection[1] = "nouvelle valeur"; // Erreur : une collection n'est pas un tableau
		namesCollection.set(1,  "nouvelle valeur");
		
		System.out.println(" Arrays : Classe utilitaire pour les tableaux...");
		
		String[] tabStr = new String[5];
		
		Arrays.fill(tabStr, "Bonjour");
		
		// System.out.println(tabStr);
		System.out.println(Arrays.toString(tabStr)); // toString => affiche le tableau complet sans avoir à faire de bouble
		
		int tab1[] = {1,5,7,3,8};
		
		
		int tab2[] = {1,5,7,3,8};
		
		System.out.println(Arrays.equals(tab1, tab2)); // true
		
		Arrays.sort(tab2);
		
		System.out.println(Arrays.toString(tab2));
		
		System.out.println(Arrays.binarySearch(tab2, 5)); // retourne 2 car 5 est à l'indice 2 (et donc en position 3)
		System.out.println(Arrays.binarySearch(tab2, 55)); // retourne une valeur négative si la valeur cherchée ne fait pas partie du tableau.
		
		

	}
}
