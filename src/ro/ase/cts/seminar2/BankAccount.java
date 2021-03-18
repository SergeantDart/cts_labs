package ro.ase.cts.seminar2;

public class BankAccount extends Account implements Depositable, Withdrawable, Transferable {
	
	protected double balance;
	public String iban;
	protected String holder;
	protected NotificationService notificationService;
	
	public void setNotificationService() {
		notificationService = new SMSNotificationService();
	}
	
	public BankAccount() {
		this.balance = 0;
		this.iban = "AAAABBBBCCCCDDDDEEEEFFFF";
		setNotificationService();
	}
	public BankAccount(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
		setNotificationService();
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
		notificationService.sendNotification("[DEPOSIT] The amount of " + amount + " was deposited to account no. " + this.iban + "!");
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0) {
			this.balance -= amount;
			notificationService.sendNotification("[WITHDRAW] The amount of " + amount + " was withdrawed from account no. " + this.iban + "!");
		}else
			throw new InsufficientFundsException("[WITHDRAW] Exceeds credit limit");	
	}
	
	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("[TRANSFER] Illegal transfer !");
		}else {
			this.withdraw(amount);
			notificationService.sendNotification("[TRANSFER] The amount of " + amount + " was deposited to account no. " + this.iban + "!");
			((BankAccount)destination).deposit(amount);
			notificationService.sendNotification("[TRANSFER] The amount of " + amount + " was withdrawed from account no. " + destination.iban + "!");

		}
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	
	@Override
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
}
