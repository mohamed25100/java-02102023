package Exercice;

import java.util.ArrayList;

public class Personnel implements IPersonnel {

	private ArrayList<Employe> employes;

	public Personnel() {
		employes = new ArrayList<Employe>();
	}

	@Override
	public void ajouterEmploye(Employe e) {
		employes.add(e);
	}

	@Override
	public void calculerSalaires() {

		for (Employe emp : employes) {
			System.out.println(emp.getNom() + " gagne " + emp.calculerSalaire() + "€.");
		}
	}

	@Override
	public double salaireMoyen() {

		double total = 0;

		for (Employe emp : employes) {
			total += emp.calculerSalaire();
		}

		return total / employes.size();
	}
}
