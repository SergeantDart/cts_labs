package ro.ase.cts.seminar2;

public class SMSNotificationService implements NotificationService {
	
	@Override
	public void sendNotification(String message) {
		System.out.println("Sent notification with SMS message:" + message);
	}

}
