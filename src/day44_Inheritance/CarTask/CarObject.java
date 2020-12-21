package day44_Inheritance.CarTask;

public class CarObject {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic","Red",23000,2019);

        honda.start();

        System.out.println(honda);

        Mercedes    mercedes = new Mercedes("E320","Black",23000,2019);
        mercedes.start();
        System.out.println(mercedes);

        Jeep jeep = new Jeep("Cherokee","Black",23000,2019);
        jeep.start();
        System.out.println(jeep);

        Tesla tesla  = new Tesla("E320","Black",23000,2019);
        tesla.start();
        System.out.println(tesla);
    }
}
