package day29_Methods;

public class MethodsWithoutParameters2 {

    public static void main(String[] args) {

        printOddNumbersTo100();
        printEvenNumbersTo100();


    }

    public static void printOddNumbersTo100(){

        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void printEvenNumbersTo100(){

        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
