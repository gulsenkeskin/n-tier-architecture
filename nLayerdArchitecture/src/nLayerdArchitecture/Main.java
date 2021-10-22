package nLayerdArchitecture;

import nLayerdArchitecture.business.abstracts.ProductService;
import nLayerdArchitecture.business.concretes.ProductManager;
import nLayerdArchitecture.dataAccess.concretes.AbcProductDao;
import nLayerdArchitecture.dataAccess.concretes.HibernateProductDao;
import nLayerdArchitecture.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new HibernateProductDao());
		Product product1= new Product(1,1,"Silgi",12,60);
		Product product= new Product(1,2,"Silgi",12,60);
		productService.add(product1);
		productService.add(product);

		ProductService productServiceAbc = new ProductManager(new AbcProductDao());
		productServiceAbc.add(product);

	
	}
}

//not: interface'ler somut sýnýflarýn referansýný tutabilir
