package _03_Types.TypesReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myCollections {

	public static void main(String[] args) {


		// ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println("------------ Boucle for classique --------------");
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}

		System.out.println("------------ Boucle (type) foreach --------------");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// récupérer une sous liste
		List<String> sub = list.subList(2, 5); // sous liste de l'indice 2 (inclus) à 5 (exclus)
		System.out.println(sub + " subList(2, 5)");
		
		System.out.println(" ------- La classe outil Collections --------------");
		
		Collections.shuffle(list);
		
		System.out.println(list + "(shuffle)");
		
		Collections.sort(list);
		System.out.println(list + "(sort)");
		
		Collections.rotate(list,  - 1); // décallage à gauche de 1
		
		System.out.println(list + "(rotate - 1)");
		
		Collections.rotate(list,  + 1); // décallage à droite de 1
		
		System.out.println(list + "(rotate + 1)");
		
		Collections.reverse(list);
		System.out.println(list + "(reverse)");
		
		System.out.println("\n--------------- Tableaux associatifs (Maps)--------------------\n");
		
		/*
		 * Un tableau associatif (parfois appelé dictionnaire) ou encore 'map' permet de lister des couples clé/valeur.
		 * Un tableau associatif ne peut pas contenir de doublon de clés.
		 */
		
		// TreeMap maintient un ordre naturel des clés
		// Map<Integer, String> map = new TreeMap<Integer, String>();
		
		/*
		 * HashMap utilise un code de hashage.
		 * HashMap autorise 'null' en tant que clé.
		 * 
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		/*
		 * LinkedHashMap utilise également un code de hashage mais garantit également que l'ordre de parcours des clés sera le même que celui d'insertion.
		 */
		// Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		
		map.put(1, "Un");
		map.put(2, "deux");
		map.put(4, "quatre");
		map.put(3, "trois");
		map.put(4, "quatre");
		map.put(5, "cing");
		
		for(Integer i : map.keySet())
		{
			System.out.print(i  + " ");
		}
		
		System.out.println();
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			Integer key = entry.getKey();
			
			String val = entry.getValue();
			
			System.out.println("clé : " + key + " / valeur : " + val);
		}
		
		System.out.println(map + " (avant suppression");
		
		map.remove(2); // ATTENTION : ne pas confondre la clé avec l'indice d'un tableau
		
		System.out.println(map + " (après suppression de la clé '2'");
	}
}
