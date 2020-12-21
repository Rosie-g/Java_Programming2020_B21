package day44_Inheritance.ShapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    double calcArea() {
        // Square(side).calcArea()*6
        return side * side * 6;
    }

    @Override
    public double calcPerimeter() {
        return side * 12;
    }
}
