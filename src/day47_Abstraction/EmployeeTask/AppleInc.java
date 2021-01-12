package day47_Abstraction.EmployeeTask;

import day45_Exceptions.PhoneTask.Device;

public class AppleInc {

    public static void main(String[] args) {

        Tester tester = new Tester("Ruzanna",26,'F', "ket123","SDET",100.000);
        tester.sleep();
        tester.work();
        tester.smokeTesting();

        Developer developer = new Developer("Emre",30,'M',"78543"," Java Developer",150.000);
        developer.work();
        developer.sleep();

        UberDriver uberDriver = new UberDriver("Mahmood",54,'M',"UBR123","Driver",75.000);
        uberDriver.work();
        uberDriver.sleep();

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(uberDriver);
    }
}
