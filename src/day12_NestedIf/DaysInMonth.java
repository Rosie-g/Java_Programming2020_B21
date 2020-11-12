package day12_NestedIf;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 4;
        String days = "";

        if(month>=1&&month<=12){
            if(month==2){
                days = "has 29 days";
            }else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                days = "has 31 days";
            }else{
                days = "has 30 days";
            }

        }else{
            days = "It's invalid";
        }

        System.out.println(days);

    }

}
/*
2. write a program that can find the number of days in a month
            Note: MUST USE NESTED IF

 */