package day47_Abstraction.EmployeeTask;

public final class UberDriver extends Employee {


    public UberDriver(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Drives");
    }

    @Override
    public void sleep() {
        System.out.println("Uber drivers usually sleep 9 hours");
    }
}
