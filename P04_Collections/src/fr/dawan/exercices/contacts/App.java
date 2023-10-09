package fr.dawan.exercices.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	/*
	 * Gestionnaire de contacts
	 * 
	 * Créez une application de gestion de contacts en utilisant une ArrayList pour
	 * stocker les contacts.
	 * 
	 * Chaque contact doit avoir un nom, un numéro de téléphone et une adresse
	 * e-mail.
	 * 
	 * Vous devrez implémenter les fonctionnalités suivantes :
	 * 
	 * - Ajouter un nouveau contact.
	 * 
	 * - Afficher la liste de tous les contacts.
	 * 
	 * - Rechercher un contact par nom.
	 * 
	 * - Mettre à jour les informations d'un contact.
	 * 
	 * - Supprimer un contact.
	 * 
	 */
	public static void afficherMenu() {
		System.out.println("Menu :");
		System.out.println("1. Ajouter un contact");
		System.out.println("2. Afficher la liste de contacts");
		System.out.println("3. Rechercher un contact par nom");
		System.out.println("4. Mettre à jour un contact");
		System.out.println("5. Supprimer un contact");
		System.out.println("6. Quitter");
		System.out.print("Choix : ");
	}

	public static void ajouterContact(Scanner scanner, ArrayList<Contact> contacts) {
		System.out.print("Nom : ");
		String nom = scanner.nextLine();
		System.out.print("Téléphone : ");
		String telephone = scanner.nextLine();
		System.out.print("Email : ");
		String email = scanner.nextLine();

		Contact nouveauContact = new Contact(nom, telephone, email);
		contacts.add(nouveauContact);
	}

	public static void main(String[] args) {
		ArrayList<Contact> contacts = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			afficherMenu();

			int choix = scanner.nextInt();
			scanner.nextLine(); // Consommer la nouvelle ligne

			switch (choix) {
			case 1:
				ajouterContact(scanner, contacts);
				break;
			case 2:

				if (contacts.size() == 0) {
					System.out.println("La liste est vide");
					break;
				}

				System.out.println("Liste des contacts :");
				for (Contact contact : contacts) {
					System.out.println(contact);
				}
				break;
			case 3:
				System.out.print("Entrez le nom du contact à rechercher : ");
				String nomRecherche = scanner.nextLine();
				boolean trouve = false;
				for (Contact contact : contacts) {
					if (contact.getNom().equalsIgnoreCase(nomRecherche)) {
						System.out.println(contact);
						trouve = true;
						break;
					}
				}
				if (!trouve) {
					System.out.println("Contact non trouvé.");
				}
				break;
			case 4:
				System.out.print("Entrez le nom du contact à mettre à jour : ");
				String nomMaj = scanner.nextLine();
				boolean misAJour = false;
				for (Contact contact : contacts) {
					if (contact.getNom().equalsIgnoreCase(nomMaj)) {
						System.out.print("Nouveau téléphone : ");
						String nouveauTelephone = scanner.nextLine();
						System.out.print("Nouvel email : ");
						String nouvelEmail = scanner.nextLine();

						contact.setNumeroTelephone(nouveauTelephone);
						contact.setEmail(nouvelEmail);
						System.out.println("Contact mis à jour avec succès.");
						misAJour = true;
						break;
					}
				}
				if (!misAJour) {
					System.out.println("Contact non trouvé.");
				}
				break;
			case 5:
				System.out.print("Entrez le nom du contact à supprimer : ");
				String nomSuppression = scanner.nextLine();
				for (int i = 0; i < contacts.size(); i++) {
					if (contacts.get(i).getNom().equalsIgnoreCase(nomSuppression)) {
						contacts.remove(i);
						System.out.println("Contact supprimé avec succès.");
						break;
					}
				}
				break;
			case 6:
				System.out.println("Au revoir !");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Choix invalide.");
			}
			System.out.println("Taper entrée pour continuer");
			scanner.nextLine();
		}

	}

}
