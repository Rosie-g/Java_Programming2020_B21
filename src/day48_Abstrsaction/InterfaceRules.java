package day48_Abstrsaction;

public interface InterfaceRules {

    int a = 100; // public static final by default

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);
    }

    public default void m(){

    }



    /*
    Interface can not have objects
    What we can have:
    variables:public static and final by default

    What we can not have:
    constructor
    instance methods
    instance variables

     */
}
