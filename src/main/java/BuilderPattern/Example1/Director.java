package BuilderPattern.Example1;

public class Director {

    public void constructSportCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.2,100));
        builder.setSeats(2);
        builder.setGPSNavigator(new GPSNavigator());
        builder.setTripComputer(new TripComputer());
        builder.setTransmission(Transmission.AUTOMATIC);
    }
    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        builder.setSeats(4);
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    }


}
