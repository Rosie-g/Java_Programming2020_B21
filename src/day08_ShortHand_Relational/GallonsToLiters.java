package day08_ShortHand_Relational;

public class GallonsToLiters {

    public static void main(String[] args) {

        int gallons = 100;
        int liters = (int)(gallons * 3.785);

        System.out.println(gallons+" gallons equal to "+liters+" liters");

        int gallons1 = 100;
        double liters1 = gallons * 3.785;
        int result = (int) liters1;
        System.out.println(gallons1+" gallons equal to "+result+" liters");


        /*
        int gallons = 100;

        System.out.println(gallons+" gallons equal to "+(int)(gallons * 3.785) +" litters");
        */

    }


}
/*
1. write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters

 */