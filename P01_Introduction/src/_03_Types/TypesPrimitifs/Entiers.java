package _03_Types.TypesPrimitifs;

public class Entiers {

	public static void main(String[] args) {


		/*
		 * Il existe 4 types d'entiers en Java
		 * 
		 * Ces 4 types se différencient par la taille (en nombre d'octets) des variables qu'ils permettent d'alouer.
		 */
		
		byte b = 120;
		
		short s = 32767;
		
		int i = 200000;
		
		long l = 1_000_000_000L;
		
		System.out.println("valeur de l = " + l);
		
		/*
		 * A chaque type primit f est associé un type complexe ( sous forme de classe enveloppante)
		 * 
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - ..
		 * 
		 */
		
		System.out.printf("- %s (%d bits) from %d to %d\n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		
		long toLong = 9223372036854775807L + 1;
		
		System.out.println("toLong = " + toLong); // ATTENTION : CA TOURNE...
		
		
		short myBinaryShort = 0b11; // Notaztiopn binaire
		short myHexaShort = 0x61; // Notation hexadeciale
		
		System.out.println("myBinaryShort = " + myBinaryShort);
		System.out.println("myHexaShort = " + myHexaShort);
		
		
		

	}

}

