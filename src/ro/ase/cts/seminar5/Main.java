package ro.ase.cts.seminar5;

import java.util.Scanner;

import ro.ase.cts.seminar4.GenericCart;

public class Main {

	public static void main(String[] args) {
		
		int idCounter = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		GenericCart myShoppingCart = GenericCart.getInstance("shoppingCart");
		Product smartphone = new TechProduct(++idCounter);
		Product paperClip = new OfficeProduct(++idCounter);
		
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
			}else {
				//TODO
			}
			System.out.println(productFactory.getCatalog());			
		}
		
		System.out.println("Choose a product of your preference...");
		userPreference = scanner.next();
		myProduct = productFactory.makeProduct(Integer.valueOf(userPreference));
		
		if(myProduct != null) {
			myShoppingCart.addProduct(myProduct);
		}

		
		for(Product p : myShoppingCart.getProducts()) {
			System.out.println(p.getDescription());
		}
		
		scanner.close();
	}

}
