package ObserverPattern.Example1;

import ObserverPattern.Example1.Event;
import ObserverPattern.Example1.Person;
import ObserverPattern.Example1.PropertyChangedEventArgs;

public class Main{
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Event<PropertyChangedEventArgs<Person>>.Subscription subscription = person.changedPropery.addHandler(x -> {
            System.out.println("Person's" + x.propertyName + " chnaged to " + x.newValue);
        });

        person.setAge(25);
        person.setAge(26);
        person.setAge(27);
        subscription.close();
        person.setAge(28);

    }


}
