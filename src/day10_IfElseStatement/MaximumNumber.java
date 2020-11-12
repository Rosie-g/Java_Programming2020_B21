package day10_IfElseStatement;

public class MaximumNumber {

    public static void main(String[] args) {
        // assume thay are three different numbers
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int n4 = 500;


        boolean n1IsMax = n1 > n2 && n1 > n3; // if n1 is greater than both n2 and n3,it means that n1 is maximum number
        boolean n2IsMax = n2 > n1 && n2 > n3;// if n1 is not the maximum and n2 is greater than n3, then n2 is max
                    // !n1IsMax && n2 > n3
        boolean n3IsMax =n3 > n2 && n3 > n1  ;// if n1 and n2 are not the max numbers, then n3 is maximum number
                // !n1IsMax && !n2IsMax

        String str = " is maximum number ";

        if(n1IsMax){
            System.out.println(n1+str);
        }

        if(n2IsMax){
            System.out.println(n2+str);
        }

        if(n3IsMax){
            System.out.println(n3+str);
        }


    }

}
/*
Task02: MaximumNumber
         write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */