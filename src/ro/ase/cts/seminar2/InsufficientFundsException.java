package ro.ase.cts.seminar2;

public class InsufficientFundsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}
	
	public InsufficientFundsException(String message) {
		super(message);
	}
}
