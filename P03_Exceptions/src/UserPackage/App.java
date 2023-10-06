package UserPackage;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class App {
	
	// private static Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {

		try {
			User user = new User("Duck", "Riri", 12);

			System.out.println(user);

			user.setAge(13);

			System.out.println(user);

			// throw new NullPointerException();

			user.setAge(-1);

		} catch (IllegalAgeException e) {

			// dans la vraie vie, on peut vouloir effectuer un traitement différencié des
			// Exceptions selon leur type
			System.err.println(e.getMessage());
		}
		catch (IllegalArgumentException e) {

			// dans la vraie vie, on peut vouloir effectuer un traitement différencié des
			// Exceptions selon leur type
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally { // finally : bloc optionnel
			System.out.println("Le bloc finally est exécuté en toute circonstance.");
			System.out.println("Avec ou sans exception.");
			System.out.println("Il est souvent utilisé pour libérer des ressources");
			System.out.println(" => fermer fichier, fermer connexion bdd...");
		}

		System.out.println("La fin du programme");
		
	}
}
