package day44_Inheritance.WebDriverTask;

public class FireFoxDriver extends WebDriver {


    public FireFoxDriver() {
        super("FireFox Driver", "v83.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from FireFox Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing firefox driver");
    }
}
