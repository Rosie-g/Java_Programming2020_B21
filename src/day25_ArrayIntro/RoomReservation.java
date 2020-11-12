package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;


        while (true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("King bed") || word.equals("queen bed") || word.equals("single bed"))) {

                System.out.println("Invalid Entry, Please Re-Enter");
                word = scan.nextLine().toLowerCase();
            }

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) { // while the answer is not valid answer
                System.out.println("Invalid Entry, Please Re-enter?");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            } // it stops if the answer is either yes or no


            if (a.equals("no")) {
                System.out.println("Total price is: "+total);
                break;
            }


        }
    }


    }

/*
    2. write a program for the room reservation:
    King Bed ==> 120$
    Queen Bed ==> 100$
    single Bed ==> 80$
    the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
        do you want to reserve another room:
                    if yes ==> repeat the previous steps
                    if no ==> your total price is: $$$
                    while answer is neither yes or no ==> please re-enter
    HINT: nested loop task, outer loop need to be an infinite loop
 */