package ro.ase.cts.seminar4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenericCart {

	private static Map<String, GenericCart> instances = null;
	public String type;
	private ArrayList<String> products;
	
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
	
	public ArrayList<String> getProducts() {
		return products;
	}
}
