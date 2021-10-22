package nLayerdArchitecture.business.abstracts;

import java.util.List;

import nLayerdArchitecture.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();

}
