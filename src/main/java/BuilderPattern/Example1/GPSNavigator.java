package BuilderPattern.Example1;

public class GPSNavigator {
    private String route;

    public GPSNavigator(){
        this.route = "Yasamal, Alatava 1, ev163 ";
    }
    public GPSNavigator(String manualRoute){
        this.route = manualRoute;
    }

    public String getRoute(){
        return route;
    }
}
