package BuilderPattern.Example1;

import BuilderPattern.Example1.Car;
import BuilderPattern.Example1.CarBuilder;
import BuilderPattern.Example1.Director;

public class MainForBuilder {
    public static void main(String[] args) {
        CarBuilder carBuilder= new CarBuilder();

        Director director= new Director();
        director.constructCityCar(carBuilder);
        Car c =  carBuilder.getResult();
        System.out.println(c);

    }
}
