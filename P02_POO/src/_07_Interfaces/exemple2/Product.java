package _07_Interfaces.exemple2;

public class Product {

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

	public Product() {
		
	}
	
	public Product(int id, String description) {
		
		this.id = id;
		this.description = description;
	}

	public Product(int id, String description, double prix) {
		
		this.id = id;
		this.description = description;
		this.prix = prix;
	}
	
}
