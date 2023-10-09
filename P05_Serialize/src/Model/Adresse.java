package Model;

import java.io.Serializable;

public class Adresse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rue;

	private String Ville;

	// mot clé 'transient' : pour que l'attibut ne soit pas sérialisé (ne fonctionne pas avec l'encoder XML...)
	private transient int code_postal;

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	// NE PAS OUBLIER LE CONSTRUCTEUR SANS PARAMETRE POUR LES ENCODERS
	public Adresse() {
		super();
	}

	public Adresse(String rue, String ville, int code_postal) {
		super();
		this.rue = rue;
		Ville = ville;
		this.code_postal = code_postal;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", Ville=" + Ville + ", code_postal=" + code_postal + "]";
	}
}
