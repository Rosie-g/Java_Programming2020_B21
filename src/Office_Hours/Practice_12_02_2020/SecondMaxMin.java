package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10));

        list.removeAll(Arrays.asList(Collections.max(list), Collections.min(list))); // removes all the maximum number(s)

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        System.out.println(secondMax);
        System.out.println(secondMin);

        /*
        summary:
                to find the secondMax number:
                    first remove all the first maximum number
                    the next maximum number is the second max number
         */


    }
}
