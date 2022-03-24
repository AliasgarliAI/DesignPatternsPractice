package ObserverPattern.Example2;

import java.io.File;

public class SmsNotificationListener implements EventListener{

    String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + phoneNumber  +": Someone has performed " + eventType +
                " operation with the following file: " + file.getName());
    }
}
