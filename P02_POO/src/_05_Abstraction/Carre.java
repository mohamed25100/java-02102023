package _05_Abstraction;

public class Carre extends Forme {

	private int cote;

	public int getCote() {
		return cote;
	}

	public void setCote(int cote) {

		if (cote < 0) {
			throw new IllegalArgumentException("Le côté d'un carré ne peut être négatif.");
		}
		this.cote = cote;
	}

	public Carre(int cote) {
		super();
		this.cote = cote;
	}

	// Une classe fille doit OBLIGATOIREMENT redéfinir les méthodes abstraites de sa
	// classe mère
	@Override
	public double surface() {

		return cote * cote;
	}

	// Une classe fille peut optionnelement redéfinir les méthodes non abstraites de
	// sa classe mère
	@Override
	public void methodeNonAbsstraite() { //
		System.out.println("Je redéfinis une méthode non abstraite d'une classe abstraite.");
	}

}
