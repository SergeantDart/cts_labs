package ro.ase.cts.command;

public class TurnOnLightCommand implements CommandInterface {

	private LightBulb bulb;
	
	public TurnOnLightCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.turnOnLight();
	}


}
