package ro.ase.cts.seminar4;

import java.util.ArrayList;

public enum EnumShoppingCart {
	
	INSTANCE;
	
	private ArrayList<String> products;
	
	public ArrayList<String> getProducts() {
		if(products == null) {
			products = new ArrayList<>();
		}
		return products;
	}
}
