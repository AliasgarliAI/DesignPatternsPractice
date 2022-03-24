package ProtoTypePattern;

import ProtoTypePattern.FirstExample.SwordsMan;
import javafx.geometry.Point3D;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan swMan = new SwordsMan();
        swMan.move(new Point3D(-10,0,0), 20);
        swMan.attack();

        System.out.println(swMan);

        SwordsMan swMan2= (SwordsMan) swMan.clone();
        System.out.println("The Object 2" +"\r\n" + swMan2 );

        swMan2.move(new Point3D(30,20,10), 100);
        swMan2.attack();
        System.out.println("--------------------------------------");
        System.out.println(swMan2);

    }
}
