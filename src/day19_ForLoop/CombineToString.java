package day19_ForLoop;

import java.util.Scanner;

public class CombineToString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1 = scan.next();
        String s2 = scan.next();

        scan.close();



        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) { // if last character of first string equals to first character to second string
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }

        System.out.println("===========================================");

        if(s1.endsWith(""+s2.charAt(0) )){ // if first string ends with the first character of last string
            System.out.println(s1 + s2.substring(1));
        }else{
            System.out.println(s1+s2);
        }


    }
}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */