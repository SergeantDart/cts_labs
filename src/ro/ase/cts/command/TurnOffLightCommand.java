package ro.ase.cts.command;

public class TurnOffLightCommand implements CommandInterface {
	
	private LightBulb bulb;
	
	public TurnOffLightCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.turnOffLight();
	}

}
