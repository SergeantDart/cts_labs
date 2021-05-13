package ro.ase.cts.seminar11.test;

public class Bank {
	
	private static int account_no = 0;
	private String name;
	private String address;
	
	private static volatile Bank instance;

	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Bank getInstance(String name, String address) {
		Bank result = instance;
		if(instance != null) {
			return result;
		}
		
		synchronized (Bank.class) {
			if(instance == null) {
				instance = new Bank(name, address);
			}
			return instance;
		}
	}
	
	public BankAccount generateAccount(String type) {
		BankAccount bankAccount = null;
		switch(type) {
		case "debit":
			bankAccount = new DebitAccount();
			break;
		case "credit":
			bankAccount = new CreditAccount();
			break;
		default:
			bankAccount = null;
		}
		return bankAccount;
	}
	
	
}
