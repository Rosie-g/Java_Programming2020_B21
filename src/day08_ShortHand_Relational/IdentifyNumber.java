package day08_ShortHand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {

      int number = 15000;

      boolean isPositive = number > 0; // if number is greater than 0, than it's positive
        boolean isNegative = number < 0; // if number is less than 0, than it's negative
        boolean isZero = number == 0; // If number is equal to 0, than it's zero


        System.out.println(number+" is positive number: "+isPositive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+" is zero: "+isZero);

    }

}
/*
       number = 100

       output:
       100 is positive number: true
       100 is negative number: false
       100 is zero: false
 */