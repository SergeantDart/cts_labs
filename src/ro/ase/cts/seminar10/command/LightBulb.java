package ro.ase.cts.seminar10.command;

public class LightBulb {
	
	int lightIntensity = 0;
	
	public void turnOnLight() {
		lightIntensity = 1;
		System.out.println("Light is on");
	}
	
	public void turnOffLight() {
		lightIntensity = 0;
		System.out.println("Light is off");
	}
	
	public void dimLight() {
		if(lightIntensity > 0) {
			lightIntensity--;
		}
		System.out.println("Dimming light");
	}
	
	public void increaseLight() {
		lightIntensity++;
		System.out.println("Increasing light");
	}
}
