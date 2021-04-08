package ro.ase.cts.seminar7;

public class AdapterMetric implements MoveableImperial {
	
	private final static double conversionRate = 1.609344d;
	private EuropeanCar europeanCar;
	
	
	public AdapterMetric(EuropeanCar europeanCar) {
		super();
		this.europeanCar = europeanCar;
	}


	@Override
	public int getMaxSpeedImperial() {
		return 0;
	}
	
	public double kmToMiles() {
		return europeanCar.getMaxSpeed() * conversionRate;
	}
	
}
