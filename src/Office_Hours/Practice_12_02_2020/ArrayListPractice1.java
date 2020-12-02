package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        // int[6];-70

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        System.out.println(list1.isEmpty());// false

        int lastIndex = list1.size() - 1;//

        int n1 = list1.get(lastIndex);

        System.out.println(n1);

        list1.set(3, 400);

        System.out.println(list1);

        Integer[] arr2 = {100, 200, 300, 400, 500, 600};

        list1.addAll(Arrays.asList(arr2));

        System.out.println(list1);

        int[] arr3 = {1000, 2000, 3000, 4000};

        for (int each : arr3) list1.add(each);

        System.out.println(list1);

        System.out.println(list1.contains(10000));
        System.out.println(list1.indexOf(1000) >= 0);

        list1.clear();

        list1.addAll(Arrays.asList(-1,-2,-3,-4,-5));

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(-1,-2,-3,-4,-5));

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));// true

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(-1,-3,-4,-2,-5));

        System.out.println(list2.equals(list3));

        Collections.sort(list2);
        Collections.sort(list3);

        System.out.println(list2.equals(list3));



    }
}
