package day43_Inheritance.restaurantTask;

import day43_Inheritance.personTask.Employee;

public class Chef extends Employee { // Chef is An Employee, Chef IS A Person

    /*
    inherited:
        variables: name, age, gender, hourlyRate, jobTitle, ID
        methods: work,setInfo, setInfo, toString, eat, sleep, calcSalary
     */

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void makeOrder() {
        System.out.println(jobTitle + name + " is making order");
    }

    public void cook() {
        System.out.println(jobTitle + name + " is cooking");
    }
}
