package Office_Hours.Practice_02_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        String[] words = {"Level", "Anna", "Java", "C#", "Phyton", "Nalan", "Level", "Anna", "Racecar","Java","Java"};

        List<String> list = new ArrayList<>(Arrays.asList(words));


        System.out.println("list = " + list);

        // Palindrome: after u reverse the word it id the same

        Iterator<String> it = list.iterator();


        while (it.hasNext()) {
            String each = it.next(); // represents each object in the list

            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reversed)) { // to check if the String in list is palindrome
                it.remove();
            }
        }

        System.out.println(list);

        System.out.println("==========================================================");

        List<String> list2 = new ArrayList<>(Arrays.asList(words));
        System.out.println("list2 = " + list2);

        List<String> nonPalindrome = new ArrayList<>();
        for (String each : list2) {

            String reversed = "";
            for (int i = each.length()-1; i >=0; i--) {
                reversed+=each.charAt(i);

            }
            if (reversed.equalsIgnoreCase(each)){
                continue;
            }
            nonPalindrome.add(each);

        }
        System.out.println("nonPalindrome = " + nonPalindrome);

    }


}
