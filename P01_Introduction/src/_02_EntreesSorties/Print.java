package _02_EntreesSorties;

public class Print {

	public static void main(String[] args) {


		System.out.println("La méthode 'println' permet d'écrire un ligne");
		
		
		System.out.print("La méthode 'print' permet ");
		System.out.print("d'écire une chaine de caractères ");
		System.out.print("sans retour à la ligne");
		
		System.out.println();
		
		// Déclaration d'une variable de type chaine de caractères nommée 'str'
		String str = "printf";
		
		System.out.printf("La méthode '%s' permet d'écrire des chaines de caractères formatées.\n", str);
		
		/*
	     *  %s        Permet de formater une chaine de caractères
	     *  %c        Permet de formater un caractère
	     *  %d        Permet de formater un entier en base décimale.
	     *  %x        Permet de formater un entier sous forme hexadécimale
	     *  %e        Permet de formater un réel sous forme décimale en notation scientifique
	     *  %f        Permet de formater un réel sous forme décimale
	     *  %t        Utilisé pour formater les dates
	     *  %n ou \n  (retour à la ligne)
	     */
		
		int monEntier = 25;
		
		System.out.printf("Mon entier vaut %d\n", monEntier);
		
		System.out.printf("PI vaut %f\n", Math.PI);
		
		// Formatage de PI avec 3 chiffres après la virgule
		System.out.printf("PI vaut %.3f\n", Math.PI);
	}

}
