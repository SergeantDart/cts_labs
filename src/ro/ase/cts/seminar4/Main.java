package ro.ase.cts.seminar4;

public class Main {

	public static void main(String[] args) {
		GenericCart shoppingCart = GenericCart.getInstance("shoppingCart");
		GenericCart wishlist1 = GenericCart.getInstance("wishlist1");
		GenericCart wishlist2 = GenericCart.getInstance("wishlist2");


		System.out.println("Products: " + shoppingCart.getProducts());
		System.out.println("Products: " + wishlist1.getProducts());
		
		if(shoppingCart == wishlist2) {
			System.out.println("The objects are the same !");
		}

		
		
		EagerShoppingCart example1 = EagerShoppingCart.INSTANCE;
		EagerShoppingCart example2 = EagerShoppingCart.INSTANCE;
		
		if(example1 == example2) {
			System.out.println("The objects are the same !");
		}
		
		EnumShoppingCart mySingleton = EnumShoppingCart.INSTANCE;
		mySingleton.getProducts();
		
	}
}
