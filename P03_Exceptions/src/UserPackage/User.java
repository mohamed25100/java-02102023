package UserPackage;

public class User {

	private String nom;
	private String prenom;
	private int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	
	// throws : permet de faire suivre l'exception aux méthodes appelantes
	public void setAge(int age) throws IllegalAgeException{
		
		if(age < 0) {
			// throw : permet de lever une exception
			// throw new IllegalArgumentException("Un age ne peut pas être négatif.");
			
			// Une bonne pratique consiste à créer des exceptions personnalisées
			throw new IllegalAgeException("Un age ne peut pas être négatif.");
		}
		this.age = age;
	}
	
	public User(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public User(String nom, String prenom, int age) throws IllegalAgeException {
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
	}
	
	@Override
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
}
