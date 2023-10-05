package _08_Equals;

import java.util.Objects;

public class CompteBancaire {

	private String client;

	private String numeroCompte;

	private double solde;

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// Consttructeur sans paramètre
	public CompteBancaire() {
		super();
	}

	// Constructeur à 3 paramètres
	public CompteBancaire(String client, String numeroCompte, double solde) {
		super();
		this.client = client;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteBancaire [client=" + client + ", numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(client, numeroCompte, solde);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj; // cast i.e. transtypage du type Objet ver le type 'CompteBancaire'
		return Objects.equals(client, other.client) && Objects.equals(numeroCompte, other.numeroCompte)
				&& Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}

}
