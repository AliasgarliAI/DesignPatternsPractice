package ObserverPattern.Example2;

import java.io.File;

public class MailNotificationListener implements EventListener{

    private String mail;
    public MailNotificationListener(String mail){
        this.mail = mail;
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + mail  +": Someone has performed " + eventType +
                " operation with the following file: " + file.getName());
    }
}
