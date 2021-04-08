package ro.ase.cts.seminar7;

import java.util.ArrayList;

public class AdapterMain {

	public static void main(String[] args) {
		
		ArrayList<MoveableImperial> cars = new ArrayList<>();
		cars.add(new AmericanCar("Ford", 200));
		cars.add(new AmericanCar("Chevrolet",220));
		
		System.out.println(cars.get(0).getMaxSpeedImperial());
	}

}
