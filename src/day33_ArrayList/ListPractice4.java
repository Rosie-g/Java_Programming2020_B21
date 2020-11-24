package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        int n1 = list.indexOf(10);  // 0
        int n2 = list.lastIndexOf(10); //5
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(  !list.contains(60) );

        System.out.println(  list.contains(40));

        System.out.println("===================================================");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>(); // [A, B, C]

        for(char each :characters ){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }

        /*
          for(int i = 0; i <= characters.size()-1; i++ ){
            if(!nonDup.contains(characters.get(i))){
                nonDup.add(characters.get(i));
            }
        }
         */

        System.out.println(nonDup);





    }
}
