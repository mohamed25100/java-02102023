package _04_Heritage;

public /*final*/ class User { // final interdit l'héritage

	// protected : accessible dans la classe et ses classess filles
	protected String nom;

	// private : accessible uniquement dans la classe
	private String prenom;

	private int age;

	// public : accessible partout
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

	public void setAge(int age) {

		if (age < 0) {
			// System.err.println("Un age ne peut pas être négatif");
			throw new IllegalArgumentException("Un age ne peut pas être négatif");
		} else if (age < 18) {
			// System.err.println("Interdits aux mineurs");
			throw new IllegalArgumentException("Interdits aux mineurs");
		}
		this.age = age;
	}

	public User(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}

	public User(String nom, String prenom, int age) {
		
		this(nom, prenom);
		// this.age = age;
		
		this.setAge(age);
	}

	@Override
	public /*final*/ String toString() { // fianl interdit l'override d'une méthode dans les classes filles
		return "Je m'appelle " + this.getPrenom() + " " + this.getNom() + " et j'ai " + this.getAge() + " ans.";
	}

	public void faitUnTruc() {
		System.out.println("Je suis un user qui fait un truc");
	}
}
