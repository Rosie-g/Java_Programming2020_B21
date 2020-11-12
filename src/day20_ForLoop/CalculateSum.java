package day20_ForLoop;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt(); //
        int result = 0;

        if(num>=1){

        for (int i = 1; i <= num; i++) { // used for calculating the sum and add them into result
            result += i;
        }

        }else{
            System.err.println("Invalid entry");
        }
        System.out.print("result: " + result);
    }
}
/*
4. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050
                input: 50
                output: 1275
 */