package fr.dawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {

	/*
	 * Ressource sur les collections Java :
	 * https://www.jmdoudoux.fr/java/dej/chap-collections.htm
	 * 
	 */

	public static void printCollection(Collection<?> collection) {

		System.out.println("-------------------------------");
		collection.forEach(item -> {
			System.out.println(item);
		});
	}

	public static void main(String[] args) {

		System.out.println("*************** List *****************\n");

		List<String> myLsStr = new ArrayList<String>();

		myLsStr.add("Riri");
		myLsStr.add("Loulou");
		myLsStr.add("Donald");
		myLsStr.add("Donald");

		printCollection(myLsStr);

		myLsStr.add(1, "Fifi"); // Insert à l'indice 1

		printCollection(myLsStr);

		myLsStr.set(1, "Minie"); // Remplace à l'indice 1

		printCollection(myLsStr);

		myLsStr.remove("Riri"); // Supprime le premier élément qui correspond

		printCollection(myLsStr);

		myLsStr.remove(1); // Supprime l'élément d'indice 1

		printCollection(myLsStr);

		myLsStr.removeAll(Arrays.asList("Donald"));

		printCollection(myLsStr);

		if (myLsStr.get(0) instanceof String) {
			System.out.println(myLsStr.get(0) + " est de type String");
		}

		// On ne peut pas supprimer des éléments d'une colletion en les parcourant avec
		// une boucle 'for'
//		for(String item : myLsStr) {
//			if(item.equals("Minie")) {
//				System.out.println("remove " + item);
//				myLsStr.remove(item); // Exception : item en lecture seule
//			}
//		}

		System.out.println("\nParcours d'une collection avec un itérateur\n");

		Iterator<String> iter = myLsStr.iterator();

		while (iter.hasNext()) {
			String item = iter.next();

			if (item.equals("Minie")) {
				System.out.println("remove " + item);
				iter.remove();
			}
		}

		System.out.println("*************** Set (pas de doublons et non trié) *****************\n");

		Set<Double> st1 = new HashSet<>();

		st1.add(12.4);
		st1.add(4.3);

		// La méthode 'add' retourne 'true' si l'ajout est un succès, 'false' sinon

		System.out.println(st1.add(4.5)); // true
		System.out.println(st1.add(12.4)); // false => 12.4 est déjà dans la collection

		printCollection(st1);

		System.out.println("*************** SortedSet (pas de doublons, triée) *****************\n");

		SortedSet<User> stUser = new TreeSet<>();

		stUser.add(new User("John", "Doe"));
		stUser.add(new User("Alan", "Smithee"));
		stUser.add(new User("Jo", "Dalton"));
		stUser.add(new User("Jane", "Doe"));

		printCollection(stUser);

		System.out.println("*************** Queue *****************\n");

		Queue<Double> queue = new LinkedList<>();

		queue.offer(3.4);
		queue.offer(5.2);
		queue.offer(3.6);

		printCollection(queue);

		System.out.println("queue.peek() = " + queue.peek()); // retourne le premier élément de la queue sans le
																// supprimer
		printCollection(queue);
		System.out.println("queue.poll() = " + queue.poll()); // retourne le premier élément de la queue en le
																// supprimant
		printCollection(queue);

		System.out.println("queue.element() = " + queue.element()); // idem peek, mais lève une exception si la queu est
																	// vide
		printCollection(queue);

		System.out.println("*************** Map *****************\n");

		// Map => association clé/valeur

		Map<String, User> map = new HashMap<>();

		User u3 = new User("Joe", "Dalton");

		map.put("u1", new User("John", "Doe"));
		map.put("u2", new User("Jane", "Doe"));
		map.put("u3", u3);
		map.put("u4", new User("James", "Dean"));

		System.out.println("map.get(\"u2\") = " + map.get("u2"));
		System.out.println("map.get(\"u2\") = " + map.get("cle_inexistante")); // null

		System.out.println(map.containsValue(u3)); // true

		map.put("u3", new User("Avrel", "Dalton")); // si la clé existe déjà, la valeur associée sera écrasée

		printCollection(map.keySet()); // .keySet() retourne la liste des clés
		printCollection(map.values()); // .valeus() retourne la liste des valeurs

		Set<Entry<String, User>> ets = map.entrySet(); // .entrySet() retourne la liste des couples clé/valeur

		printCollection(ets);

		System.out.println("\n*************************************");
		System.out.println("*********** STREAM API **************");
		System.out.println("*************************************\n");

		/*
		 * L'API stream permet d'ajouter des fonctionalités aux collections. Un 'stream
		 * object' est une séquence d'objets supportant des méthodes utilitaires dont on
		 * peut chainer les appels.
		 */

		List<String> names = Arrays.asList("Reflection", "Collection", "Super", "Stream");
		
		List<String> filtered = names
				.stream() // transforme la collection en flux
				.filter(s -> s.startsWith("S")) // filtre le flux
				.collect(Collectors.toList()); // retransforme le flux en type collection

		System.out.println("names = " + names);
		System.out.println("filtered = " + filtered);

		List<String> filteredAndSorted = names
				.stream()
				.filter(s -> s.contains("S"))
				.sorted()
				.collect(Collectors.toList());

		System.out.println("filteredAndSorted = " + filteredAndSorted);
	}
}
