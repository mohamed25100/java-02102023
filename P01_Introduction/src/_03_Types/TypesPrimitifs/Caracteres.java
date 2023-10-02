package _03_Types.TypesPrimitifs;

public class Caracteres {

	public static void main(String[] args) {


		/*
		 * Le type 'char' est stocké en mémoire sius forme d'une valeur numérique
		 */
		
		char c = 'a';
		
		System.out.println(c);
		
		// Utilisation du code numérique du caractère :
		
		c = 97; // 97 le code 97 correspond à la position du caractère 'a' dans la table ASCII
		
		System.out.println(c);
		
		
		// Caractères spéciaux 
		
		char c1 = '\n'; // retour à la ligne
		char c2 = '\t'; // tabulation
		char c3 = '\\'; // antislash
		char c4 = '\''; // apostrophe
		
		// Quelques méthodes utilitaires associées au type 'char'
		boolean isDigit = Character.isDigit('a');
		System.out.println(isDigit);
		
		boolean isLetter = Character.isLetter('a');
		System.out.println(isLetter);
		
		boolean isUpperCase = Character.isUpperCase('a');
		System.out.println(isUpperCase);

	}

}
