package day16_Scanner;

import java.util.Scanner;

public class DynamicCalculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();// accepting the operator

        input.close();//Closing the scanner because we have all the inputs

        double result = 0;
        boolean isValid = true;

        switch (operator) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;

            case"x":
                case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println(operator + " is invalid operator");
                isValid = false;


        }

        if(isValid){

            System.out.println(num1 + operator + num2 + "=" + result);
        }else{
            System.out.println(operator+" is an invalid operator");
        }




    }
}
/*
Create a dynamic calculator
Ask user to enter two numbers and an operator
Ex:
Enter number 1
5
Enter number 2
10
Enter the operator
+
Output: 5+10=15
 */