package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender =scan.next();
        System.out.println(gender);


        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println(age);

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println(fullName);

        System.out.println("Enter zipcode");
        int zipCode = scan.nextInt();
        System.out.println(zipCode);

        scan.nextLine();

        System.out.println("Enter your country name");
        String countryName = scan.nextLine();
        System.out.println(countryName);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();
        System.out.println(salary);

        scan.nextLine();

        System.out.println("Enter your company name");
        String companyName = scan.nextLine();
        System.out.println(companyName);

        System.out.println("Enter your address");
        String address = scan.nextLine();
        System.out.println(address);





    }
}
/*
1. ask gender ( next() )
2. ask age ( nextInt() )
3. ask full name ( nextLine() )
4. ask zip code ( nextInt() )
5. ask country name ( nextLine() )
6. ask salary ( nextDouble() )
7. ask company name  ( nextLine() )
 */