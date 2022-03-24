package AdapterPattern.Example2;

public class Main2 {
    public static void main(String[] args) {
        EnemyRobot robot = new EnemyRobot();
        EnemyAttackerAdapter adapter = new EnemyAttackerAdapter(robot);
        adapter.assingDriver("Alakbar");
        adapter.fireWeapon();
        adapter.moveForward();
        System.out.println();
        EnemyAtacker atacker = new EnemyTank();
        atacker.assingDriver("Alakbar");
        atacker.moveForward();
        atacker.fireWeapon();
        System.out.println(args.length);
    }
}
