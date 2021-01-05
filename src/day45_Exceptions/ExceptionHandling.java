package day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        //StringIndexoutofBound

        String str = "Cybertek";

        try {
            System.out.println(str.substring(200, 300));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Thread.sleep
        try {
            Thread.sleep(5000);
            System.out.println("Try Block");
        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }

        System.out.println("Test Completed");

    }
}
