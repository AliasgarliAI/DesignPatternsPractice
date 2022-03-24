package FactoryPattern.Shapes;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void getShapeSize() {
        size=6;
    }
}
