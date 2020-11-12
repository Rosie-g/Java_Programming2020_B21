package day12_NestedIf;

public class AgeGroups4 {

    public static void main(String[] args) {

        int age = 678;
        String group = "";

        if(age>0&&age<150){
            if(age<21){
                group = "teenager";
            }else if(age>=21&&age<55){
                group = "Adult";
            }else{
                group = "Senior";
            }

        }else{
            group = "Invalid";
        }

        System.out.println(group);


    }
}
/*
 3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF

 */