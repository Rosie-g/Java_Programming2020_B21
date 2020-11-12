package day15_Scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = in.nextByte();

        System.out.println("Enter your favourite number: ");
        long number = in.nextLong();

        System.out.println("Are you a student? Enter true or false: ");
        boolean isStudent = in.nextBoolean();

        System.out.println("Your age is: "+age);
        System.out.println("Favourite number is: "+number);

        if(isStudent){
            System.out.println("You are a student!");
        }else {
            System.out.println("Okay, you are not a student!");
        }

    }
}
