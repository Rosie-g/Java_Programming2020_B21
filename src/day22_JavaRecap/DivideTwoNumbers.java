package day22_JavaRecap;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 and number2");
        int a = scan.nextInt();
        int b = scan.nextInt();


        int count = 0; // number of the times that we can subtract b from a

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + " with a remainder of " + a);

    }
}
