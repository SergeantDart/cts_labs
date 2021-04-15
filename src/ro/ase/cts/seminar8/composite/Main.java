package ro.ase.cts.seminar8.composite;

public class Main {

	public static void main(String[] args) {
		
		CatalogComponent techProducts = new ProductCatalog("Tech products catalog");
		techProducts.add(new Product("Dell X38291", 499.99d));
		techProducts.add(new Product("iPhone X 128GB", 799.99d));
		
		CatalogComponent officeProducts = new ProductCatalog("Office products catalog");
		officeProducts.add(new Product("X99 Keops Paperclips", 1.99d));
		officeProducts.add(new Product("A4 paper tanker", 12.99d));

		CatalogComponent genericProducts = new ProductCatalog("Generic products catalog");
		genericProducts.add(techProducts);
		genericProducts.add(officeProducts);
		genericProducts.add(new Product("Red rose XPERIA oranement", 9.99d));
		genericProducts.add(new Product("Black coffee", 5.99d));

		
		System.out.println(genericProducts.toString());
	}

}
