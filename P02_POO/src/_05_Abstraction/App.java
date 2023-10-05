package _05_Abstraction;

public class App {

	public static void main(String[] args) {

		// Forme forme = new Forme(); Interdiction d'instancier une classe abstraite
		
		Carre carre = new Carre(5);
		
		System.out.println("carre.surface() = " + carre.surface());
		
		Cercle cercle = new Cercle(5);
		
		System.out.println("cercle.surface() = " + cercle.surface());
		
		// Une forme peut indifféremment être un Carré ou un Cercle
		// Forme forme = new Cercle(2);
		Forme forme = new Carre(2);
		
		// Mais dans tous les cas, une forme disposera d'une méthode surface...
		System.out.println("forme.surface() = " + forme.surface());
	}
}
