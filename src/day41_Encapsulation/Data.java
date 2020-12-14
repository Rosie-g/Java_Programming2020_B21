package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C"; // default access

    // protected  static String protectedVariable  = "D";

   Data(){

    }

    public static void publicMethod(){
        System.out.println("Public Method");
    }

    private static void privateMethod(){
        System.out.println("Private Method");
    }

    static void defaultMethod(){
        System.out.println("Default Method");
    }

}
