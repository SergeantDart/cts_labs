package ro.ase.cts.seminar5;

import java.util.Scanner;

import ro.ase.cts.seminar4.GenericCart;
import ro.ase.cts.seminar5.factory.AbstractProductFactory;
import ro.ase.cts.seminar5.factory.OfficeProduct;
import ro.ase.cts.seminar5.factory.Product;
import ro.ase.cts.seminar5.factory.TechProduct;
import ro.ase.cts.seminar5.factory.TechProductFactory;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		GenericCart myShoppingCart = GenericCart.getInstance("shoppingCart");
		Product smartphone = new TechProduct("Samsung A20");
		Product paperClip = new OfficeProduct("A4 toner ink");
		
		myShoppingCart.addProduct(smartphone);
		myShoppingCart.addProduct(paperClip);
		
		Product myProduct = null;
	
//		if(userPreference.equalsIgnoreCase("tech")) {
//			myProduct = new TechProduct();
//		}else if(userPreference.equalsIgnoreCase("office")) {
//			myProduct = new OfficeProduct();
//		}else {
//			System.out.println("Invalid option !");
//		}
//		
		
		System.out.println("Product catalog: \ntech -- produse tech; \noffice -- produse office.");
		String userPreference = scanner.nextLine();	
		System.out.println();
		
		AbstractProductFactory productFactory = null;
		if(userPreference != null) {
			if(userPreference.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
			myProduct = productFactory.makeProduct("generic");
			
		}
		
		if(myProduct != null) {
			myShoppingCart.addProduct(myProduct);
		}

		
		for(Product p : myShoppingCart.getProducts()) {
			System.out.println(p.getDescription());
		}
		
		
		
		
		scanner.close();
	}

}