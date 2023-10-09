package fr.dawan.exercices.contacts;

public class Contact {
	private String nom;
    private String numeroTelephone;
    private String email;

    public Contact(String nom, String numeroTelephone, String email) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return " - Nom : " + nom + ", Téléphone : " + numeroTelephone + ", Email : " + email;
    }
}
