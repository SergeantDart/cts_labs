package ro.ase.cts.seminar5;

public abstract class AbstractProductFactory {
	
	public abstract Product makeProduct(int productId);
	public abstract String getCatalog();

}
