package ro.ase.cts.seminar12.observer;

public class EmailNotification implements NotificationService {

	@Override
	public void notifyUser(double amount) {
		System.out.println("Sending email notification... $" + amount);
		
	}

}
