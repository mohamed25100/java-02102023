package _05_Abstraction;

public abstract class Forme {

	/*
	 * Une classe abstraite :
	 * 
	 * - vise principalement à servir de modèle pour les classes qui en hériteront.
	 * 
	 * - factorise les attributs et méthodes qui leur seront commun(e)s.
	 * 
	 * - est définie via le mot clé 'abstract'
	 * 
	 * - ne peut pas être instanciée
	 * 
	 * - doit contenir au moins une méthode abstraite
	 * 
	 * - peut contenir des méthodes non abstraites.
	 * 
	 * - peut contenir des constructeurs qui serviront aux classess filles
	 * 
	 */
	
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public Forme() {
		System.out.println("Appel au constructeur sans paramètre de la classe abstraite 'Forme'");
	}
	
	// Les classes filles devont OBLIGATOIREMENT implémenter les méthodes abstraites de leur classe mère.
	public abstract double surface();
	
	// Les classes filles pourront optionnellement implémenter les méthodes non abstraites de leur classe mère.
	public void methodeNonAbsstraite() {
		System.out.println("Je suis une méthode non abstraite dans une classe abstraite.");
	}
}
