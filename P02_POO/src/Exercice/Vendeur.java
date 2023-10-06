package Exercice;

public class Vendeur extends Commercial{

	public Vendeur(String nom, String prenom, int age, String date, double chiffreAffaire) {
		super(nom, prenom, age, date, chiffreAffaire);
		super.setFixe(400);
	}
}
