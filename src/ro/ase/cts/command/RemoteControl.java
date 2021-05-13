package ro.ase.cts.command;

public class RemoteControl {

	CommandInterface turnLightOnCommand;
	CommandInterface turnLightOffCommand;
	CommandInterface dimLightCommand;
	CommandInterface increaseLightCommand;
	
	public RemoteControl(CommandInterface turnLightOnCommand, CommandInterface turnLightOffCommand,
			CommandInterface dimLightCommand, CommandInterface increaseLightCommand) {
		this.turnLightOnCommand = turnLightOnCommand;
		this.turnLightOffCommand = turnLightOffCommand;
		this.dimLightCommand = dimLightCommand;
		this.increaseLightCommand = increaseLightCommand;
	}
	
	public void pressTurnOnLightButton() {
		turnLightOnCommand.execute();
	}
	
	public void pressTurnOffLightOffButton() {
		turnLightOffCommand.execute();
	}
	
	public void pressDimLightButton() {
		dimLightCommand.execute();
	}
	
	public void pressIncreaseLightCommand() {
		increaseLightCommand.execute();
	}
	
	
	
	
}
