package ro.ase.cts.command;

public class DimLightCommand implements CommandInterface {
	
	private LightBulb bulb;;
	
	public DimLightCommand(LightBulb bulb) {
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		bulb.dimLight();
		
	}
}
