package ProtoTypePattern.FirstExample;

public class SwordsMan extends GameUnit{
    private String state;
    public void attack(){
        this.state= "Attacking";
    }

    @Override
    public String toString() {
        return "SwordsMan "+ state +" @ " +  getPosition();
    }

    @Override
    protected void reset() {
        state ="idle";
    }
}
