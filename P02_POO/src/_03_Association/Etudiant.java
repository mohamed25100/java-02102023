package _03_Association;

public class Etudiant {
	
	// En vrai on encapsulerait nos attibuts dans des getters et setters...
	int id;
	
	String nom;
	
	Notes notes; // Les notes ne peuvent pas exister sans l'étudiant : relation composition

	public Etudiant(int id, String nom, Notes notes) {
		
		this.id = id;
		this.nom = nom;
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", notes=" + notes + "]";
	}
}
