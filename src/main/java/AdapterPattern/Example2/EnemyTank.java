package AdapterPattern.Example2;

import java.util.Random;

public class EnemyTank implements EnemyAtacker{
    Random random = new Random();

    @Override
    public void moveForward() {
        System.out.println("Tank moves forward up to"+ random.nextInt(30) +"meters");
    }

    @Override
    public void fireWeapon() {
        System.out.println("Tank made damage and destroyed buildings in" + random.nextInt(50)+"radius");
    }

    @Override
    public void assingDriver(String driver) {
        System.out.println("Assigned driver was" + driver);
    }
}
