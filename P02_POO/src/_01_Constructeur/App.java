package _01_Constructeur;

public class App {

	/*
	 * La programation Orientée Objet (POO) est paradigme informatique consistant à
	 * définir des 'objets' et à les faires interragir.
	 * 
	 * Qu'est ce qu'un objet ?
	 * 
	 * Un objet est caractérisé par un 'en dedans' et un 'en dehors'.
	 * 
	 * L'en dehors ne doit pas savoir comment fonctionne l'en dedans.
	 * 
	 * L'en dehors ne peut communiquer et interragir avec l'objet qu'à travers une
	 * interface fournie par l'objet.
	 * 
	 * Cette 'interface' se présente sous la forme d'un ensemble :
	 * 
	 * - de propriétés : définissenent l'état de l'objet
	 * 
	 * - de méthodes : définissent son comportement
	 * 
	 * Les objets sont créés à partir de classes.
	 * 
	 * Une classe est donc le 'moule' / mode d'emploi à partir duquel on fabrique
	 * des objets.
	 * 
	 * On appelle ces objets des instances de classe.
	 * 
	 * On instancie donc une classe pour fabriquer des objets du type de la classe.
	 * 
	 * La POO permet :
	 * 
	 * - de créer des objets facilement utilisables tout en masquant la complexité
	 * de leur implémentation.
	 * 
	 * - renforcer la sécurité en évitant la corruption accidentelle de données.
	 * 
	 * Concepts fondamentaux de la POO : Encapsulation, Polymorphisme, l'abstration,
	 * la composition...
	 */

	public static void main(String[] args) {

		System.out.println("Nombre de users : " + User.nUsers); // une variable de classe est accédée via le nom de la
																// classe

		User user = new User(); // Appel du constructeur sans paramètre de la classe 'User' pour instancier un
								// objet nommé 'user'

		user.nom = "Duck"; // Une variable d'instance est accédée via le nom de l'instance
		user.prenom = "Riri";

		System.out.println("Nombre de users : " + User.nUsers);

		System.out.println(user.nom);
		System.out.println(user.prenom);

		System.out.println("---------");
		User user2 = new User("Duck", "Fifi");

		System.out.println(user2.nom);
		System.out.println(user2.prenom);

		System.out.println("Nombre de users : " + User.nUsers);

		System.out.println("---------");
		User user3 = new User("Duck", "Loulou", 12);

		System.out.println(user3.nom);
		System.out.println(user3.prenom);
		System.out.println(user3.age);

		System.out.println("Nombre de users : " + User.nUsers);

		// User user4 = new User("Duck", "Donald", "45"); // The constructor
		// User(String, String, String) is undefined

		// PROBLEME : L'INETERIEUR DE NOTRE CLASSE EST DIRECTEMENT ACCESSIBLE (EN
		// LECTURE ET EN ECRITURE) PAR LE MONDE EXTERIEUR.
		// La classe 'User' ne respecte donc pas complètement le principe d'encapsulation.
		
		user3.age = -5; // On peut donc attribuer n'imorte quel valeur à nos variables...

		System.out.println(user3.age);

		User.nUsers = -8;

		System.out.println("Nombre de users : " + User.nUsers);
	}

}
