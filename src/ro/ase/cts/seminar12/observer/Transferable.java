package ro.ase.cts.seminar12.observer;

public interface Transferable {
	
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
}
