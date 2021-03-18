package ro.ase.cts.seminar2;

public class SavingsAccount extends BankAccount implements Profitable {

	private static double MIN_BALANCE = 100;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
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
}
