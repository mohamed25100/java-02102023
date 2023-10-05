package _07_Exercices;

public class Exo01_echange {

	// Permuter 2 variables

	/*
	 * Exemple : Données d'entrée : a = 5, b = 9
	 * Sortie prévue : Avant l’échange : a = 5, b = 9
	 * Après l’échange : a = 9, b = 5
	 */
	
	public static void echange(int a, int b) {
		
		/*
		 * La portée des variables a, b et temp est limitée au bloc d'instruction courant...
		 * L'échange restera donc confiné dans ce bloc...
		 */
		int temp = a;
		
		a = b;
		
		b = temp;
	}

	public static void main(String[] args) {

		int a = 5;

        int b = 9;

        System.out.println("Avant l'échange : a = " + a + ", b = " + b);

        int tempo = a;

        a = b;

        b = tempo;
        
        System.out.println("Après l'échange : a = " + a + ", b = " + b);
        
        echange(a, b); // marche pas car les paramètres sont passés par copie...
        
        System.out.println("Après l'échange via la méthode 'echange' : a = " + a + ", b = " + b);
	}
}
