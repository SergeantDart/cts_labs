package ro.ase.cts.seminar5;

import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.TechProduct;

public class ProductFactory {
	private static int idCounter = 0;
	public Product makeProduct(String type, String productName) {
		if(type.equalsIgnoreCase("tech")) {
			return new TechProduct(++idCounter);
		}else if(type.equalsIgnoreCase("office")) {
			return new OfficeProduct(++idCounter);
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
