package ProtoTypePattern.UnderstandingCopying;

import java.util.Arrays;

public class Person implements Cloneable {

    public String[] names;
    public Adress address;

    public Person(String[] names, Adress address) {
        this.names = names;
        this.address = address;
    }

    @SuppressWarnings("MethodDoesntCallSuperMethod")
    @Override
    public Person clone() throws CloneNotSupportedException {
        return new Person(names.clone(),address.clone());
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}
