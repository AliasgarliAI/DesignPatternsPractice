package ObserverPattern;

import ObserverPattern.Example2.Editor;
import ObserverPattern.Example2.MailNotificationListener;
import ObserverPattern.Example2.SmsNotificationListener;

public class Main2 {
    public static void main(String[] args) throws Exception {

        Editor editor = new Editor();
        editor.manager.subscribe("open",new MailNotificationListener("eelesgerli98@gmail.com"));
        editor.manager.subscribe("save",new SmsNotificationListener("994507477255"));

        editor.openFile("test.txt");
        editor.saveFile();

    }
}
