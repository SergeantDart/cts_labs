package ro.ase.cts.seminar8.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {
	
	String name;
	ArrayList<CatalogComponent> products;
	
	
	public ProductCatalog(String name) {
		super();
		this.name = name;
		this.products = new ArrayList<>();
	}

	@Override
	public void add(CatalogComponent catalogComponent) {
		this.products.add(catalogComponent);
		
	}

	@Override
	public void remove(CatalogComponent catalogComponent) {
		for(int i = 0; i < this.products.size(); i++) {
			if(this.products.get(i).getName().equals(catalogComponent.getName())) {
				products.remove(i);
			}
		}
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return 0;
	}
	
}
