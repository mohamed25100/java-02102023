package _03_Types.TypesReferences;

public class Strings {

	public static void main(String[] args) {

		/*
		 * Contrairement aux types primitifs, les types complexes (références) peuvent
		 * exposéer des méthodes.
		 * 
		 * Ils se distinguent visuellement des types primitifs en ce qu'ils commencent
		 * par une majuscule.
		 * 
		 * Les variables basées sur des types références sont des pointeurs référençant
		 * les adresses mémoire des objets qu'elles permettent de stocker.
		 * 
		 * Leur valeur par défaut vaut 'null'
		 */

		/*
		 * La classe String est implémentée de manière à produire des objets immuables.
		 * Une fois produite, le contenu de la chaine n'est plus modifiable.
		 * 
		 * Ce qui n'empéche pas de produire de nouvelles chaines à parir d'une chaine
		 * originale et de faire poiter ces dernièrees vers la variable d'origine.
		 * 
		 * exemple : str = str.concat("e");
		 */
		String firstName = "riri";
		String lastName = "DUCK";
		String fullName = firstName + " - " + lastName;

		System.out.println(fullName);

		String syllabe = "ri";

		String joined = syllabe + syllabe;

		System.out.println("firstName = " + firstName);
		System.out.println("joined = " + joined);

		/*
		 * Dans le cas des types 'références' l'opérateur "==" ne vérifie pas si les
		 * objets sont identiques. Il vérifie si les 2 variables poitent vers la même
		 * adresse.
		 * 
		 * Pour comparer 2 chaines de caractères il faut utiliser la méthode "equals"
		 */
		if (firstName == joined) {
			System.out.println("Les 2 chines pointent vers la même adresse.");
		} else {
			System.out.println("Les 2 chaines pointent vers des adresses différentes.");
		}

		if (firstName.equals(joined)) {
			System.out.println("Les 2 chaines sont identiques");
		}

		// Construction implicite via string litterals
		String s1 = "Bonjour";
		String s2 = "Bonjour"; // N'alloue pas d'autres mémoire car une chaine identique est déjà présent

		// Construction explicite via appel à un constructeur (mot new)

		String s3 = new String("Bonjour"); // Alloue la mémoiire car appel au constructeur

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false

		// Quelques méthodes utilitaires relatives aux chaines de caractères...

		String str = "test";

		System.out.println(str.charAt(2)); // s (caraactère d'indice 2)

		String str2 = str.concat("e");

		System.out.println(str2);

		String message = "Ceci est une chaine de caractères.";
		System.out.println(message);

		String upper = message.toUpperCase();
		System.out.println(upper);

		String lower = message.toLowerCase();
		System.out.println(lower);

		String subPart = message.substring(23, 32);
		System.out.println(subPart);

		String[] splitted = message.split(" "); // splitte la chaine par rapport à une sous chaines => retourne un
												// tableau de String

		for (String mot : splitted) {
			System.out.print(mot + ".");
		}
		System.out.println();

		String replacemement = message.replace("Ceci", "Ce truc");

		System.out.println(replacemement);

		/*
		 * Conversion de types primitifs en chaines de caractères
		 * 
		 * Il est possible de convertir des valeurs numériques (int, long, float...) en
		 * chaines de caractères. Et réciproquement.
		 * 
		 * Pour ce faire il convient de faire appel à des méthodes statiques propposées
		 * par la classe enveloppante associé au type primitif considéré.
		 * 
		 */

		String myStr = "123";

		int myInt = Integer.parseInt(myStr);
		// Integer myInteger = Integer.valueOf(myStr);

		System.out.println(myInt);

		myStr = "3.14159";

		double myDouble = Double.parseDouble(myStr);

		System.out.println(myDouble);

		// Affichage formaté :
		myStr = String.format("%05d [%05.2f]", myInt, myDouble);

		System.out.println(myStr);

		System.out.println("6" + 4 + 5); // 645 (concaténation)

		System.out.println(4 + 5 + "7"); // 97

		System.out.println(4 + "5" + 3); // 453

		int x = 5 + 'A'; // Le code ASCII du caractère 'A' vaut 65

		System.out.println(x); // 70

		char y = 5 + 'A';

		System.out.println(y); // F (car F est à la place 70 dans la table ASCII)

		System.out.println("6" + 4 * 5); // 620 (car la multiplication est prioritaire)

		// System.out.println("6" + 5 - 4); // ERREUR

		System.out.println("6" + (5 - 4)); // 61

		/*
		 * Contrairement à la classe String, la classe StringBuilder permet de créer des
		 * chaines de caractères modifiables. Il n'est donc pas (systématiquelment)
		 * nécessaire de réalouer de la mémoire à chqiue modification.
		 */
		
		StringBuilder builder = new StringBuilder("Ceci est une chaine de caractères créée avec un stringbuilber. ");
		
		System.out.println(builder);
		
		builder.append("Il est donc possible de la modifier.");
		
		System.out.println(builder);
	
	}

}
