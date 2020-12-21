package day44_Inheritance.WebDriverTask;

public class Test {

    public static void main(String[] args) {

       // ChromeDriver driver = new ChromeDriver();
        FireFoxDriver driver = new FireFoxDriver();
        driver.get("apple.com");

        driver.maximize();

        driver.close();
    }
}
