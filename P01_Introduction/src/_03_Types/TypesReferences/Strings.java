package _03_Types.TypesReferences;

public class Strings {

		public static void main(String[] args) {
			/*
			 * Contrairement aux types primitifs les types complexes (références) peuvent exposer des méthode.
			 * 
			 * Ils se distinguent visuellement des types primitifs en ce qu'il commence par une majuscule.
			 * 
			 * Les variables basées sur des types référence, sont des pointeurs référençant les adresses mémoire des objets qu'elles permettent de stocker
			 * 
			 * Leur valeur par défaut vaut 'null'
			 */
			/*
			 * La classe String est implémentée de manière à produire des objets immuable. Une fois produite, le contenu de la chaine n'est plus modifiable
			 * 
			 * Ce qui n'empeche pas de produire de nouvelle chainesà partir d'une chaine originale et de faire poiter ces dernière vers la variable d'origine
			 * 
			 * exemple : str = str.concat("e");
			 */
			String firstName = "riri";
			String lastName = "DUCK";
			String fullName = firstName+" "+lastName;
			System.out.println(fullName);
			
			String syllabe = "ri";
			String joined = syllabe + syllabe;
			System.out.println("firstName = "+ firstName);
			System.out.println("joined = "+joined);
			
			/*
			 * Dans le cas des types 'réference' l'opérateur "==" ne vérifie pas si les objets sont identiques. 
			 * Il vérifie si les 2 variable pointent vers la même adresse
			 * 
			 * Pour comparer 2 chaine de caractère il faut utiliser la méthode "equals"
			 */
			if(firstName == joined) {
				System.out.println("Les 2 chaines pointent vers la même adresse.");
			}else {
				System.out.println("Les 2 chaines pointent vers des adresse diférente");
			}
			
			if(firstName.equals(joined)) {
				System.out.println("Les 2 chaines sont identique.");
			}else {
				System.out.println("Les 2 chaines sont différente");
			}
			// Construction implicite via string litterals
			String s1 = "Bonjour";
			String s2 = "Bonjour"; // N'alloue pas d'autre mémoire car un objet identique est déjà présent
			
			// Construction explicite via appel au constructeur (mot new)
			String s3 = new String("Bonjour");
			System.out.println("si == s2 : "+(s1 == s2));
			System.out.println("si == s2 : "+(s1 == s3));
			
			// Quelque méthode utilitaires relatives aux chaines de caractères...
			
			String str = "test";
			
			System.out.println(str.charAt(2));
			
			String str2 = str.concat("e");
			
			System.out.println(str2);
			
			String message = "Ceci est une chaine de caractère.";
			System.out.println(message);
			
			String upper = message.toUpperCase();
			System.out.println(upper);
			
			String lower = message.toLowerCase();
			System.out.println(lower);
			
			String subPart = message.substring(23,32);
			System.out.println(subPart);
			
			String[] splitted = message.split(" "); // split 1 chaine par rapport à une sous chaine => retourne un tableau de String
			
			for(String mot : splitted) {
				System.out.print(mot + " - ");
			}
			
			System.out.println();
			
			String replacement = message.replace("Ceci", "Ce truc");
			System.out.println(replacement);
			
			/*
			 * Conversion de types primitifs en chaines de caractères
			 * 
			 * Il est possible de convertir des valeurs numéruqye (int, long, float...) en chaine de caractères.
			 * 
			 * Pour ce faire il convient de faire appel à des méthodes statiques propposées par la classe enveloppante associé au type primitif considéré
			 */
			
			String myStr = "123";
			int myInt = Integer.parseInt(myStr);
			
			System.out.println(myInt);
			
			myStr = "3.14159";
			double myDouble = Double.parseDouble(myStr);
			
			System.out.println(myDouble);
			
			// Affichage formaté :
			myStr = String.format("%d [%05.2f]", myInt,myDouble);
			
			System.out.println(myStr);
			
			System.out.println("6"+4+5); // 645 concaténation
			System.out.println("6"+(4+5));
			System.out.println(4+5+"7");
			
			System.out.println(4+"5"+3);
			
			int x = 5 + 'A'; // le code ASCII du caractère 'A' vaut 65
			System.out.println(x);
			
			char y = 5+ 'A';
			System.out.println(y);
			
			System.out.println("6"+ 4*5);
			System.out.println("6"+ (4-5));
			
			/*
			 * Contrairement à la classe String, la classe StringBuilder permet de créer des chaines de caractères modifiables. Il n'est donc pas nessaissaire de 
			 * réalouer de la mémoire à chaque modification.
			 */
			
			StringBuilder builder = new StringBuilder("Ceci est une chaine de caractéres crée avec un stringbuilder.");
			System.out.println(builder);
			builder.append("\nIl est donc possible de la modifier");
			
			System.out.println(builder);
			
		}
		
	}