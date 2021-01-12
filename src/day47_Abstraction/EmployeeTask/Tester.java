package day47_Abstraction.EmployeeTask;

public final class Tester extends Employee {


    public Tester(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println("Testing the application");
    }

    @Override
    public void work() {
        System.out.println("Testers usually sleep 7 hours");
    }

    public void smokeTesting(){
        System.out.println("Smoke testing");
    }
}
