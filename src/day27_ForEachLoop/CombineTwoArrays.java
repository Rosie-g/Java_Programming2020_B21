package day27_ForEachLoop;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length+arr2.length];
        int j =0; // represents the index num of 3rd array

        for(int each :arr1){ // each: 1 2 3 4
            arr3[j++]=each;
            /*
            arr[0]=1

             */
        }

        for (int each:arr2){ // 5 6 7
            arr3[j++]=each;
        }

        System.out.println(Arrays.toString(arr3));

    }
}
/*
write a program that can combine two int arrays and then create the third array
            arr1 = {1,2,3,4};
            arr2 ={5,6,7};
            output:
                arr3 = {1,2,3,4,5,6,7}

 */