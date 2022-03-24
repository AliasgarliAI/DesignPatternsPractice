package ObserverPattern.Example1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Targs> {
    int count = 0;
    Map<Integer, Consumer<Targs>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<Targs> handler){
        int i = count;
        handlers.put(count++, handler);

        return new Subscription(this,i);
    }

    public void fire(Targs args){
        for (Consumer<Targs> c : handlers.values()){
            c.accept(args);
        }

    }

    class Subscription implements AutoCloseable {
        private Event<Targs> event;
        private int id;

        public Subscription(Event<Targs> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() throws Exception {
            event.handlers.remove(id);
        }
    }
}
