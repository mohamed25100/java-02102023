package _07_Interfaces;

public class App {

	/*
	 * Une interface est un contrat qur toute classe qui implémente cette interface devra respecter.
	 * 
	 * une interfac e ne peut avoir de constructeurs ou d'attributs...
	 * 
	 * Une interfac ene peut présenter que :
	 * 
	 * - des signatures de méthodes
	 * 
	 * - (plus rarement) des champs 'static' ou définis avec le mot clé 'final'
	 */
	
	public static void main(String[] args) {
		
		IPeutMarcher chien = new Chien();
		IPeutMarcher chat = new Chat();
		
		/*
		 * N'importe quel objet de type IPeutMarcher disposera NECESSAIREMENT des méthodes courir et marcher.
		 */
		chien.courir();
		chat.marcher(); 
		
		Corbeau corbeau = new Corbeau();
		
		corbeau.atterir();
		corbeau.marcher(); 
	}
}
