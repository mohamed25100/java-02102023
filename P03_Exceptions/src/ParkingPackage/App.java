package ParkingPackage;

public class App {
	
	
	public static void main(String[] args) {

		try {

			Parking parc = new Parking(5);

			parc.remplir();
			parc.afficherPlacesDispo();
			parc.remplir();
			parc.afficherPlacesDispo();
			parc.remplir();
			parc.afficherPlacesDispo();
			parc.remplir();
			parc.afficherPlacesDispo();
			parc.remplir();
			parc.afficherPlacesDispo();
			parc.remplir();
			parc.afficherPlacesDispo();

		} catch (ParkingPleinException e) {

			System.err.println(e.getMessage());
		}
	}
}
