package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int[] scores = new int[5];

        scores[1] = 10;
        scores[2] = 20;
        scores[0] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(Arrays.toString(scores));

        //print 50

        System.out.println(scores[0]);

        System.out.println("============================================");

                      //   i < 5; i <= 4(i <= scores.length-1)
        for (int i = 0; i < scores.length; i++) { // i: 0,1,2,3,4
            System.out.println(scores[i]);
        }

        System.out.println("============================================");


        for (int each : scores ){ // each: element
            System.out.println(each);
        }


    }
}
