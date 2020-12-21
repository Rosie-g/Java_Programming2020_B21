package day44_Inheritance.ShapesTask;

public class Circle extends Shape { // Circle IS A Shape

    /*
    variables: 4( 1 instance, 3 static)
    methods: 4 (4 ins)
     */

    public double radius, diameter;
    public final static double PI = 3.14;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;

        diameter = radius * 2;
    }

    public double calcArea() {
        return radius * radius * PI;
    }

    public double calcPerimeter() {
        return diameter * PI;
    }
}


