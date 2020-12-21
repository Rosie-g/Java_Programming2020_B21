package day44_Inheritance.ShapesTask;


public class Rectangle extends Shape {

    /*
    variables: 4( 1 instance, 3 static)
    methods: 4 (4 ins)
     */

    public double width, length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;

    }

    protected double calcArea() {
        return width * length;
    }

    @Override
    public double calcPerimeter() {
        return (width + length) * 2;
    }
}
