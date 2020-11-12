package day12_NestedIf;

public class Numbers {

    public static void main(String[] args) {

        int number = 20;
        String name = "";

        if(number >= 0 && number <= 9){
            if(number==0){
                name = "zero";
            }else if(number==1){
                name = "one";
            }else if(number==2){
                name = "two";
            }else if(number==3){
                name = "three";
            }else if(number==4){
                name = "four";
            }else if(number==5){
                name = "five";
            }else if(number==6){
                name = "six";
            }else if(number==7){
                name = "seven";
            }else if(number==8){
                name = "eight";
            }else{
                name = "nine";
            }

        }else{
            name = "Invalid";
        }

        System.out.println(name);

    }
}


/*
1. write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
            Note: MUST USE NESTED IF

 */