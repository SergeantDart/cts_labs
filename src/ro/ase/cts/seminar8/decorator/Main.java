package ro.ase.cts.seminar8.decorator;

public class Main {

	public static void main(String[] args) {
		AbstractBackpack backpack = new Backpack();
		backpack.pack();
		
		AbstractBackpack decoratedBackpack1 = new WithFoodDecorator(backpack, "banana");
		AbstractBackpack decoratedBackpack2 = new WithLaptopDecorator(backpack, true);
		
		decoratedBackpack1.pack();
		decoratedBackpack2.pack();
	}
}
