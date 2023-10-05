package _07_Interfaces;

public class Chat extends Animal implements IPeutMarcher{
	
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Chat() {
		super();
	}

	public Chat(String nom, int age) {
		super(nom, age);
	}

	public Chat(String nom, int age, String couleur) {
		super(nom, age);
		this.couleur = couleur;
	}

	@Override
	public void marcher() {
		System.out.println("Je suis un chat qui marche");
	}

	@Override
	public void courir() {
		System.out.println("Je suis un chat qui coure");
	}
}
