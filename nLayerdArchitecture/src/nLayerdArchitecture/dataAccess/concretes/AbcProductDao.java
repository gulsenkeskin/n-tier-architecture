package nLayerdArchitecture.dataAccess.concretes;

import java.util.List;

import nLayerdArchitecture.dataAccess.abstracts.ProductDao;
import nLayerdArchitecture.entities.concretes.Product;

public class AbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Add: abc method");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
