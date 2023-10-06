package Exercice;

public abstract class Employe {

	
	protected String nom;
	
	protected String prenom;
	
	private int age;
	
	private String date;
	
	protected boolean risk;
	
	public boolean isRisk() {
		return risk;
	}

	public void setRisk(boolean risk) {
		this.risk = risk;
	}

	public String getNom() {
		return "L'employé " + this.prenom + " " + this.nom;
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
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Employe(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}
	
	public abstract double calculerSalaire();
}
