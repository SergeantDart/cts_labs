package ro.ase.cts.seminar2;

public class CreditAccount extends BankAccount {
	
	public static final int MAX_CREDIT = 2500;
	
	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0 - MAX_CREDIT)
			this.balance -= amount;
		else
			throw new InsufficientFundsException("Exceeds credit limit");
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("Illegal transfer !");
		}else {
			this.withdraw(amount);
			((BankAccount)destination).deposit(amount);
		}
	}

}
