package day07_UnaryOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {

    short a = 3000;
    long b = a; // implicit casting
    // 3000L

       // int c = b; // MUST be done manually
        int d = a; // implicit casting, automatically done

        double d1 = 200.5;
        int i1 = (int)d1; // 200

        System.out.println(i1);

        System.out.println("===========================");

        long l1 = 100;
        short s1 = (short)l1; // explicit casting

        double d2 = 300;
        float f1 = (float) d2;
        // shortcut for Mac: holding Option + hit Enter

        long l2 = 300; // implicit casting
            // 300L
        int i2 = (int) l2;
            // 300

        System.out.println("=============================");

        short s2 = 400;
        byte b1 = (byte) s2; // -128 <= byte <= 127

        System.out.println(b1); // the value 400 is out of Byte' range, and casting does not change the limit of dataType

        long l3 = 100;
        byte b2 = (byte) l3;

        System.out.println(b2); // -128 <= byte <= 127





    }


}
