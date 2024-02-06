package design.pattern;
// subclasses are responsible to create the instance of the class.
// its also known as Virtual Constructor.

interface Notification{
	void sendNotification();
}
class EmailNotification implements Notification{
	@Override
	public void sendNotification() {
		System.out.println("Email Notification");
	}
}

class SMSNotification implements Notification{
	@Override
	public void sendNotification() {
		System.out.println("SMS Notification");
	}
}

interface NotificationFactory{
	Notification getNotificationFactory();
}
class EmailNotificationFactory implements NotificationFactory{
	@Override
	public Notification getNotificationFactory() {
		return new EmailNotification();
	}
}
class SMSNotificationFactory implements NotificationFactory{
	@Override
	public Notification getNotificationFactory() {
		return new SMSNotification();
	}
}

public class FactoryMethod {
	public static void main(String[] args) {
		NotificationFactory factory = new SMSNotificationFactory();//new EmailNotificationFactory();
		Notification notification = factory.getNotificationFactory();
		notification.sendNotification();
	}
}