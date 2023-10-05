package _08_Equals;

public class App {
	public static void main(String[] args) {

		CompteBancaire cb = new CompteBancaire("riri", "aaa", 1000.0);
		CompteBancaire cb2 = new CompteBancaire("fifi", "bbb", 1500.0);
		CompteBancaire cb3 = new CompteBancaire("loulou", "ccc", 2000.0);
		CompteBancaire cb4 = new CompteBancaire("loulou", "ccc", 2000.0);

		System.out.println(cb.equals(cb)); // true
		System.out.println(cb.equals(cb2)); // false
		System.out.println(cb3.equals(cb4)); // true
	}
}
