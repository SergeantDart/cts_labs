package ro.ase.cts.seminar12.observer;
public class CreditAccount extends BankAccount {
	
	public static final int MAX_CREDIT = 2500;
	
	public CreditAccount() {
		super();
	}
	public CreditAccount(double balance, String iban) {
		super(balance, iban);
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0 - MAX_CREDIT) {
			this.balance -= amount;
		}else {
			throw new InsufficientFundsException("[WITHDRAW]Exceeds credit limit");
		}
		for(NotificationService notification : observers) {
			notification.notifyUser(amount);
		}
	}

}
