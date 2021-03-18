package ro.ase.cts.seminar2;

public class CurrentAccount extends BankAccount  {

	private final static double MAX_CREDIT = 50000;
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0 - MAX_CREDIT) {
			this.balance -= amount;
			if(this.notificationService != null) {
				this.notificationService.sendNotification("The amount of " + amount + " was withdrawed from your account !");
			}
		}else
			throw new InsufficientFundsException("Exceeds credit limit");
	}
	
	

	public static double getMAX_CREDIT() {
		return MAX_CREDIT;
	}
}
