package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

 /*double salary = 100000, stateTaxRate = 0.08, federalTaxRate = 0.21,
                stateTax = salary * stateTaxRate, federalTax = salary * federalTaxRate,
                totalTax = stateTax + federalTax, salaryAfterTax = salary - totalTax;

         */

        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;

        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $ "+salary);
        System.out.println("Your State Tax: $ "+stateTax);
        System.out.println("Your federal Tax: $ "+federalTax);
        System.out.println("Your total tax: $ "+totalTax);
        System.out.println("Your salary after tax: $ "+salaryAfterTax);

        }



    }



/*
Task01: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21

    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */