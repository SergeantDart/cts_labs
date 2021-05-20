package ro.ase.cts.seminar12.observer;

public abstract class Account {
	
	public abstract double getBalance();
	
	public abstract void setBalance(double amount);
	
	public abstract String getIban();
}
