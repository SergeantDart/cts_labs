package ro.ase.cts.seminar12.observer;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account = new CreditAccount();
		account.addObserver(new SMSNotification());
		account.addObserver(new EmailNotification());
		
		account.deposit(100);
		
		try {
			account.withdraw(49);
		}catch(InsufficientFundsException e) {
			e.printStackTrace();
		}
	}

}
