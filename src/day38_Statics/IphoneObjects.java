package day38_Statics;

public class IphoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        Iphone iphone2 = new Iphone();
        Iphone iphone3 = new Iphone();
        Iphone iphone4 = new Iphone();

        System.out.println(iphone1.OS);
        System.out.println(iphone2.OS);
        System.out.println(iphone2.OS);
        System.out.println(iphone3.OS);
        System.out.println(iphone4.OS);

        System.out.println("============================");
        Iphone.getInfo();







    }
}
