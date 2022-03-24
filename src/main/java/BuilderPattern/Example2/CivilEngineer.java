package BuilderPattern.Example2;

public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(Double size){
        houseBuilder.builtBasement();
        houseBuilder.builtFloor();
        houseBuilder.builtRoof();
        houseBuilder.builtInterior();
        houseBuilder.builtHouseType();
        houseBuilder.setSize(size);
    }

}
