package _01_Constructeur;

public class User {

	// variables d'instance : chaque instance de la classe 'User' a ses propores 'nom', 'prenom', 'age'
	public String nom;
	public String prenom;
	public int age;

	// Un constructeur est une méthode spéciale :
	// - qui porte le même nom que la classe
	// - qui ne retourne rien (implicitement une instance de la classe)
	
	
	// Variable de classe : commiune à toutes les instances de la classe
	// Une variable de classe est définie avec le mot clé 'static'
	public static int nUsers = 0;
	
	// constructeur sans paramètre : il est implicitement créé en l'absence de tout
	// autre constructeur
	public User() {
		System.out.println("Appel du constructeur sans paramètre");
		nUsers++;
	}

	// Comme une méthode normale, les constructeurs sont surchargeables.

	// Constructeur à 2 paramètres
	public User(String nom, String prenom) {
		// 'this' fait référence à l'objet courant
		this(); // Appel au constructeur sans paramètre
		this.nom = nom;
		this.prenom = prenom;
		// nUsers++;
		System.out.println("Appel du constructeur à 2 paramètres");
	}

	// Constructeur à 3 paramètres
	public User(String nom, String prenom, int age) {
		// le mot clé 'super' fait référence à la superclasse
		// super(); Appel au constructeur de la super classe

		/*
		 * En java toutes les classes héritent implicitement de la class "Object".
		 * 
		 * Comme la classe 'User' n'hérite d'aucune autre classe, sa super classe est
		 * donc la classe 'Object'
		 */

//		this.nom = nom;
//		this.prenom = prenom;
		this(nom, prenom); // Appel au constructeur à 2 paramètres
		this.age = age;
		// nUsers++;
		System.out.println("Appel du constructeur à 3 paramètres");
	}
}
