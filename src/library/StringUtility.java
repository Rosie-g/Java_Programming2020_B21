package library;

public class StringUtility {

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;

    }

    public static String unique(String str) {
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);// each character of the string
            int count = frequency(str, each);//
            if (count == 1) {
                unique += each;
            }
        }

        return unique;
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public static String removeDuplicates(String str) {

        String result = ""; //

        for (String each : str.split("")) { // each: [a,a,b,c,c]
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
        /*        for (int i = 0; i <=str.length()-1 ; i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }

         */

    }
}
