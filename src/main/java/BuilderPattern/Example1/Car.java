package BuilderPattern.Example1;

@SuppressWarnings("FieldCanBeLocal")

public class Car {
    private final CarType carType;

    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;


    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public Double getFuel() {
        return fuel;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType + "\n" +
                ", seats=" + seats + "\n" +
                ", engine=" + engine + "\n" +
                ", transmission=" + transmission + "\n" +
                ", tripComputer=" + tripComputer + "\n" +
                ", gpsNavigator=" + gpsNavigator.getRoute() + "\n" +
                ", fuel=" + fuel + "\n" +
                '}';
    }
}
