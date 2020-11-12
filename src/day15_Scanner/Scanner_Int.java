package day15_Scanner;

import java.util.Scanner;
// import day14_Switch_Recap.SalaryCalculator;
// If we wanted to use the SalaryCalculator class in this class, we import it

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner objects called scanner

        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt();// reading an int number
        // int numOne = 9000 ==> Hard coding/fixed value
        // but with scanner it could be dynamic
        System.out.println("Enter number two: ");
        int numTwo = scanner.nextInt();// reading an int number

        System.out.println("Number one is: "+numOne);
        System.out.println("Number two is: "+numTwo);
        System.out.println("Sum: "+ (numOne+numTwo));

        // All the above the print statements,using the variable we have

    }
}
