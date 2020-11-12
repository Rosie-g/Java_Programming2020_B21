package day19_ForLoop;

public class Task2 {
    public static void main(String[] args) {

/*
 print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */

        String star = "* * * * * *";
        for (int i = 1; i <=8 ; i++) {
            System.out.println(star);
        }

        /*
        3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
    Hint: in the loop body , only place the statements that you need to repeat
         */

        System.out.println("=================================");

        System.out.println("* * * * * *");
       String star2 = "*         *";
        for (int i = 1; i <=10 ; i++) {

            System.out.println(star2);

        }
        System.out.println("* * * * * *");

    }
}
