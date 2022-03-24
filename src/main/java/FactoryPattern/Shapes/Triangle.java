package FactoryPattern.Shapes;


public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw FactoryPattern.Shapes.Triangle");
    }

    @Override
    public void getShapeSize() {
        size = 7;
    }
}
