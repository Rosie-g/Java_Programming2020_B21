package day43_Inheritance.carsTask;

public class CarMax {

    public static void main(String[] args) {


        Toyota toyota = new Toyota("Camry","blue",2020,235000,20000);

        BMW bmw = new BMW("X5","Red",2018,15000,50000);

        System.out.println(toyota);
        System.out.println(bmw);

        System.out.println(BMW.isExpensive);
        System.out.println(BMW.isLuxury);

        System.out.println(Toyota.isAffordable);
        System.out.println(Toyota.isImmortal);
    }
}
