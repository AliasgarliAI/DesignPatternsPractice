package ObserverPattern.Example1;

public class Person {
    private int age;
    public Event<PropertyChangedEventArgs<Person>> changedPropery = new Event<>();

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (this.age == age) return;
        this.age = age;
        changedPropery.fire(new PropertyChangedEventArgs(this,"age",age));

    }
}
