package day14_Switch_Recap;

public class DaysInMonth {

    public static void main(String[] args) {

        int year = 2020;
        String  month = "Okj";
        String daysInMonth = "";

        switch (month){

            case "Jan":
                 daysInMonth = "31 days";
                break;

            case "Feb":
                daysInMonth = (year%4==0)? "29 days" : "28 days";
                break;


            case "Mar":
                daysInMonth = "31 days";
                break;

            case "Apr":
                daysInMonth = "30 days";
                break;

            case "May":
                daysInMonth = "31 days";
                break;

            case "Jun":
                daysInMonth = "30 days";
                break;

            case "Jul":
                daysInMonth = "31 days";
                break;

            case "Aug":
                daysInMonth = "31 days";
                break;

            case "Sep":
                daysInMonth = "30 days";
                break;

            case "Oct":
                daysInMonth = "31 days";
                break;

            case "Nov":
                daysInMonth = "30 days";
                break;

            case "Dec":
                daysInMonth = "31 days";
                break;

            default:
                daysInMonth = "Invalid";

        }

        System.out.println(daysInMonth);

    }
}
/*
1. use switch statement to write a program that can return the number of days based on the name of the month
    Ex:
        year = 2020;
        month = Mar;
        output:
            30 days
        year = 2020;
        month = Feb;
        output:
            29  days
 */