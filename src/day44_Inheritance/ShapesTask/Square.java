package day44_Inheritance.ShapesTask;

public class Square extends Shape {

    /*
    variables: 4( 1 instance, 3 static)
    methods: 4 (4 ins)
     */

    public double side;

    public Square(double side){
        this.side = side;
        setInfo("Square");
    }

}
