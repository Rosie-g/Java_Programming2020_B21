package day18_Strings;

import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        double n1 = scan.nextDouble();

        System.out.println("Enter a math number");// *, /, %, +, -
        char operator = scan.next().charAt(0);

        System.out.println("Enter a number");
        double n2 = scan.nextDouble();

        boolean isValidOperator = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';

        if (isValidOperator) {
            if (operator == '*') {
                System.out.println("Multiplication is: " + (n1 * n2));
            } else if (operator == '/') {
                System.out.println("Division: " + (n1 / n2));
            } else if (operator == '%') {
                System.out.println("Remainder: " + (n1 % n2));
            } else if (operator == '+') {
                System.out.println("Addition: " + (n1 + n2));
            } else {
                System.out.println("Subtraction: " + (n1 - n2));
            }


        } else {
            System.err.println("Invalid operator is entered");
        }


    }
}


