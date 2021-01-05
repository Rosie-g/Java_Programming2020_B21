package day45_Exceptions.PhoneTask;

public class Iphone extends Phone {

    public Iphone(String model, double price) {
        super("Iphone", model, "USA", price);
    }

    public void faceTime(long number) {
        System.out.println(brand + " " + model + " is face timing " + number);
    }

    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is face timing " + email);
    }

    public void facetime(long number1, long number2) {
        faceTime(number1);
        faceTime(number2);
    }

    public void faceTime(long number1, long number2, long number3) {
        faceTime(number1, number2);
        faceTime(number3);
    }

    public void faceTime(long email1, long email2) {
        faceTime(email1);
        faceTime(email2);
    }


}
