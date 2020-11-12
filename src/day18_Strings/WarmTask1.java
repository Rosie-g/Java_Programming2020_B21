package day18_Strings;

import java.util.Scanner;

public class WarmTask1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }
    }
}
/*
    2. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */