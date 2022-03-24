package AdapterPattern.Example2;

public class EnemyAttackerAdapter implements EnemyAtacker{
    EnemyRobot enemyRobot;

    public EnemyAttackerAdapter(EnemyRobot robot){
        this.enemyRobot = robot;
    }

    @Override
    public void moveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void assingDriver(String driver) {
        enemyRobot.reactToHuman(driver);
    }
}
