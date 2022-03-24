package BuilderPattern.Example2;

public interface HouseBuilder {
    void builtBasement();
    void builtFloor();
    void builtRoof();
    void builtInterior();
    void builtHouseType();
    void setSize(double size);
    House getHouse();

}
