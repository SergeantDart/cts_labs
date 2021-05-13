package ro.ase.cts.seminar11.state;

public class Main {

	public static void main(String[] args) {
		Gate gate = new Gate();
		
		gate.authorize();
		gate.enter();

	}

}
