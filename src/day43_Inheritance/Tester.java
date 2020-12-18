package day43_Inheritance;

public class Tester extends Employee {
   /*
    inherited:
        variables: name, age, gender,hourlyRate
        methods: work, setInfo, toString, eat, sleep
     */

    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void testing() {
        System.out.println(jobTitle + name + " is testing");
    }
}
/*
 name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */