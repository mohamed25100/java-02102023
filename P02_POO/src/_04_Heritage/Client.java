package _04_Heritage;

public class Client extends User{
	
	private String phone;
	
	private boolean subscriber;
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		
		// Mettre une logique métier pour vérifier la validité du numéro
		this.phone = phone;
	}

	public boolean isSubscriber() {
		return subscriber;
	}

	public void setSubscriber(boolean subscriber) {
		this.subscriber = subscriber;
	}

	public Client(String nom, String prenom) {
		super(nom, prenom); // appel au constructeur de la classe mère à 2 paramètres
	}
	
	public Client(String nom, String prenom, int age) {
		super(nom, prenom, age); // appel au constructeur de la classe mère à 3 paramètres
	}

	public Client(String nom, String prenom, int age, String phone) {
		super(nom, prenom, age);
		this.setPhone(phone);
	}

	@Override
	public String toString() {
		return super.toString() + " Je suis client. Mon numéro est " + phone + ".";
	}
	
	@Override
	public void faitUnTruc() {
		// La classe client a accès à l'attibut 'nom' de la classe mère car il est marqué comme 'protected'
		String test = super.nom;
		
		System.out.println("Je suis un client qui fait un truc");
	}
}
