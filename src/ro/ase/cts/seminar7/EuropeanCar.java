package ro.ase.cts.seminar7;

public class EuropeanCar implements MoveableImperial {

	private String model;
	private int maxSpeed;
	
	public EuropeanCar(String model, int maxSpeed) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public int getMaxSpeedImperial() {
		return 0;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
