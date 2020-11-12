package day09_IfStatement;

public class OddEven {

    public static void main(String[] args) {

        int number = 201;

        boolean even = number%2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(number+" is even number");
        }

        if(odd){
            System.out.println(number+" is odd number");
        }


    }
}
