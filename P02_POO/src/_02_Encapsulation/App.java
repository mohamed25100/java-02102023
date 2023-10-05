package _02_Encapsulation;

public class App {

	/*
	 * L'encapsulation conciste à regrouper dans une seule entité les données et les
	 * traitements qui la caractérisent.
	 * 
	 * L'intérieur de l'objet ne doit pas être directement accessible depuis le
	 * monde extérieur.
	 * 
	 * Les attributs font partie de l'interieur de l'objet, ils dovent onc être
	 * protégés en lecture et en écriture.
	 */
	public static void main(String[] args) {

		User user = new User("Duck", "Loulou", 12);

		// user.age = -5; The field User.age is not visible

		user.setAge(-5);
		
		System.out.println(user/* .toString() */); // appel implicite de toString()
		
		System.out.println("age : " + user.getAge());

	}
}
