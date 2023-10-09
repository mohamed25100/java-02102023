package Model;

import java.io.Serializable;

/*
 * POJO : Plain Old Java Object : doit respecter les règles du langage
 * 
 * Java Bean : 
 * 
 * - champs privés
 * - champs accessibles via getters et setters
 * - présence obligatoire d'un constructeur sans paramètre 
 */

public class Produit implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	
	private String description;
	
	private double prix;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Produit() {
		super();
	}
	
	public Produit(int id, String description, double prix) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", description=" + description + ", prix=" + prix + "]";
	}
}
