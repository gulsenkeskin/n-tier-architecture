package nLayerdArchitecture;

import nLayerdArchitecture.business.abstracts.ProductService;
import nLayerdArchitecture.business.concretes.ProductManager;
import nLayerdArchitecture.dataAccess.concretes.HibernateProductDao;
import nLayerdArchitecture.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: Spring IoC ile çözülecek
		ProductService productService = new ProductManager(new HibernateProductDao());
		
		Product product= new Product(1,1,"Silgi",12,60);
		productService.add(product);
	}
}

//not: interface'ler somut sýnýflarýn referansýný tutabilir
