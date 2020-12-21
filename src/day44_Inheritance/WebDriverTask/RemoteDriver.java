package day44_Inheritance.WebDriverTask;

public class RemoteDriver {

    public String name, version;

    public RemoteDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("Opening the Remote Driver");
    }

    public void close(){
        System.out.println("Closing th Remote Driver");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
1. create a class called RemoveWebDriver
            name, version
            add a constructor to set the instances
            get(URL), maximize(),close()
    2. create a sub class called ChromeDriver
            name = "Chrome Browser"
            version
            get(): Opening URL with Chrome driver
            close(): closing chrome driver
    3. FireFoxDriver
    4. SalariDriver
    5. OperaDriver
    6. EdgeDriver

 */