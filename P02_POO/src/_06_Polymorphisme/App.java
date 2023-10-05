package _06_Polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class App {

	/*
	 * Le polymorphisme est une conséquence de l'héritage.
	 * 
	 */
	public static void main(String[] args) {

		// Un animal peut prendre plusieurs formes...
		Animal animal = new Animal(); // celle d'un simple animal... (on peut instancier Animal car la classe n'est
										// pas 'abstract'

		animal.communiquer();

		Animal chien = new Chien(); // celle d'un chien

		chien.communiquer(); // 2 objets de types "Animal" pourront se comporter différemment...

		Animal chat = new Chat(); // celle d'un chat...

		chat.communiquer(); // L'un miaule, l'autre aboie...

		System.out.println("\n-------- Collection polymorphique --------\n");

		// Une List est fortement typée : on ne peut y mettre que des objets d'un même
		// type
		List<Animal> animaux = new ArrayList<Animal>();

		animaux.add(new Chien()); // Mais on peut ajouter des chiens
		animaux.add(new Chat()); // et des chats...
		animaux.add(new Chien()); // dans une liste (un tableau...) fortement typé de type 'Animal'
		animaux.add(new Animal());

		for (Animal ani : animaux) {
			ani.communiquer();
		}
	}
}
