package AdapterPattern.Example2;

import java.util.Random;

public class EnemyRobot {
    Random random = new Random();

    public void smashWithHands(){
        System.out.println("Robot smashed with hands " + random.nextInt(10) + "Soldiers");
    }
    public void walkForward(){
        System.out.println("Robot walked forward to "+ random.nextInt(12) + "meterss");
    }
    public void reactToHuman(String human){
        System.out.println("Robot reacted to human who was" + human);
    }
}
