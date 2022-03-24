package FactoryPattern.Factory;

import FactoryPattern.Shapes.*;
import java.util.Scanner;

public class ShapeFactory {

    public ShapeFactory(){}

    public static void seeShapeTypes(){
        ShapeType.shapeTypeReturner();
    }
    public static void shapeCreator(int id){
        Shape s =  ShapeType.shapeReturner(id);
        if (s == null){
            System.out.println("The choosen object was not found");
            return;
        }
        s.draw();
        s.getShapeSize();

        System.out.println("In order to calculate Square please enter size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        s.calculateSquare(size);

    }

}
