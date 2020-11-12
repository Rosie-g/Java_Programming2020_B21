package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

        for (int i = 0; i < 1; ) {

            System.out.println("Enter a number");
            int num = scan.nextInt();


            if(num<0){ // if the user entered number is negative it will not be added to the result
                break;
            }else{
                result+=num;
            }
        }

        scan.close();
        System.out.println("Result: " + result);

    }
}
/*
1.  Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

 */