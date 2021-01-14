package day48_Abstrsaction.AnimalTask;

public class Shark extends Animal implements Swimmable,Predator{


    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps 3 hours");
    }

    @Override
    public void swim() {
        System.out.println("Shark can swim 20 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }
}
