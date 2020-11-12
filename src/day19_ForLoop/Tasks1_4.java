package day19_ForLoop;

public class Tasks1_4 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}

/*
1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
4. Write a program that will print out all letters in English alphabet in backwards

 */