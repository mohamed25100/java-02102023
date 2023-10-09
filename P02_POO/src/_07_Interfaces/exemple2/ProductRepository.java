package _07_Interfaces.exemple2;

import java.util.List;

public interface ProductRepository {

	
	/*
	 * C.R.U.D
	 * 
	 * C : Create
	 * R : Read
	 * U : Update
	 * D : Delete
	 */
	
	void create(Product p);
	
	List<Product> getAll();
	
	Product getById(int id);
	
	void update(Product p);
	
	void delete(int id);
}
