package ro.ase.cts.seminar2;

public class SavingsAccount extends BankAccount implements Profitable {

	private static double MIN_BALANCE = 100;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addInterest(double interest) {
		this.balance *= (1 + interest / 100);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > MIN_BALANCE)
			this.balance -= amount;
		else
			throw new InsufficientFundsException("Below minimum balance limit");
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		super.transfer(amount, destination);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public void setBalance(double amount) {
		// TODO Auto-generated method stub
		this.balance = amount;
	}
	
}
