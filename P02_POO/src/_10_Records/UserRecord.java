package _10_Records;

public record UserRecord(String nom, String prenom, int age) {

	// Il sera possible d'accéder en lecture aux attributs nom, prenom et age via la syntaxe : 
	
	// - XX.nom() (avec une classe XX.getNom()
	// - XX.prenom() (avec une classe XX.getPrenom()
	// - XX.age() (avec une classe XX.getAge()
	
	// toString, equals, hashCode sont déjà implémentés 
	
	// Les Attributs d'un record sont en lecture seule
}
