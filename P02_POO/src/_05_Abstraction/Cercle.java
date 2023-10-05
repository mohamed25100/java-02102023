package _05_Abstraction;

public class Cercle extends Forme {

	private int rayon;
	
	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	public Cercle(int rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double surface() {
		
		return Math.round(Math.PI * rayon * rayon * 100) / 100;
	}
}
