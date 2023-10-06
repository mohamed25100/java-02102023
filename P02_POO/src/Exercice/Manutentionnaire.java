package Exercice;

public class Manutentionnaire extends Employe{

	private int heures;
	
	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public Manutentionnaire(String nom, String prenom, int age, String date, int heures, boolean risk) {
		super(prenom, nom, age, date);
		this.heures = heures;
		super.risk = risk;
	}

	@Override
	public double calculerSalaire() {
		
		double salaire = 65 * this.heures;
		
		if (super.risk)
			salaire += 200;
		return salaire;
	}

	@Override
	public String getNom() {
		return "Le manutentionnaire " + super.prenom + " " + super.nom;
	}
}
