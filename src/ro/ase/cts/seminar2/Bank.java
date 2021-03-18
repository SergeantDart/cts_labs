package ro.ase.cts.seminar2;

public class Bank {
	
	public static int nextId;
	
	public BankAccount openBankAccount(AccountType accountType) {
		if(accountType == AccountType.CURRENT) {
			return new CurrentAccount();
		}else if(accountType == AccountType.SAVINGS) {
			return new SavingsAccount();
		}else if(accountType == AccountType.CREDIT) {
			return new CreditAccount();
		}else {
			throw new UnsupportedOperationException();
		}
	}
}
