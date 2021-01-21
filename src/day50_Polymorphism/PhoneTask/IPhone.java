package day50_Polymorphism.PhoneTask;

public final class IPhone extends Phone implements AppleApp {

    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if (price > 1500) {
            throw new RuntimeException("Invalid price, cannot be more than 1500");
        }
    }

    @Override
    public void text() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from " + AppStoreName);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()

            if the price of Iphone is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */