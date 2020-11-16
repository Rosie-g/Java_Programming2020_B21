package day30_ReturnMethods;

import library.StringUtility;

public class MethodCalls {

    public static void main(String[] args) {
        String str = "Level";

       String reversedName =  StringUtility.reverse(str);

        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaaaaaabbbbbbddddddeeeeee";

       String result2= StringUtility.removeDuplicates(str2);

        System.out.println(result2);

        String str3 = "aabcccdeee";

        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

    }
}
