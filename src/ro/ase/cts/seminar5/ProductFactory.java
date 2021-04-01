package ro.ase.cts.seminar5;

import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.TechProduct;

public class ProductFactory {
	
	public Product makeProduct(String type, String productName) {
		if(type.equalsIgnoreCase("tech")) {
			return new TechProduct("iPhone X");
		}else if(type.equalsIgnoreCase("office")) {
			return new OfficeProduct("nylon clips");
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
