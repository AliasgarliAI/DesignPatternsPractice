package FactoryPattern.Factory;

import FactoryPattern.Shapes.Circle;
import FactoryPattern.Shapes.Rectangle;
import FactoryPattern.Shapes.Shape;
import FactoryPattern.Shapes.Triangle;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public enum ShapeType {

    Triangle(1,"FactoryPattern.Shapes.Triangle",new Triangle()),
    Rectanle(2,"FactoryPattern.Shapes.Rectangle", new Rectangle()),
    Circle(3,"FactoryPattern.Shapes.Circle", new Circle());

    int id;
    String type;
    Shape shape;

    private final static List<ShapeType> list = Arrays.asList(ShapeType.values());
    ShapeType(){}

    ShapeType(int id, String planType, Shape shape){
        this.type=planType;
        this.shape = shape;
        this.id = id;
    }
    public static void shapeTypeReturner(){

        for (ShapeType s:list) {
            System.out.println(s);
        }
    }
    @Override
    public String toString() {return "Factory.ShapeType Id: " + id +" " + "Factory.ShapeType name: " + type ;}

    public static Shape shapeReturner(int id){
        for (ShapeType s : list){
            if (s.id == id) {
                return s.shape;
            }
        }
        return null;
    }


}
