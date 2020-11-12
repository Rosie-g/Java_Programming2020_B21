package day13_SwitchStatement;

public class DaysInMonth2 {

    public static void main(String[] args) {

        int year = 2020;
        int month = 2;

        boolean has30days = month==4 || month==6 || month==9 || month==11;
        boolean has28Or29Days = month==2;
          // boolean has31Days = !has28Or29Days || !has30days;

        String result = ""; // 1 ~ 12

        if(month>=1&&month<=12){ // (month>0&&month<13) // if the month is valid
            if(has28Or29Days){
                if(year%4 == 0){
                    result = "29 days"; // leap year
                }else{ // not leap year
                    result = "28 days";
                }
            }else if(has30days){ // for April, June, September, November
                result = "30 days";
            }else{ // for January, March, May, August, October, December
                result = "31 days";
            }


        }else{ // if the month is invalid
            result = "Invalid month";
        }

        System.out.println(result);






    }
}
