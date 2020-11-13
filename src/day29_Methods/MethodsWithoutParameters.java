package day29_Methods;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Ruzanna");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        MethodsWithoutParameters2.printEvenNumbersTo100();
        System.out.println();
        MethodsWithoutParameters2.printOddNumbersTo100();

    }

    // AccessModifier  specifier   returnTYPE   MethodName (Parameter)
    public static void printHello5Times(){

        for (int i = 1; i < 6 ; i++) {
            System.out.println("Hello");
        }
    }

}
/*
step1: print hello 5 times  (for loop)
        step2: print your name
        step3: print hello 5 times  (for loop)
        step4: print your school name
        step5: print hello 5 times   (for loop)
Collapse
 */