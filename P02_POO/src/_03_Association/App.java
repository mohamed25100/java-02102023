package _03_Association;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	/*
	 * On peut rencotrer 2 types d'associations : 
	 * 
	 * - Aggrégation
	 * - Composition (cas particulier d'aggrégation : agrrégation forte)
	 * 
	 * Les notes ne peuvent pas exister sans l'étudiant => composition
	 * La salle de bains ne peut pas exister sans l'appartement => composition
	 * 
	 * 
	 * Le mouton appartient à un troupeau. Le mouton peut exister sans le troupeau => aggrégation
	 */

	public static void main(String[] args) {

		Notes notes = new Notes(12,15);
		
		Etudiant e1  = new Etudiant(1, "Riri", notes);
		
		System.out.println(e1);
		
		Etudiant e2  = new Etudiant(1, "Fifi", new Notes(14,15));

		System.out.println(e2);
		
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		
		etudiants.add(e1);
		etudiants.add(e2);
		
		Promotion promo = new Promotion(etudiants);
		
		System.out.println(promo);
	}
}
