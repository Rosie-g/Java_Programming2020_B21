package day45_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_VS_TryCatch2 {

    public static void method1() throws  InterruptedException {

        Thread.sleep(1000);
    }

    public static void method2() throws  InterruptedException {
        method1();
    }

    public static void method3(){

        try {
            method2();
        }catch (InterruptedException e ){

        }
    }
    public static void Test(){
       // method1();
      //  method2();
        method3();
    }

}
