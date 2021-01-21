package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day47_Abstraction.ShapeTasks.Circle;
import day47_Abstraction.ShapeTasks.Shape;
import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Cylinder;

public class ReferenceCasting {

    public static void main(String[] args) {

        // implicit casting: smaller to larger

        int a = 10;
        double b = a;

        // explicit casting: larger to smaller

        double d = 10.5;
        int c = (int) d;

        System.out.println("--------------------------------------------");
        // upcasting: smaller reference type to larger reference type

        Circle circle = new Circle(3);
        Shape shape = circle;

        // down casting: larger reference type to smaller reference type

        Animal animal = new Dog("Archi", "Husky", 'M', 12, "White", "Small");
        Dog dog = (Dog) animal;
        dog.bark();





    }
}
