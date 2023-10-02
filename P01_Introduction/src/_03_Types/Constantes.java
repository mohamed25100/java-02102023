package _03_Types;

public class Constantes {

	public static void main(String[] args) {


		/*
		 * Une constante est identifiée par le mot clé 'final'
		 * Par convention, les cosntantes sonté déclarée en majuscules
		 */
		
		final String MA_CONSTANTE = "cette chaine de caractère est une constante";
		
		System.out.println(MA_CONSTANTE);
		
		final int VIES_MAX = 15;
		
		System.out.println(VIES_MAX);
		
//		VIES_MAX = 10; // Erreur
	}

}
