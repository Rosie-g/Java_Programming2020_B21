package day05_Concatenation;

public class PersonalInfo_Concatenation {

    public static void main(String[] args) {

        String firstName = "Ruzanna";
        String lastName = "Gazarian";
        String fullName = firstName+" "+lastName;
        int age = 25;
        char gender = 'F';
        long phoneNumber = 4244306727l;
        int SSN = 12345678;

        System.out.println("Full name is: "+fullName);
        System.out.println("Age is: "+age);
        System.out.println("Gender is: "+gender);
        System.out.println("Phone Number is: "+phoneNumber);
        System.out.println("SSN is: "+SSN);




    }

}
/*  Task : PersonalInfo
            variables : firstName, lastName, fullName, age, gender, phoneNumber, SSN
            output: Full name is: YourFullName
                    Age is: YourAge years old
                    Gender is: YourGender
                    Phone Number is: YourPhoneNumber
                    SSN is: YourSSN
               please use concatenation, do not use more than 5 print statements
         */