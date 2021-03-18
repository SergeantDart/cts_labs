package ro.ase.cts.seminar2;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sent notification with email message:" + message);
	}

}
