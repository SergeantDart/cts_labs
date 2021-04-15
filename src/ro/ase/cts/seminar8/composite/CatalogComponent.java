package ro.ase.cts.seminar8.composite;

public abstract class CatalogComponent {
	
	public abstract void add(CatalogComponent catalogComponent);	
	public abstract void remove(CatalogComponent catalogComponent);	
	public abstract String getName();	
	public abstract double getPrice();	
	
}
