package ro.ase.cts.seminar2;

public abstract class Account {
	
	public abstract void deposit(double amount);
	
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	
	public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
	
	public abstract double getBalance();
	
	public abstract void setBalance(double amount);

}
