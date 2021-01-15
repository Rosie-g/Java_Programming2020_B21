package day49_Abstraction.ShapeTask;

public final class Rectangle extends Shape {

    public double w, l;

    public Rectangle(double w, double l) {
        super("Rectangle");
        if (w <= 0 || l <= 0) {
            throw new RuntimeException("No such a rectangle with width & length of " + w + " " + l);
        }
        this.w = w;
        this.l = l;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
