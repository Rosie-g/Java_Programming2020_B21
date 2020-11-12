package day08_ShortHand_Relational;

public class CalculateTriangle {

    public static void main(String[] args) {

        int angle = 30;
        int angle1 = 30;
        int angle2 = 90;

        int sum = angle + angle1 + angle2;
        boolean isValid =  sum == 150;

        System.out.println("The triangle is valid: "+isValid);


    }


}
/*
 1. write a program that can check if the the given triangle is valid
            angle1 = 30
            angle2 = 30
            angle = 90
            sum = 150
            isValid

        output:
            The triangle is valid: false

 */