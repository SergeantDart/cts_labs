package ro.ase.cts.seminar11.test;

public interface BankAccount {
	
	public void transfer(BankAccount destination, double amount);
	public void deposit(double amount);
}
