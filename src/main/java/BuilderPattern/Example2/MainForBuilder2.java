package BuilderPattern.Example2;

public class MainForBuilder2 {
    public static void main(String[] args) {

        VillaBuilder villa = new VillaBuilder();
        CivilEngineer engineer = new CivilEngineer(villa);
        engineer.constructHouse(25.0);
        House house = engineer.getHouse();
    }
}
