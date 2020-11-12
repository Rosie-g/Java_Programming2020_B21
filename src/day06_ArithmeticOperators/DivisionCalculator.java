package day06_ArithmeticOperators;

public class DivisionCalculator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 3;
        int result = num1/num2;
        int remainder = num1%num2;
        String finalResult = num1+" divide by "+num2+" with a remainder of "+remainder;

        System.out.println(finalResult);

        int a = 20;
        int b = 6;
        int c = a/b;
        int d = a%b;

        String nextResult = a+" divide by "+b+" is equal to "+c+" with a remainder of "+d;

        System.out.println(nextResult);

    }



}
/*
Task: DivisionCalculator

        write a program that can calculate first number by second number, and print out the result

            num1 = 10;
            num2 = 3;  3.3333...
                       3   1

            output:
                10 divide by 3 is equal to 3 with a remainder of 1


            num1 = 20
            num2 = 6

            output:
                 20 divide by 6 is equal to 3 with a remainder of 2


            num1 = 100;
            num2 = 20;

            output:
                 100 divide by 20 is equal to 5 with a remainder of 0
 */