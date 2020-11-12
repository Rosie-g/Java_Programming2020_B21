package day10_IfElseStatement;

public class MinimumNumber {

    public static void main(String[] args) {

        int n1 = 200;
        int n2 = 100;
        int n3 = 300;

        boolean n3IsMin = n3 < n1 && n3 < n2;// if n3 less then both n1 and n2, it means n3 is the min
        boolean n2IsMin = n2 < n1 && n2 < n3;//
        // !n3IsMin && n2 < n1 == if n3 is not the max number and n2 is less then n1
        boolean n1IsMin = n1 < n2 && n1 < n3;
        // !n2IsMin && n3IsMin == if n2 is not min and n3 is not min either

        String str = " is minimum number";
        int min = 0;


        if (n3IsMin) {
            // System.out.println(n3 + str);
            min = n3;// we are not just finding the minimum number, but also making to be reusable
        }

        if (n2IsMin) {
            // System.out.println(n2 + str);
            min = n2;
        }

        if(n1IsMin){
            // System.out.println(n1+str);
            min = n1;
        }

        System.out.println(min+str);
    }
}
