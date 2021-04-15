package ro.ase.cts.seminar8.facade;

public class Main {

	public static void main(String[] args) {
		Waiter waiter = new Waiter("Jeff Fitzherbert");
		Kitchen kitchen = new Kitchen();
		Order order = new Order(waiter, kitchen);
		
		/*waiter.takeOrder();
		waiter.sendOrderToKitchen();
		kitchen.prepareFood();
		kitchen.callWaiter();
		waiter.serveCustomer();
		kitchen.washDishes();*/
		
		order.orderFood();
			
	}

}
