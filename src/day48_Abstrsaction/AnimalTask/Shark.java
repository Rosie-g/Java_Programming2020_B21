package day48_Abstrsaction.AnimalTask;

public class Shark extends Animal implements Swimmable{


    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void swim() {

    }
}
