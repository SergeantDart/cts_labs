package ro.ase.cts.seminar2;

public interface Transferable {
	
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
}
