package App;

import java.util.ArrayList;

import Helpers.Binary;
import Helpers.XML;
import Model.Adresse;
import Model.Produit;

public class App {

	public static void main(String[] args) {

		try {

			System.out.println("---------------- XML ----------------");

			Produit p = new Produit(1, "Ordi", 1000.0);

			XML.encodeToFile(p, "Exports/produit.xml");

			Produit pLu = (Produit) XML.decodeFromFile("Exports/produit.xml");

			System.out.println(pLu);

			Adresse adresse = new Adresse("Victor Hugo", "Toulouse", 31000);

			XML.encodeToFile(adresse, "Exports/adresses.xml");

			Adresse adresseLue = (Adresse) XML.decodeFromFile("Exports/adresses.xml");

			System.out.println(adresseLue);

			System.out.println("---------------- BINAIRE ----------------");

			Binary.encodeToFile(p, "Exports/produit.bin");

			pLu = (Produit) Binary.decodeFromFile("Exports/produit.bin");

			System.out.println(pLu);

			Binary.encodeToFile(adresse, "Exports/adresses.bin");

			adresseLue = (Adresse) Binary.decodeFromFile("Exports/adresses.bin");

			System.out.println(adresseLue);

			System.out.println("\n------------- ADRESSES --------------\n");

			Adresse adresse2 = new Adresse("Victor Louis", "Paris", 75000);

			ArrayList<Adresse> adresses = new ArrayList<>();

			adresses.add(adresse);
			adresses.add(adresse2);

			Binary.encodeToFile(adresses, "Exports/adresses.bin");

			Object obj = Binary.decodeFromFile("Exports/adresses.bin");

			// si l'objet retourné par decodeFromFil est de type 'ArrayList'
			// cast le type objet en type 'ArrayList' et ob boucle dessus avec un .forEach
			// pour afficher toutes les adresses lues
			if (obj instanceof ArrayList<?>) {
				((ArrayList<?>) obj).forEach(a -> System.out.println(a));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
