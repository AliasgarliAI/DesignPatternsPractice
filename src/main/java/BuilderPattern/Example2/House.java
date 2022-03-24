package BuilderPattern.Example2;

public class House implements HousePlan {
    private HouseTypes houseType;
    private double size;
    private String interrior;
    private String basement;
    private String roof;
    private String floor;

    private House(){}

    public static House houseCreator(){
        return new House();
    }

    @Override
    public void setHouseType(HouseTypes houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public void setInterrior(String interrior) {
        this.interrior = interrior;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType=" + houseType +
                ", size=" + size +
                ", interrior='" + interrior + '\'' +
                ", basement='" + basement + '\'' +
                ", roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
