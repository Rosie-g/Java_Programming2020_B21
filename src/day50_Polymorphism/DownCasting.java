package day50_Polymorphism;


import day43_Inheritance.carsTask.BMW;
import day43_Inheritance.carsTask.Car;
import day43_Inheritance.carsTask.Toyota;
import day45_Exceptions.PhoneTask.Iphone;
import day45_Exceptions.PhoneTask.Phone;
import day45_Exceptions.PhoneTask.Samsung;
import day49_Abstraction.RemoteDriverTask.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;


public class DownCasting {

    public static void main(String[] args) {

        Shape shape = new Cylinder(3, 5);
        Cylinder cylinder = (Cylinder) shape;
        System.out.println(cylinder.volume());

        double volume = ((Cylinder) shape).volume();
        System.out.println("volume = " + volume);

        Car car = new Toyota("Camry", "white", 2020, 45000, 35000);
        //    ((BMW)car).race();

        System.out.println("-------------------------------------------");

        Phone phone = new Samsung("S20", 1000);
        //    ((Iphone) phone).faceTime(12345678);

        System.out.println("-------------------------------------------");
        WebDriver driver = new ChromeDriver();
        ((TakeScreenShot) driver).TakeScreenShot("pic");
        ((JavaScriptExecuter) driver).executeScript("");

        System.out.println("--------------------------------------------");

        Shape shape1 = new Circle(3);
        ((Cube) shape1).volume();

        System.out.println("---------------------------------------------");

        RemoteDriver dr1 = new FireFoxDriver(); // up casting
        JavaScriptExecuter js = new FireFoxDriver();
        TakeScreenShot ts = new FireFoxDriver();

        System.out.println("---------------------------------------------");
        boolean isChrome = driver instanceof ChromeDriver;




    }
}
