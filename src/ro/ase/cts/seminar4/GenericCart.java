package ro.ase.cts.seminar4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.cts.seminar5.Product;

public class GenericCart {

	private static Map<String, GenericCart> instances = null;
	public String type;
	private ArrayList<Product> products;
	
	private GenericCart() {
		products = new ArrayList<>();
	}
	
	public static synchronized  GenericCart getInstance(String type) {
		if(instances == null) {
			instances = new HashMap<>();	
		}
		
		if(!instances.containsKey(type)) {
			GenericCart myCart = new GenericCart();
			myCart.type = type;
			instances.put(type, myCart);
		}
		
		return instances.get(type);
	}
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
