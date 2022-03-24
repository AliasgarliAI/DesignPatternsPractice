package ObserverPattern.Example1;

public class PropertyChangedEventArgs<T> {
    private T source;
    public  String propertyName;
    public Object newValue;

    public PropertyChangedEventArgs(T source, String propertyName, Object newValue) {
        this.source = source;
        this.propertyName = propertyName;
        this.newValue = newValue;
    }
}
