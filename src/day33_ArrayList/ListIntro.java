package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(100); // autoboxing  0
        scores.add(90); // autoboxing  1
        scores.add(80); //            2

        scores.add(2,400);

        System.out.println(scores.toString());

        System.out.println("======================================================");

        ArrayList<String> groceryList = new ArrayList<>(); // [Egg,Water,Milk,Bread]
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add(0,"Toilet Paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1,"Mask");

        System.out.println(groceryList);

        String item1 =  groceryList.get(2);

        System.out.println("item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("item2 = " + item2);

        //   System.out.println( groceryList.get(100)  );

        int total = groceryList.size();
        System.out.println("total = " + total);

        System.out.println( groceryList.get(  groceryList.size()-1  ) );


    }
}
