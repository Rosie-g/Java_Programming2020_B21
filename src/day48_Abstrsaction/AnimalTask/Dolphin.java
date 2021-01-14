package day48_Abstrsaction.AnimalTask;

public class Dolphin extends Animal implements Swimmable {

    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}
