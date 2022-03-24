package FactoryPattern.Shapes;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw FactoryPattern.Shapes.Rectangle");
    }

    @Override
    public void getShapeSize() {
        size = 5;
    }
}
