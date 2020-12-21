package day44_Inheritance.ShapesTask;


public class Shape {

    public String name;
    public final static boolean isShape, hasArea, hasPerimeter;

    static {
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }

    public Shape(String name){
        this.name=name;
    }


     double calcArea(){
        return 0;
    }

    public double calcPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name = '" + name + '\'' +
                ", area = '" + calcArea() + '\'' +
                ", perimeter = '" + calcPerimeter() + '\'' +
                '}';
    }
}
/*
1. create a class called Shape
                        variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
                        methods: setInfo, calcArea(), calcPerimeter(),
          toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */