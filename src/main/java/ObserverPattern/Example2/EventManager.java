package ObserverPattern.Example2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> events = new HashMap<>();

    public EventManager(String... operations){
        for (String o:operations) {
            events.put(o,new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List <EventListener> event = events.get(eventType);
        event.add(listener);
    }
    public void unSubscribe(String eventType,EventListener listener){
        List <EventListener> event = events.get(eventType);
        event.remove(listener);
    }
    public void myNotify(String eventType, File file){
        List <EventListener> event = events.get(eventType);
        for (EventListener l: event) {
            l.update(eventType,file);
        }
    }

}
