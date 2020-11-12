package day11_MultiBranchIf;

public class GreatReport {

    public static void main(String[] args) {

     int score = 90; // 0

        String result = " ";

      if(score < 60){
         result = "Failed"; // System.out.println("Fail");
     }else if(score >= 60 && score < 90){
         result = "Passed"; // System.out.println("Pass");
     }else{ // score >= 90
         result = "Passed with Distinction"; // System.out.println("Passed with Distinction");
     }

        System.out.println(result);



    }
}
/*
2. Write a Java Program for the following logic:
§ If marks < 60, then print “Fail”
§ If marks >= 60, but less than 90, then print “Pass”
§ If marks >= 90, then print “Passed with Distinction”
 */