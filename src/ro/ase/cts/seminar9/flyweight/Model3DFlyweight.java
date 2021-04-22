package ro.ase.cts.seminar9.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements Model3DFlyweightInterface {

	String name;
	ArrayList<Double> modelPoints = new ArrayList<>();
	
	
	public Model3DFlyweight(String name) {
		this.name = name;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.modelPoints = new ArrayList<>(new Random().nextInt(1000));
	}


	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("%s at coordinates (%4.2f, %4.2f, %4.2f) with color %s",
				this.name, data.getX(), data.getY(), data.getZ(), data.getColor()));
		
	}

}
