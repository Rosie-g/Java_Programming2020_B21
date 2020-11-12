package day21_WhileLoops;

public class SubStringMethods {

    public static void main(String[] args) {

        String email = "Alexander_Tsegaye@Apple.com";
        //              012345
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0, indexOf_);
        String firstName = email.substring(indexOf_ + 1, indexOfAt);
        String domain = email.substring(indexOfAt + 1, email.lastIndexOf("."));

        String fullName = firstName + " " + lastName;

        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(fullName);
        System.out.println(domain);


    }
}
/*
lastName_firstName@companyName.com
 */