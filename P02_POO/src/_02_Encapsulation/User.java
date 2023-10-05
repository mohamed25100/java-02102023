package _02_Encapsulation;

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

	/*
	 * 2 types de méthodes : 
	 * - getter : donne accès à l'attribut en lecture
	 * - setter : donne accès à l'attribut en écriture
	 */
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {

		if (age < 0) {

			System.err.println("Un age ne peut pas être négatif");

			// En vrai on lèverait une exception...
			// throw new IllegalArgumentException("Un age ne peut pas être négatif");
		} else {
			this.age = age;
		}
	}

	public User(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public User(String nom, String prenom, int age) {
		this(nom, prenom);
		this.age = age;
	}

	@Override // redéfinition de l améthode toString() définie dans la classe 'Object'
	public String toString() {
		return prenom + " " + nom + " a " + age + " ans.";
	}
}
