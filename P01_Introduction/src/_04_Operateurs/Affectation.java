package _04_Operateurs;

public class Affectation {

	public static void main(String[] args) {
		
		int c = 10;
		
		System.out.println("Post incrémentation :" + c++); // 10 : On affiche et après on incrémente
		System.out.println("Pré incrémentation :" + ++c); // 12 : On incrémente et après on affiche

		int a = 0;
		System.out.println("a = " + a);
		
		a += 5;
		System.out.println("a = " + a);
		
		a *= 5;
		System.out.println("a = " + a);
		
		a /= 5;
		System.out.println("a = " + a);
		
		a -= 5;
		System.out.println("a = " + a);
		
	}

}
