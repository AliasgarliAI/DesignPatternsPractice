package FactoryPattern;

import FactoryPattern.Factory.ShapeFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeFactory.seeShapeTypes();
        System.out.println();
        System.out.println("Please enter the shape id , which you want");
        Scanner sc = new Scanner(System.in);
        int shape = sc.nextInt();

        ShapeFactory.shapeCreator(shape);

    }
}
