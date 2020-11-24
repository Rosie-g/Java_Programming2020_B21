package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum: " + sum);

        System.out.println("==================================");

        String password = "Password#7";
        String upperLetters = "";
        String lowerCase = "";
        String digits = "";
        String specialChar = "";

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperLetters += each;
            } else if (Character.isLowerCase(each)) {
                lowerCase += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChar += each;
            }
        }

        System.out.println("UpperLetters: " + upperLetters);
        System.out.println("LowerLetters: " + lowerCase);
        System.out.println("Digits: " + digits);
        System.out.println("specialChar: " + specialChar);

        boolean isValid = password.length() >= 8 && upperLetters.length() > 0 && lowerCase.length() > 0
                && digits.length() > 0 && specialChar.length() > 0;

        System.out.println(isValid);


    }
}
/*
write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)

 */