package ro.ase.cts.seminar11.state;

public class LockedState implements GateState {

	@Override
	public void enter(Gate gate) {
		System.out.println("You must authenticate yourself first!");
	}

	@Override
	public void authorize(Gate gate) {
		System.out.println("User autorized to enter!");
		gate.setState(new OpenState());
	}

}
