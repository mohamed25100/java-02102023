package UserPackage;

// Création d'une callse d'exception personnalisée qui hérite de la classe 'Exception' (fournie par Java)
public class IllegalAgeException extends Exception{

	private static final long serialVersionUID = 1L;

	
	public IllegalAgeException() {
		super("Un age ne peut pas être négatif");
	}
	
	public IllegalAgeException(String message) {
		super(message);
	}
}
