package ro.ase.cts.seminar5;

public class TechProductFactory extends AbstractProductFactory {

	@Override
	public Product makeProduct(String productName) {
		return new TechProduct(productName);
	}

	@Override
	public String getCatalog() {
		return "Tech products catalog: \ngeneric -- generic tech product.";
	}

}
