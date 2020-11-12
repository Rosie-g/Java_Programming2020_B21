package day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {

        String str = "aaabbc";
        // str=str.replace(" ","") --> if we need to ignore the spaces

        String expectedResult = ""; // a3b2c1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // 'a'
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            if (!expectedResult.contains("" + ch)) {
                expectedResult += "" + ch + count;
            }

        }


        System.out.println(expectedResult);

    }
}
