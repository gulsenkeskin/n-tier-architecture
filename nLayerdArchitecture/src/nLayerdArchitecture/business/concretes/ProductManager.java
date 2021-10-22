package nLayerdArchitecture.business.concretes;

import java.util.List;

import nLayerdArchitecture.business.abstracts.ProductService;
import nLayerdArchitecture.dataAccess.abstracts.ProductDao;
import nLayerdArchitecture.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	//dependency injection
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		// here write business code		
		//example:
		if(product.getCategoryId()==1) {
			System.out.println("No products are accepted in this category.");
			return;
		}
		this.productDao.add(product);

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
