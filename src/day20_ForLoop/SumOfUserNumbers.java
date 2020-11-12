package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*  System.out.println("Enter a number");
        int n1 = scan.nextInt();

        System.out.println("Enter a number");
        int n2 = scan.nextInt();

        System.out.println("Enter a number");
        int n3 = scan.nextInt();

        System.out.println("Enter a number");
        int n4 = scan.nextInt();

        System.out.println("Enter a number");
        int n5 = scan.nextInt();

        int result = n1+n2+n3+n4+n5;

        System.out.println(result);
*/

        int times = scan.nextInt(); // how many times user wants to enter
        int result = 0; // to contain the sum of each user entered number

        for (int i = 1; i <=times ; i++) {
            System.out.println("Enter a number: "+i);
           result+= scan.nextInt(); // each user input will be added to result

        }
        // 1 2 3 4 5

        System.out.println(result);

    }
}
// write a program that can calculate the sum of 5 user entered input