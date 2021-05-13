package ro.ase.cts.seminar11.state;

public interface GateState {
	
	public void enter(Gate gate);
	public void authorize(Gate gate);
	
}
