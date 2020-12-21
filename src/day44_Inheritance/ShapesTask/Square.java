package day44_Inheritance.ShapesTask;

public class Square extends Shape {

    /*
    variables: 4( 1 instance, 3 static)
    methods: 4 (4 ins)
     */

    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;

    }

    @Override
    double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }
}
