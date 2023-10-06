package Exercice;

public class Representant extends Employe{

private double chiffreAffaire;
	
	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	
	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculerSalaire() {
		
		return 0.2* this.chiffreAffaire + 800;
	}
	
	@Override
	public String getNom() {
		return "Le représentant " + super.prenom + " " + super.nom;
	}
}
