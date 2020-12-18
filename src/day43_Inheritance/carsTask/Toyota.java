package day43_Inheritance.carsTask;

public class Toyota extends Car {

    /*
    variables: brand, model, color, madeIn;
    methods: setInfo, drive, park, toString
     */

    public Toyota(String model, String color, int year, double miles, double price){
        setInfo("Toyota", model, color, "Japan", year, miles, price);
    }

    public static boolean isAffordable, isImmortal;

    static {
        isAffordable = true;
        isImmortal = true;
    }
}
