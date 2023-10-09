package fr.dawan;

import java.util.Objects;

public class User implements Comparable<User>{

	private String nom;
	
	private String prenom;

	// getters and setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// Constructeur
	public User(String prenom, String nom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}

	//toString
	@Override    
	public String toString() {
		return "User [nom=" + nom + ", prenom=" + prenom + "]";
	}

	// equals and hashcode
	@Override
	public int hashCode() {
		return Objects.hash(nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}

	@Override
	public int compareTo(User other) {

		int compare = this.nom.compareTo(other.getNom());
		
		// si this et other on le même nom, on compare les prénoms
		if(compare == 0) {
			compare = this.prenom.compareTo(other.getPrenom());
		}
		
		return compare;
	}
}
