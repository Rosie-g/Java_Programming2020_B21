package day08_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        a = 30;
        System.out.println(a);

        String schoolName = "Cybertek";

        schoolName = "MIT";

        System.out.println(schoolName);

        int x = 100; // 100 - 62 = 38
            x -= 62; // x = x - 62; ==> 38

        double salary = 100000; // 0.28(total tax rate)
                salary -= (salary * 0.28);
                // salary -= 28000;
                // salary = salary - 28000
                // salary = 100000 - 28000 = 72000

        System.out.println(salary);

        int x2 = 999999;
            x2 -= 25;

        System.out.println(x2);


        double balance = 2000;
                balance -= 450; // balance = balance - 450

        System.out.println(balance);

        balance -= 1000;

        System.out.println(balance);

        // depositing

        balance += 5000;

        System.out.println(balance);

        int y2 = 400;
        y2 += 10000 * 0.1;
            // y2 += 1000
            // y2 = 1400

        System.out.println(y2);

        String name = "Cybertek";
            name += "School";
            // name = name + "Schpool"

        System.out.println(name);

        double totalTax = 100000;
                totalTax *=  0.28; // totalTax = 100000 * 0.28

        System.out.println(totalTax);

        int bonus = 5000;
            bonus *= 2; // bonus = 5000 * 2 = 10000

        System.out.println(bonus);


        int y3 = 10;
            y3 /= 5;

        System.out.println(y3);

        int house = 500000;
        int month = 240;

        double monthlyPayment = 500000;
            monthlyPayment /=month; // monthlyPayment = 5000 / 240

        System.out.println(monthlyPayment);

            // 100 / 3 ===> 33.33333 ===> 1
        int a2 = 100;
            a2 %= 3; // a2 = 100 % 3;

        System.out.println(a2);

    }

}
