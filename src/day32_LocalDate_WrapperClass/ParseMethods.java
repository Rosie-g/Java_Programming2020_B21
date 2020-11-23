package day32_LocalDate_WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ParseMethods {

    public static void main(String[] args) {

        String data1 = "123";

        System.out.println(data1 + 3);//1233

        int num1 = Integer.parseInt(data1);
        //          primitive = primitive

        Integer num2 = Integer.parseInt(data1);
        // wrapper <=== primitive

        System.out.println(num1 + 3);

        String s1 = "Hello";

        // int num3 = Integer.parseInt(s1);
        // System.out.println(num3);

        String s2 = "2.5";

        double d1 = Double.parseDouble(s2); // none
        System.out.println(d1);
        // primitive <=== primitive

        Double d2 = Double.parseDouble(s2); // autoboxing
        // Wrapper <=== primitive

        System.out.println(d1 + 1);

        String s3 = "Maybe";
        boolean r1 = Boolean.parseBoolean(s3); // none
        Boolean r2 = Boolean.parseBoolean(s3);  // auto boxing

        System.out.println(r1); // default value of boolean is false

        String s4 = "FaLse";

        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3);  // not case sensitive



    }
}
