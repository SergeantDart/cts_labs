package ro.ase.cts.seminar10.command;

public class Main {

	public static void main(String[] args) {
		
		LightBulb bulb = new LightBulb();
		
		CommandInterface turnOnLightCommand = new TurnOnLightCommand(bulb);
		CommandInterface turnOffLightCommand = new TurnOffLightCommand(bulb);
		CommandInterface dimLightCommand = new DimLightCommand(bulb);
		CommandInterface increaseLightCommand = new IncreaseLightCommand(bulb);

		RemoteControl remoteControl = new RemoteControl(turnOnLightCommand, turnOffLightCommand, dimLightCommand, increaseLightCommand);
		
		remoteControl.pressTurnOnLightButton();
		remoteControl.pressIncreaseLightCommand();
		remoteControl.pressDimLightButton();
		remoteControl.pressDimLightButton();

	}

}
