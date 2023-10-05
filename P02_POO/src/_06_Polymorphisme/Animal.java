package _06_Polymorphisme;

public class Animal {

	/*
	 * Le concept de généricité peut s'appliquer à des classes, interfaces et méthodes : 
	 * 
	 * - identiques d'un point d evue algorithmique
	 * 
	 * - mais manipulant des types de données différents
	 * 
	 * 
	 * Intérêt : 
	 * 
	 * - Optimisation du code
	 * 
	 * - moins de transtypage à faire (cast)
	 * 
	 * - moins de risque d'erreurs à l'exécution...
	 */
	public void communiquer() {
		System.out.println("Je suis un animal communiquant.");
	}
}
