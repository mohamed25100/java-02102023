package _10_Records;

public class App {
	public static void main(String[] args) {

		UserRecord user = new UserRecord("duck", "riri", 12);
		
		System.out.println(user);
		
		System.out.println(user.prenom());
		
		UserRecord user2 = new UserRecord("duck", "riri", 12);
		
		System.out.println(user.equals(user2));
		
		// user.nom() = "fifi"; // Les propriétés d'un record sont en lecture seule
	}
}
