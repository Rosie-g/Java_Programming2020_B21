package day43_Inheritance.PersonTask;


public class AppleInc {

    public static void main(String[] args) { // AppleInc HAS A Tester

        Tester tester1 = new Tester("Necdet",24,'M', 45, "Senior Tester", "A124");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary "+tester1.calcSalary());
        tester1.testing();

        System.out.println(tester1);

        Developer developer1 = new Developer("Mini",26,'F',50,"Developer","B123");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println("Salary: "+developer1.calcSalary());
        System.out.println(developer1);
    }
}
