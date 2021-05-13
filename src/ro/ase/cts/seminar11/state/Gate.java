package ro.ase.cts.seminar11.state;

public class Gate {
	
	private GateState state;
	
	public Gate() {
		state = new LockedState();
	}
	
	public Gate(GateState state) {
		this.state = state;
	}


	public void setState(GateState state) {
		this.state = state;
	}
	
	public void enter() {
		System.out.println("\nTrying to enter the gate...");
		state.enter(this);
	}
	
	public void authorize() {
		System.out.println("\nTrying to authorize...");
		state.authorize(this);
	}

}
