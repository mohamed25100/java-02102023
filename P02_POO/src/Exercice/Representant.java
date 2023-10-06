package Exercice;

public class Representant extends Commercial{

	public Representant(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
		super.setFixe(800);
	}
}
