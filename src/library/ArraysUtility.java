package library;

import java.util.Arrays;

public class ArraysUtility {

    /*
   returns the maximum number from an array of integer
    */
    public static int max(int[] arr) { // INTERVIEW
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    /*
    returns the minimum number from an array of integer
     */
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    /*
   Combines two arrays of integers and return the new array
    */
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3

        for (int each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of arr3
        }

        // i=2
        for (int each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of arr3
        }

       return arr3;
    }

    /*
     sorts the array of integers in descending order, and returns it as an array
     */
    public static int[] sort(int[] arr){ //{2,1,3}
        Arrays.sort(arr); // {1,2,3}

        int[] reversedArray = new int[arr.length]; // {0,0,0} ==> {3,2,1}

        for (int i = arr.length-1, j=0; i >=0 ; i--,j++) {
           reversedArray[j]= arr[i];
        }
        return reversedArray;

    }

    /*
    replaces the [] with {}  while printing the array
     */
    public static String printArray (int[] arr){
       String str =  Arrays.toString(arr);
       str.replace("[","{").replace("]","}");
       return str;
    }
}
