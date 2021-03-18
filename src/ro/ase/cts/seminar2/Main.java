package ro.ase.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		
		//get information about balance
		CurrentAccount ca1 = new CurrentAccount(300, "abcdabcdabcdabcdabcdabcd");
		System.out.println("Maximum credit limit for the first account is: " + CurrentAccount.getMAX_CREDIT());
		
		//deposit an amount 
		ca1.deposit(200);
		
		//withdraw an amount
		try {
			ca1.withdraw(100);
		}catch(InsufficientFundsException e) {
			System.err.println(e.getMessage());
		}
		
		//transfer an amount to another account
		CurrentAccount ca2 = new CurrentAccount(500, "12341234123412341234");
		
		try {
			ca1.transfer(60, ca2);
		} catch (IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	
		//implementing an interface
		SavingsAccount sa = new SavingsAccount(300, "abcdabcdabcdabcdabcdabcd");
		sa.deposit(300);
		sa.addInterest(10);
		
		//using bank class to instantiate accounts based on differents type stored in an enum
		Bank b = new Bank();
		BankAccount ba = b.openBankAccount(AccountType.CURRENT);
		System.out.println("The current balance for the newly opened is: " + ba.getBalance());
		
		CreditAccount cra = (CreditAccount)b.openBankAccount(AccountType.CREDIT);
		cra.setBalance(500);

		try {
			cra.transfer(200, ca1);
		} catch (IllegalTransferException | InsufficientFundsException e) {
			e.printStackTrace();
		}

	
	}
	

}
