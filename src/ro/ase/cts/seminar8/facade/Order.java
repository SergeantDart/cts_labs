package ro.ase.cts.seminar8.facade;

public class Order {
	
	private Waiter waiter;
	private Kitchen kitchen;
	public Order(Waiter waiter, Kitchen kitchen) {
		super();
		this.waiter = waiter;
		this.kitchen = kitchen;
	}
	
	public void orderFood() {
		waiter.takeOrder();
		waiter.sendOrderToKitchen();
		kitchen.prepareFood();
		kitchen.callWaiter();
		waiter.serveCustomer();
		kitchen.washDishes();
	}
}
