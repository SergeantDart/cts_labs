package ro.ase.cts.seminar2;

public class BankAccount extends Account {
	
	protected double balance;
	public String iban;
	protected String holder;
	
	public BankAccount() {
		this.balance = 0;
		this.iban = "AAAABBBBCCCCDDDDEEEEFFFF";
	}
	public BankAccount(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
	
	@Override
	public void setBalance(double amount) {
		this.balance = amount;
	}
		
	
}
