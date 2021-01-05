package day45_Exceptions.PhoneTask;

public final class Huawei extends Phone {

    public Huawei(String model, double price) {
        super("Huawei", model, "China", price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }
}
