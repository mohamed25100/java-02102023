package _07_Interfaces;

public class Chien extends Animal implements IPeutMarcher{

	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Chien() {
		super();
	}

	public Chien(String nom, int age) {
		super(nom, age);
	}

	public Chien(String nom, int age, String couleur) {
		super(nom, age);
		this.couleur = couleur;
	}

	@Override
	public void marcher() {
		System.out.println("Je suis un chien qui marche");
		
	}

	@Override
	public void courir() {
		System.out.println("Je suis un chien qui coure");
		
	}

}
