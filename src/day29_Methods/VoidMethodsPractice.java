package day29_Methods;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class VoidMethodsPractice {

    public static void main(String[] args) {

        int[] a1 = {100, -200, 300, 50, 40, 59, 700, 0, 1, 2};

        arrayMaxNumber(a1);
        arrayMinNumber(a1);

        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 800, 9, 0, 1, 12, 13, 4};
        arrayMaxNumber(a2);
        arrayMinNumber(a2);

        int[] arr3 = {1,1,2,3,3,4,5,5,5,5,6,6,6,7};
        arrayUniqueElements(arr3);

        int[] arr4 = {10,10,8,11,11,11,9};
        arrayUniqueElements(arr4);
    }

    public static void arrayMaxNumber(int[] arr) {
       /* Arrays.sort(arr);
        System.out.println("Maximum number: " + arr[arr.length - 1]);*/
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println("Maximum number: " + max);
    }


    public static void arrayMinNumber(int[] arr) {

        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Minimum number: " + min);
    }

    public static void arrayUniqueElements(int[] arr){

        for(int each:arr) {
            int count = 0;
            for(int each2:arr){
                if(each==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.print(each+" ");
            }
        }
        System.out.println();
    }
}



/*
 1. create a function that can print out the maximum number from any given integer array
 2. create a function that can print out the minimum number from any given integer array
 3. create a function that can print the unique elements from the array
 */