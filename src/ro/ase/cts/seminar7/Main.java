package ro.ase.cts.seminar7;

import java.util.Scanner;

import ro.ase.cts.seminar4.EnumShoppingCart;
import ro.ase.cts.seminar4.GenericCart;
import ro.ase.cts.seminar5.AbstractProductFactory;
import ro.ase.cts.seminar5.Product;
import ro.ase.cts.seminar5.TechProductFactory;

public class Main {

	public static void main(String[] args) {
		
//		GenericCart myShoppingCart = GenericCart.getInstance("shopping");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Selectati categoria de produse: \n tech - Produse tech \n office - Produse office");
//		String userPreference = scanner.nextLine();
//		
//		AbstractProductFactory productFactory = null;
//		if(userPreference != null) {
//			if(userPreference.equalsIgnoreCase("tech")) {
//				productFactory = new TechProductFactory();
//			}
//		}
//		Product myProduct = null;
//		System.out.println(productFactory.getCatalog());
//	
//		for(int i = 0; i < 3;i++) {
//			userPreference = scanner.nextLine(); 
//			try {
//				int selectedId = Integer.valueOf(userPreference);
//				if(myShoppingCart.getProducts().isEmpty()) {
//					myProduct = productFactory.makeProduct(selectedId);
//				}
//				for(Product product : myShoppingCart.getProducts()) {
//					if(product instanceof TechProduct) {
//						TechProduct tempProduct = (TechProduct)product;
//						if(tempProduct.getId() == selectedId){
//							try {
//								myProduct = (Product)tempProduct.clone();
//							}catch(CloneNotSupportedException e) {
//								e.printStackTrace();
//							}
//						}else {
//							myProduct = productFactory.makeProduct(selectedId);
//						}
//					}
//				}
//			}
//			catch(NumberFormatException e) {
//				System.err.println("Selectie invalida");
//			}
//			
//		
//			if(myProduct != null) {
//				myShoppingCart.addProduct(myProduct);
//			}
//		}
//		
//		for(Product p: myShoppingCart.getProducts()) {
//			System.out.println(p.getDescription());
//		}
		
	}

}
