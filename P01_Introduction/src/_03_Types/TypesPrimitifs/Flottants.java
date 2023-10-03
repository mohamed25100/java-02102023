package _03_Types.TypesPrimitifs;

public class Flottants {

	public static void main(String[] args) {

		/*
		 * Types nuériques flottants :
		 * 
		 * - float : stocké sur 32 bits
		 * - double : stocké sur 64 bits
		 * 
		 * 
		 */
		
		System.out.printf("- %s (%d bits) from %e to %e\n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %e to %e\n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		
		float myFloat = 3.4f;
		double myDouble = 3.4;
		
		System.out.println("myFloat = " + myFloat);
		System.out.println("myDouble = " + myDouble);
		
		// Notation exponentielle
		double myDoubleExp = 3.4e10;
		float myFloatExp = 3.4e10f;
		
		System.out.println("myDoubleExp = " + myDoubleExp);
		System.out.println("myFloatExp = " + myFloatExp);
		
		// Valeurs particulières
		
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.NaN); // Not A Number
		
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.NaN); // Not A Number
		
		// Quelques méthodes utilitaires :
		
		System.out.println(Float.isFinite(Float.NaN)); // false
		System.out.println(Float.isFinite(3.4f)); // true
		
		System.out.println(Float.isNaN(Float.NaN)); // true
		System.out.println(Float.isNaN(3.4f)); // false
		
		System.out.println(1.0 / 0.0); // Infinity
		System.out.println(0.0 / 0.0 ); // NaN
		
		
		
		
	}

}
