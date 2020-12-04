package day37_CustomClass;

import java.util.ArrayList;

public class BankOfAmerica {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Ayse", "Bank of America", "QA", "ABC123", "Female", 45,55 );

        System.out.println(employee1);

        double totalTax = employee1.calculateTax(0.05, 0.22);

        System.out.println("Total Tax: " + totalTax);

        System.out.println("Salary After Tax: " + (employee1.salary - totalTax));

    }
}
