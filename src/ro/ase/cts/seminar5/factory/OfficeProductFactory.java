package ro.ase.cts.seminar5.factory;

public class OfficeProductFactory extends AbstractProductFactory {
	
	@Override
	public Product makeProduct(int productId) {
		return new OfficeProduct(productId);
	}

	@Override
	public String getCatalog() {
		return "Office products catalog: \ngeneric -- generic office product.";
	}
}
