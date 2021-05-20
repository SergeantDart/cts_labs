package ro.ase.cts.seminar12.observer;

public class SMSNotification implements NotificationService {

	@Override
	public void notifyUser(double amount) {
		System.out.println("Sending SMS to user...$" + amount);	
	}
	
	
}
