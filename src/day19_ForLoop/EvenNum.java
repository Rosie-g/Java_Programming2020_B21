package day19_ForLoop;

public class EvenNum {

    public static void main(String[] args) {


        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0 && j % 3 == 0 && j % 5 == 0) {
                System.out.print(j + " ");
            }
        }

    }
}
//  write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5