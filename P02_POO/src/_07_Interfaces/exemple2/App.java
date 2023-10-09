package _07_Interfaces.exemple2;

public class App {

	public static void main(String[] args) {

		/*
		 * Toute classe implémentant l'interface ProductRepository doit IMPERATIVEMENT
		 * implémenter ses méthodes.
		 * 
		 * En conséquence de quoi, un objet du type 'ProductRepository' fournit
		 * obligatoirement lesdites méthodes. Peut importe la manière dont elles sont
		 * implémentées. L'utilisateur de l'interface sait qu'il pourra compter sur ses
		 * méthodes.
		 * 
		 * Le fait de changer de classe implémentant l'interface. Par exemple choisir
		 * 'ProductRepositoryImpl_csv' au lieu de 'ProductRepositoryImpl_bdd' n'aura
		 * aucun impact sur la manière dont la méthodes 'create' (par exemple) sera
		 * appelée dans le programme principal.
		 */
		
		// ProductRepository _repo = new ProductRepositoryImpl_bdd();
		ProductRepository _repo = new ProductRepositoryImpl_csv();
		Product p = new Product();

		// Comme la variable '_repo' est de type 'ProductRepository', o, est certain de
		// disposer d'une méthode 'create'

		_repo.create(p);
		
		// et de n'importe quelle méthode définit dans l'interface 'ProductRepository'
		_repo.delete(1);
			
	}
}
