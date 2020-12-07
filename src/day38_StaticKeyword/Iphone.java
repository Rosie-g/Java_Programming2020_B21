package day38_StaticKeyword;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OS = "IOS", madeIn = "China";

    public void call(long phoneNumber) {
        System.out.println("Iphone " + model + " ia calling " + phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madeIn);
    }


    public String toString() {
        return "Iphone{" +
                "brand=" + brand +
                "model=" + model +
                ", color=" + color +
                ", price=" + price +
                ", Operating System=" + OS ;
    }
}
/*
iphone:
    attributes:
            instance: model, color, price, storage
            static: brand, operating system, madeIn, deignated

 */