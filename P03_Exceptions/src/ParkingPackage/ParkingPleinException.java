package ParkingPackage;

public class ParkingPleinException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ParkingPleinException() {
		super("Désolé, il n'y a plus de places sur le parking...");
	}

	public ParkingPleinException(String message) {
		super(message);
	}
}
