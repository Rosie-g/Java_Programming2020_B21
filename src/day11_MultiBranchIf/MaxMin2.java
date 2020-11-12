package day11_MultiBranchIf;

public class MaxMin2 {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int max1 = 0;

        if(n1>n2 && n1>n3){
            max1 = n1;
        }else if(n2>n1 && n1>n3){
            max1 = n2;
        }else{
            max1 = n3;
        }
        System.out.println("Maximum number in If is: "+max1);

        int max2 = (n1>n2 && n1>n3) ? n1 : (n2>n1 && n1>n3)? n2 : n3;

        System.out.println("Maximum number in Ternaty is: "+max1);


        System.out.println("=======================================");

        int min1 = 0;

        if(n1<n2 && n1<n3){
            min1 = n1;
        }else if(n2<n1 && n2<n3){
            min1 = n2;
        }else{
            min1 = n3;
        }

        System.out.println("Min number in If is: "+min1);

        int min2 = (n1<n2 && n1<n3) ? n1 : (n2<n1 && n2<n3)? n2 : n3;

        System.out.println("Min number in Ternary is: "+min2);



    }
}
/*
3. write a program that can find the maximum number between three different numbers
            first solution: multi-branch if
            second solution: do not use any if statement
    4. write a program that can find the minimum number between three different numbers
            first solution: multi-branch if
            second solution: do not use any if statement

 */