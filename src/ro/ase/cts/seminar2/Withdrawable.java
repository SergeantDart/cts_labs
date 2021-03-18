package ro.ase.cts.seminar2;

public interface Withdrawable {
	
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}
