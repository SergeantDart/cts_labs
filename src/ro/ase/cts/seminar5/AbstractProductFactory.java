package ro.ase.cts.seminar5;

public abstract class AbstractProductFactory {
	
	public abstract Product makeProduct(String productName);
	public abstract String getCatalog();

}
