package _04_Heritage;

public class App {

	/*
	 * L'héritage permet à une classe d'hériter :
	 * 
	 * - des propriétés (attributs)
	 * 
	 * - et du comportement (méthodes) d'une autre classe.
	 * 
	 * En POO, une classe qui hérite d'une autre classe est appelée une sous-classe
	 * ou une classe dérivée, tandis que la classe d'origine est appelée une
	 * superclasse ou une classe de base ou classe mère.
	 * 
	 * Une classe Java ne peut hériter que d'une classe. 
	 */

	/*
	 * Niveaux de visibilité :
	 * 
	 * - public : accessible partout
	 * 
	 * - private : accessible uniquement dans la classe
	 * 
	 * - protected : accessible dans la classe et ses classess filles même si elles
	 * sont dans un autre package. Ainsi qu'à toute classe du même package.
	 * 
	 * - par défaut : en l'absence de modificateur d'accès : package-private
	 */

	public static void main(String[] args) {

		// User u = new User("Duck", "Riri", -12);

		User u = new User("Duck", "Donald", 40);

		System.out.println(u);

		u.faitUnTruc();

		Client client = new Client("Duck", "Picsou", 75, "+33 6 23658745");

		System.out.println(client);

		client.faitUnTruc();
	}
}
