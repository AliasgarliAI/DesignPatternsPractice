package BuilderPattern.Example2;
public class VillaBuilder implements HouseBuilder {

    private House house;

    public VillaBuilder(){
        house = House.houseCreator();
    }

    @Override
    public void builtBasement() {
        house.setBasement("basement made in marble");
    }

    @Override
    public void builtFloor() {
        house.setFloor("floor is made of wood ");
    }

    @Override
    public void builtRoof() {
        house.setRoof("roof made of red slate");
    }

    @Override
    public void builtInterior() {
        house.setInterrior("Europian interior was created");
    }

    @Override
    public void builtHouseType() {
        house.setHouseType(HouseTypes.Villa);
    }

    @Override
    public void setSize(double size) {
        this.house.setSize(size);
    }

    public void setSize(Double size){
        house.setSize(size);
    }
    @Override
    public House getHouse(){
        return this.house;
    }

}
