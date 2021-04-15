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
				this.products.remove(i);
			}
		}
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		throw new UnsupportedOperationException("The product catalog doesn't have a price!");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n").append(this.name).append("\n");
		for(CatalogComponent component : this.products) {
			builder.append(component.toString());
		}
		builder.append("\n").append("------------------").append("\n");
		return builder.toString();
	}
	
	
	
}
