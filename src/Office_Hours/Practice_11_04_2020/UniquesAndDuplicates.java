package Office_Hours.Practice_11_04_2020;

import java.util.Scanner;

public class UniquesAndDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();
        String unique = "";
        String duplicates = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) { // frequency of ch
                    frequency++;
                }

            }
            if (frequency == 1) { //if frequency is 1, it means ch is unique
                unique += ch;
            }
            if(frequency>1&&!duplicates.contains(""+ch)){ // if frequency is more than 1, it means the ch is duplicated
                duplicates+=ch;
            }

        }


        System.out.println(unique);
        System.out.println(duplicates);
    }
}