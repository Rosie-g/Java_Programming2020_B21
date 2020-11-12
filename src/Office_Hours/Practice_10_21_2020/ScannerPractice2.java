package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price:");
        double price = scan.nextDouble(); // 80

        System.out.println("price: "+price);

        System.out.println("Enter the name of the item: ");
        String item = scan.next(); // tomato

        System.out.println(item);

        scan.nextLine(); // EnterEnter // we need this extra nextLine whenever we are using nextLine method

        System.out.println("Enter your full name");
        String fullName =scan.nextLine();

        System.out.println(fullName);
    }
}
