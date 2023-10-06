package Exercice;

public class Commercial extends Employe {
	private double chiffreAffaire;
	
	private double fixe;

	public double getFixe() {
		return fixe;
	}

	public void setFixe(double fixe) {
		this.fixe = fixe;
	}

	public double getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public Commercial(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	@Override
	public double calculerSalaire() {

		return 0.2 * this.chiffreAffaire + this.fixe;
	}
}
