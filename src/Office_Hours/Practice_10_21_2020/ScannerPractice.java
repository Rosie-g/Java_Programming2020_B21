package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score:");
        int score = scan.nextInt();
        scan.close();

        String grade = " ";

        if (score >= 0 && score <= 100) { // becomes false if the score < 90

            /*
            if(score >= 90 ){ // becomes false when score < 90
                grade = "Excellent";
            }else if(score>= 80 ){ // becomes false when score < 80
                grade  = "Great";
            }else if(score >= 70){ // becomes false when score < 70
                grade = "Good";
            }else if(score >= 60){ // becomes false when score < 60
                grade = "Passed";
            }else{
                grade = "Fail";
            }
            */

            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        } else {
            grade = "Invalid";
        }

        System.out.println("Your grade is: " + grade);
    }

}
/*
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59

precondition: grade must been between 0 - 100
 */