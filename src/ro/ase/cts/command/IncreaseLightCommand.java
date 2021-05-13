package ro.ase.cts.command;

public class IncreaseLightCommand implements CommandInterface {

	private LightBulb bulb;;
	
	public IncreaseLightCommand(LightBulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.increaseLight();
		
	}
	
}
