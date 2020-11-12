package day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = 0; // user most likely to enter a number that's greater than -99999999

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if (n > max) {
                max = n;
            }
        }

        scan.close();
        System.out.println("max = "+max);
    }
}
/*
 1.  write a program that asks user to enter 5 numbers and returns the maximum number

 */