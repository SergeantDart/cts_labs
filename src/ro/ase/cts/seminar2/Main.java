package ro.ase.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		
		//get information about balance
		CurrentAccount ca1 = new CurrentAccount(300, "abcdabcdabcdabcdabcdabcd");
		System.out.println("The current balance for first account is : " + ca1.getBalance());
		System.out.println("Maximum credit limit for the first account is: " + CurrentAccount.getMAX_CREDIT());
		
		//deposit an amount 
		ca1.deposit(200);
		System.out.println("The current balance for first account is: " + ca1.getBalance());
		
		//withdraw an amount
		try {
			ca1.withdraw(100);
		}catch(InsufficientFundsException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("The current balance for first account is: " + ca1.getBalance());
		
		//transfer an amount to another account
		CurrentAccount ca2 = new CurrentAccount(500, "12341234123412341234");
		System.out.println("The current balance for second account is: " + ca2.getBalance());
		
		try {
			ca1.transfer(60, ca2);
		} catch (IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		System.out.println("The current balance for first account is: " + ca1.getBalance());
		System.out.println("The current balance for second account is: " + ca2.getBalance());


	
		
		
	}
	

}
