package day36_CustomClass;

import sun.net.sdp.SdpProvider;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica { // Bank of America HAS An Employee

    public static void main(String[] args) {

        String companyName = "Bank of America";
        Employee[] employees = {
                new Employee(), // 0
                new Employee(), // 1
                new Employee(), // 2
                new Employee(), // 3
                new Employee()};


        employees[0].setInfo("Angelina Jolie", 'F', "Developer", companyName, 400_000, "0001", LocalDate.of(2018, 4, 15));
        employees[1].setInfo("Brad Pitt", 'M', "Scrum Master", companyName, 140_000, "0003", LocalDate.of(2016, 9, 14));
        employees[2].setInfo("Obi-Wan Kenobi", 'M', "BA", companyName, 164000, "3-CPO", LocalDate.of(2010, 2, 14));
        employees[3].setInfo("Ercan Civi", 'M', "SDET", companyName, 164000.50, "ABC123", LocalDate.of(2000, 2, 14));
        employees[4].setInfo("John Snow", 'M', "CEO", companyName, 240_000, "0004", LocalDate.of(2006, 2, 18));

        for (Employee each : employees)
            each.getInfo();


        System.out.println("=========================================================================");

        ArrayList<Employee> SDEtsAndDev = new ArrayList<>(Arrays.asList(employees));

        SDEtsAndDev.removeIf(p -> !(p.jobTitle.equalsIgnoreCase("sdet") || p.jobTitle.equalsIgnoreCase("developer")));
        // removes the employees IF job title of the employee in not SDET or not Developer

        for (Employee each : SDEtsAndDev)
            System.out.println(each.name + " : " + each.jobTitle + ", $" + each.salary);


        System.out.println("=========================================================================");


        ArrayList<Employee> richPeople = new ArrayList<>(Arrays.asList(employees));
        // richPeople.addAll(Arrays.asList(employees));

        richPeople.removeIf(p -> p.salary < 200000); // remove th eployee if the employee salary is less than 200000

        System.out.println("=========================================================================");


        double maxSalary = employees[0].salary;
        String name = "";
        for (Employee each : employees) {
            // maxSalary=Math.max(maxSalary,each.salary);
            if (each.salary > maxSalary) { // if any employee has more salary
                maxSalary = each.salary;
                name = each.name;
            }

        }
        System.out.println(name+" : "+maxSalary);

    }


}
/*

 */