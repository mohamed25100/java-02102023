package _03_Association;

public class Notes {

	// En vrai mettre des getters et setters...
	int maths, anglais;

	public Notes(int maths, int anglais) {
		
		this.maths = maths;
		this.anglais = anglais;
	}

	@Override
	public String toString() {
		return "Notes [maths=" + maths + ", anglais=" + anglais + "]";
	}
}
