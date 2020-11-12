package day13_SwitchStatement;

public class SwitchStatement_Practice2 {

    public static void main(String[] args) {

        char letter = 'A';
        String result = "";

        switch (letter){

            case 'A':
                result = "A";
                break;

            case 'B':
                result = "B";
                break;

            case 'C':
                result = "C";
                break;

            case 'D':
                result = "D";
                break;

            case 'E':
                result = "E";

            default:
                result = "Invalid letter";
                break;


        }


        System.out.println(result);
    }
}
/*
§ Create a new switch statement using char instead of int.
§ Create a new char variable
§ Create a switch statement testing for A, B, C, D or E
§ Display a message if any of these are found and then break
§ Add a default which displays a message saying not found.
 */