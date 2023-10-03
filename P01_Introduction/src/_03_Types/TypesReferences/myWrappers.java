package _03_Types.TypesReferences;

import java.util.ArrayList;

public class myWrappers {

	public static void main(String[] args) {
		
		/*
         * A chaque type primitif est associé un type complexe (sous forme de classe enveloppante)
         *  proposant des attributs et méthodes statiques lui étant associés.
         * 
         * Type primitif => Wrapped Class
         * byte 		 => Byte
         * short 	     => Short
         * int 	         => Integer
         * long 	     => Long
         * float 	     => Float
         * double 	     => Double
         * char 	     => Character
         * boolean 	     => Boolean
         */
		
		// Parser une chaine de caractères en entier
		
		int myParsedInt = Integer.parseInt("20");
		System.out.println(myParsedInt);
		
		// Conversion d'une chaine en eniter de type Wrapper
		Integer myInteger = Integer.valueOf("210");
		System.out.println(myInteger);
		
		// Conversion d'une chaine en eniter de type Wrapper
		Double myDouble = Double.valueOf("210.5");
		System.out.println(myDouble);
		
		// Auto boxing : Conversion implicite de types primitifs en Wrapper
		
		int myInt = 56;
		
		Integer myWrappedInteger = myInt; // auto-boxing
		
		// Utilisation de l'auto-boxing dans les tableaux dynamiques (collection)
		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		tab.add(myInt); // Convertit implicitement "int" en "Integer"
		
		// Unboxing : Conversion d'un type Wrapper vers son type primitif associé
		myInt = tab.get(0); // Conversion implicite de "Integer" en "int"
		

	}

}
