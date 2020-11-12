package day20_ForLoop;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Ruzanna Gazarian";

        String result = ""; // we want to contain expected result which is the reversed version of str
        // cba

        for (int i = str.length()-1; i >= 0; i--) {
            result +=str.charAt(i);
        }
        System.out.println(result);

    }
}
/*
  5. write a program that can reverse any given string
            ex:
                input: abcd
                output: dcba
                input: Cybertek
                output: ketrebyC

 */