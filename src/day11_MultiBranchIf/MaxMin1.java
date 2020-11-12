package day11_MultiBranchIf;

public class MaxMin1 {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        int max = 0;
        if(n1 > n2){
            max = n1;
        }else{
            max = n2;
        }

        System.out.println("Max number in If: "+max);


        int max2 = (n1>n2)? n1 : n2;

        System.out.println("Max number in Ternary is: "+max2);


        //String result = (n1 > n2) ? n1 +" is the max number" :  n2+ " is the max number";

        //System.out.println(result);

        System.out.println("=======================");

        int min1 = 0;
        if (n1<n2){
            min1 = n1;
        }else{
            min1 = n2;
        }

        System.out.println("min number in If: "+min1);

        int min2 = (n1<n2) ? n1 : n2;

        System.out.println("Min number in Ternary is: "+min2);



    }
}
/*
 1. write a program that can find the maximum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement

 2. write a program that can find the minimum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement


 */