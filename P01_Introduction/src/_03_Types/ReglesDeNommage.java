package _03_Types;

public class ReglesDeNommage {

	public static void main(String[] args) {


		/*
		 * Le nom d'une variable peut être composé:
		 * - de caractères alpha numériques
		 * - du caractère '$'
		 * du caractère '_'
		 * 
		 * Le nom d'une variable ne peut pas commencer par un chiffre
		 * 
		 * Les mot clés réservés de Java (public, ...) ne peuvent pas être utilisés en tant que nom de variable
		 */
		
		/*
		 * Par convention, Java utilisé le camelCase pour la variables :
		 * - Camel case : nomDeMaVariable
		 * - Pascal Case : NomDeMaVariable
		 * - Snake Case : nom_de_ma_variable
		 */
		
		int monEntier = 10;
		
		String _maChaineDeCaracteres = "ma chaine de caractères";
		
		char $monCaractere = 'a';
		
		// double 0monDouble; Interdit
		
		// double mon-double = 0.2; Interdit
	}

}
