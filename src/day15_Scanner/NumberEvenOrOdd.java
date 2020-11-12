package day15_Scanner;

import java.util.Scanner;

public class NumberEvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println(number+" is even");

        int number2 = input.nextInt();

        System.out.println(number2+" is odd");
    }
}
