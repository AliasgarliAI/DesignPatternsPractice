package FactoryPattern.Shapes;

public abstract class Shape {
    protected double size;
    public abstract void draw();
    public abstract void getShapeSize();

    public void calculateSquare(double size){
        System.out.println(this .size * size);
    }
}
