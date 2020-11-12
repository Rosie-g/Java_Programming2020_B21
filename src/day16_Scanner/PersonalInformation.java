package day16_Scanner;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();

        if (liveWithNumber > 0 && liveWithNumber <= 12) {

            if (liveWithNumber <= 2) {// only be 1 or 2
                System.out.println("Live with less than 2 people");
            } else if (liveWithNumber < 7) { // include 3-6
                System.out.println("Live with 3-6 people");
            } else {
                System.out.println("You live with more than 6 people");
            }


        } else {
            System.out.println("Not a valid number of people");
        }


        System.out.println("What city they live in");
        String city = input.nextLine();

        System.out.println("Are you live in Downtown");
        boolean liveInDownTown = input.hasNextBoolean();


            System.out.println("What is your favourite animal");
        String animal = input.nextLine();

        System.out.println("How many pets you want");
        int pets = input.nextInt();

        System.out.println("Enter your SSN");
        long ssn = input.nextLong();


    }
}
/*
Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Ask SSN?
    Print everything and points

 */