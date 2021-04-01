package ro.ase.cts.seminar5.factory;

public abstract class AbstractProductFactory {
	
	public abstract Product makeProduct(int productId);
	public abstract String getCatalog();

}
