package ParkingPackage;

public class Parking {

	private int places;

	private int occupees;

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {

		if (places <= 0) {
			throw new IllegalArgumentException("Le nombre de place doit être positif");
		}
		this.places = places;
	}

	public int getOccupees() {
		return occupees;
	}

	public void setOccupees(int occupees) {
		this.occupees = occupees;
	}

	public Parking(int places) {
		super();
		this.setPlaces(places);
	}

	public void remplir() throws ParkingPleinException {
		if (occupees < places) { // Il est au moins une place dispo
			occupees++;
		} else {
			throw new ParkingPleinException();
		}
	}

	public int getPlacesDispos() {
		return this.places - this.occupees;
	}

	public void afficherPlacesDispo() {

		int placesDispos = getPlacesDispos();
		
		if(placesDispos > 1) {
			System.out.println("Il reste " + placesDispos + " places disponibles.");
		}
		else if (placesDispos == 1)
		{
			System.out.println("Il reste " + placesDispos + " places disponible.");
		}
		else {
			System.out.println("Il n'y a plus de place...");
		}
	}
}
