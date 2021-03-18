package ro.ase.cts.seminar2;

public class CreditAccount extends BankAccount {
	
	public static final int MAX_CREDIT = 2500;
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0 - MAX_CREDIT) {
			this.balance -= amount;
			notificationService.sendNotification("[WITHDRAW] The amount of " + amount + " was withdrawed from account no. " + this.getIban() + "!");
		}else
			throw new InsufficientFundsException("[WITHDRAW]Exceeds credit limit");
	}

}
