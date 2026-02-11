package SOLID;

// D -> Dependency Inversion Principle (High-level-modules (WHAT SHOULD HAPPEN) should not depend on low-level-modules(HOW IT HAPPENS)).
// Both should depend on abstractions, and abstractions should not depend on details.


// Abstraction
interface NotificationSender {
    void send(String message);
}

// Low Level Module
class EmailService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending email");
    }
}

// Low Level Module
class SMSService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS");
    }
}

// Low Level Module
class PushService implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification");
    }
}


// High Level Module
class NotificationService {
    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String message) {
        sender.send(message);
    }
}

public class D {
    public static void main(String[] args) {

        NotificationSender sender = new SMSService();
        NotificationService service = new NotificationService(sender);

        service.notifyUser("Hello");
    }
}
