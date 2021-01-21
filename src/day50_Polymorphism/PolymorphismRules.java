package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Dog;

import day46_JavaRecap.CarTask.BMW;
import day46_JavaRecap.CarTask.Car;
import day46_JavaRecap.CarTask.Tesla;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolymorphismRules {

    public static void main(String[] args) {

        Dog dog = new Dog("Archi", "Husky", 'M', 12, "White", "Small");
        dog.bark();

        Animal animal = new Dog("Archi", "Husky", 'M', 12, "White", "Small");
        animal.eat("vegan food");
        boolean isBark = animal instanceof Dog;


        Cube cube = new Cube(5);

        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        Shape shape = new Cube(5);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println("---------------------------------------------------------");

        Car car = new Tesla("Model 3", "White", 2019, 45000);
       // car.autoPilot();
        car.start();

        Car car1 = new BMW("X5","red",2018,55000);
        car1.start();







    }
}
