package ro.ase.cts.seminar2;

public class CurrentAccount extends BankAccount {

	private static double MAX_CREDIT = 50000;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.balance -= amount;
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		this.balance -= amount;
		destination.setBalance(destination.getBalance() + amount);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}
	

}
