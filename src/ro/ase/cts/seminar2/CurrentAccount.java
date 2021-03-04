package ro.ase.cts.seminar2;

public class CurrentAccount extends BankAccount  {

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
	public void withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		if(this.balance - amount > 0 - MAX_CREDIT)
			this.balance -= amount;
		else
			throw new InsufficientFundsException("Exceeds credit limit");
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if(((BankAccount)destination).equals(this.iban)){
			throw new IllegalTransferException("Illegal transfer !");
		}else {
			this.withdraw(amount);
			((BankAccount)destination).deposit(amount);
		}
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	public static double getMAX_CREDIT() {
		return MAX_CREDIT;
	}

	
}
