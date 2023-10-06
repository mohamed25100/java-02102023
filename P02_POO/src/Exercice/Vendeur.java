package Exercice;

public class Vendeur extends Employe{
	
	private double chiffreAffaire;
	
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	
	public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculerSalaire() {
		
		return 0.2* this.chiffreAffaire + 400;
	}

	@Override
	public String getNom() {
		return "Le vendeur " + super.prenom + " " + super.nom;
	}
}
