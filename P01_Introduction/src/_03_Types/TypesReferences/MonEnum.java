package _03_Types.TypesReferences;

/*
 * Un type énuméré est un typede données comportant un ensemble fini d'états (ou
 * de valeurs) auxquels sont associés un nom.
 * 
 * Un type énuméré se décrare dans un fichier séparé portant le même nom que l'enum.
 * 
 * Un type énuméré s'introduit avec le mot clé 'enum'
 * 
 * Par convention : 
 * - le nom d'un type énuméré respecte le PascalCase
 * - les noms des états sont en majuscules (car constantes)
 */

public enum MonEnum {
	VERT, ORANGE, ROUGE, ROUGE_FONCE
}
