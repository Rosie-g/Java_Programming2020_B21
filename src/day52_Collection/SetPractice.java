package day52_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();

        names1.addAll(Arrays.asList("Daniel", "Ruslan", "Adnan", "Serhil", "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names1);

        Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Daniel", "Ruslan", "Adnan", "Serhil", "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names2);


        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Daniel", "Ruslan", "Adnan", "Serhil", "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names3);

        String str = "ggggggggaaaaaaaabbbbbbbcccccc"; // gabc

        String result = "";
       /* for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result+=s;
        }
        System.out.println(result);
*/

        //  String[] arr = str.split("");
        //  System.out.println(Arrays.toString(arr));
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(str.split("")));

        for (String each : hs) {
            result += each;
        }

        System.out.println(result);

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println("============================================");

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.addAll(Arrays.asList(null, null, null, null, null, null));

        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null, null, null, null, null, null));

        System.out.println(linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();

//        treeSet.addAll(Arrays.asList(null, null, null, null, null, null));
//        System.out.println(treeSet);
//
//        String str4 = null;
//
//        System.out.println(str4.equals("Muhtar"));


        System.out.println("========================================");
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int max = Collections.max(numbers);
        System.out.println(max);

        int min = Collections.min(numbers);
        System.out.println(min);


    }
}
