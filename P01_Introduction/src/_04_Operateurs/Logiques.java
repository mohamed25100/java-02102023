package _04_Operateurs;

public class Logiques {

	public static void main(String[] args) {

		/*
		 * - ET : A && B => true si A ET B sont true, false sinon
		 * - OU : A || B => true si A OU B sont true, false sinon
		 * - NON : !1 => true si A est false, false sinon
		 */
		
		boolean a = false;
		boolean b = true;
		
		if (a && b) {
			System.out.println("a et b sont vrais");
		}
		
		// moins performant que ci dessus : comme b est vrai on vérifie aussi a. 
		if (b && a) {
			System.out.println("b et a sont vrais");
		}
		
		if (a || b) {
			System.out.println("a ou b sont vrais");
		}
		
		if (!a) {
			System.out.println("a n'est pas vrai");
		}
	}
}
