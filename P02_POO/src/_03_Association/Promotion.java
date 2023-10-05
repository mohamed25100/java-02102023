package _03_Association;

import java.util.List;

public class Promotion {

	List<Etudiant> etudiants; // Un étudiant existe dsans sa promotion : Aggrégation simple

	public Promotion(List<Etudiant> etudiants) {
		
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		
		String promo ="";
		
		for(Etudiant etudiant : etudiants) {
			promo += " - " + etudiant + "\n";
		}
		return promo;
	}
}
