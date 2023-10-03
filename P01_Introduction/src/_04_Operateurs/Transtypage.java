package _04_Operateurs;

public class Transtypage {
	public static void main(String[] args) {

		// cat implicites : on convertit un type plus petit (en taille mémoire) ves un
		// type plus grand. ou un entier vers un nombre à virgule flottante
		// ps de risque de perte de précision

		byte myByte = 111;
		short myShort = /* (short) */ myByte; // transtypage implicite
		int myInt = myShort;
		long myLong = myInt;
		float myFloat = myLong;
		double myDouble = myFloat;

		// cast explicites : on convertit un type plus grand (en taille mémoire) vers un
		// type plus petit ou un nombre à virgule vers un entier

		myDouble = 12345678901.123456789;

		myFloat = (float) myDouble;
		myLong = (long) myFloat;
		myInt = (int) myLong;
		myShort = (short) myInt;
		myByte = (byte) myShort;

		System.out.println(myDouble + " (myDouble)");
		System.out.println(myFloat + " (myFloat)");
		System.out.println(myLong + " (myLong)");
		System.out.println(myInt + " (myInt)");
		System.out.println(myShort + " (myShort)");
		System.out.println(myByte + " (myByte)");

		int i = 130;

		byte b = (byte) i; // - 126 !! car byte est compris entre -128 et 127.
		// Donc 130 est trop grand. Et ç atourne : 
		// int => byte
		// 127 => 127
		// 128 => -128
		// 129 => -127
		// 130 => -126
		
		System.out.println(b);

	}
}
