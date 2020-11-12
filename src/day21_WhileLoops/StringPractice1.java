package day21_WhileLoops;

import sun.jvm.hotspot.utilities.ObjectReader;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println(""+f + l);

        String r1 = "Batch " + 2 + 1;


        System.out.println("=====================================");

        while(true) {
            System.out.println("Enter building number:");
            String buildingNumber = scan.next();

            scan.nextLine();

            System.out.println("Enter street name:");
            String street = scan.nextLine();


            System.out.println("Enter apartment number:");
            String apartmentNumber = scan.next();

            scan.nextLine();

            System.out.println("Enter the city:");
            String city = scan.nextLine();


            System.out.println("Enter state:");
            String state = scan.nextLine();

            System.out.println("Enter zipcode:");
            int zipCode = scan.nextInt();

            String fullAddress = buildingNumber + " " + street + ", Apt# " + apartmentNumber + ",\n " + city + ", " + state + ", " + zipCode;
            System.out.println("Your address is: " + fullAddress);

            System.out.println("Would you like to continue? Yes, No?");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
break;
            }
        }
        // String buildingNumber( next )
        // String street ( nextLine )
        // String apartmentNumber ( next )
        // String city ( nextLine )
        // String state ( nextLine )
        // int zipCode ( nextInt )


    }
}