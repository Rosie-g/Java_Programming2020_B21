package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3, 4};
        //             0  1  3  4

        //                 0  1  2  3    0 1 2
        int[][] arr2D = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};
        //                      0

        // {8,9}
        System.out.println(arr2D[2]);
        System.out.println(Arrays.toString(arr2D[2]));

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("===============================");

        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

        System.out.println("=========================================");

        for (int[] each1DArray : arr2D) {
            for (int each1Element : each1DArray){
                if(each1Element%2!=0){
                    System.out.println(each1Element);
                }
            }
        }


    }
}