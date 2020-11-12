package day12_NestedIf;

public class AgeGroup3 {

    public static void main(String[] args) {

        int age = 99;
        // with ternary

        String ageGroup = (age >= 1 && age <= 2)? "Infant" :(age <= 5)? "Toddler" :(age <= 9)? "Kid"
                :(age <= 12)? "Pre-Teen" :(age <= 17)? "Teenager" :(age <= 20)? "Young Adult"
                :(age <= 39)? "Adult" :(age <= 49)? "Young Middle-Aged Adult"
                :(age <= 54)? "Middle Aged Adult" :(age <= 64)? "Very Young Senior Citizen"
                :(age <= 74)? "Young Senior Citizen" :(age <= 84)? "Senior Citizen" : "Old Senior Citizen";

        System.out.println(ageGroup);


    }
}
