package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args)  {

        try {
            System.out.println(25/0);
        }catch (NoSuchElementException e){
            System.out.println("No such element Exception");
        }catch (ClassCastException e ){
            System.out.println("Class Cast Exeption");
        }catch (ArithmeticException e ){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e ){
            System.out.println("Runtime exception");
        }


        System.out.println("----------------------------------------------");


//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String[] names = {"Walid","Agalar","Ayjeren"};

        try {
            names[10] = "Muhtar";
        }catch (IllegalArgumentException e ){
            System.out.println("Illegal Argument exception");
        }catch (NoSuchElementException e ){
            System.out.println("No such element exception");
        }catch (StringIndexOutOfBoundsException e ) {
            System.out.println("String Index Out Of Bounds Exception");
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array Index Out Of Bounds Exception");
        }catch (IndexOutOfBoundsException e ){
            System.out.println("Index Out Of Bounds Exception");
        }catch (RuntimeException e ){
            System.out.println("Runtime Exception");
        }

    }
}
