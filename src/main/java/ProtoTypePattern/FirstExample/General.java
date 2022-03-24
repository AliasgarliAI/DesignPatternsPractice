package ProtoTypePattern.FirstExample;

public class General extends GameUnit{
    private String state;

    public void boostMorale(){
        this.state = "MoralBoost";
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    public String toString() {
        return "General "+ state +" @" +  getPosition();
    }
    @Override
    protected void reset() { throw new UnsupportedOperationException("Reset not supported");}

}
