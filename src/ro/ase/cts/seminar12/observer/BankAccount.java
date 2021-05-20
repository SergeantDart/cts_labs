package ro.ase.cts.seminar12.observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount extends Account implements Depositable, Withdrawable, Transferable {
	
	protected double balance;
	public String iban;
	protected String holder;
	
	protected List<NotificationService> observers;
	
	public BankAccount() {
		this.balance = 0;
		this.iban = "AAAABBBBCCCCDDDDEEEEFFFF";
		this.observers = new ArrayList<>();
	}
	public BankAccount(double balance, String iban) {
		this.balance = balance;
		this.iban = iban;
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
		for(NotificationService notification : observers) {
			notification.notifyUser(amount);
		}
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount > 0) {
			this.balance -= amount;
		}else {
			throw new InsufficientFundsException("[WITHDRAW] Exceeds credit limit");

		}
		for(NotificationService notification : observers) {
			notification.notifyUser(amount);
		}
	}
	
	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("[TRANSFER] Illegal transfer !");
		}else {
			this.withdraw(amount);
			((BankAccount)destination).deposit(amount);
		}
		for(NotificationService notification : observers) {
			notification.notifyUser(amount);
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

	@Override
	public String getIban() {
		return this.iban;
	}
	
	public void addObserver(NotificationService observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(NotificationService observer) {
		this.observers.remove(observer);
	}
	
	
}
