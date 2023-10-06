package Exercice;

public class Technicien extends Employe{

	private int unites;
	
	public int getUnites() {
		return unites;
	}

	public void setUnites(int unites) {
		this.unites = unites;
	}

	public Technicien(String nom, String prenom, int age, String date, int unites, boolean risk) {
		super(prenom, nom, age, date);
		this.unites = unites;
		super.risk = risk;
	}

	@Override
	public double calculerSalaire() {
		double salaire = 5 *this.unites;
		
		if (super.risk)
			salaire += 200;
		
		return  salaire;
	}

	@Override
	public String getNom() {
		return "Le technicien " + super.prenom + " " + super.nom;
	}
}
