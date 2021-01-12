package day47_Abstraction.EmployeeTask;

public abstract class Employee extends Person {

    public String ID, jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
