package ProtoTypePattern.UnderstandingCopying;

public class Adress implements Cloneable{
    public String streetName;
    public int streetNumber;

    @Override
    public Adress clone() throws CloneNotSupportedException {
        return new Adress(streetName,streetNumber);
    }

    public Adress(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
