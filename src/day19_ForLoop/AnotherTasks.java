package day19_ForLoop;

public class AnotherTasks {
    public static void main(String[] args) {

       int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum+=i;
            System.out.print(sum+" ");
        }


        System.out.println();
        System.out.println("================================");

        int even = 0;
        for (int i = 0; i <=100; i+=2) {

                even+=i;
                System.out.print(even+" ");
            }

        System.out.println();
        System.out.println("========================");

        int odd= 0;
        for (int i = 1; i <=100 ; i+=2) {
            odd+=i;
            System.out.print(odd+" ");
        }


    }
}
/*
4. write a program that can calculate the sum of all numbers between 1 to 100

6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100

 */