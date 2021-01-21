package day49_Abstraction.RemoteDriverTask;

public class TestCases {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.TakeScreenShot("pic");
        driver.close();

        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        fireFoxDriver.get("https://www.firefox.com");
        fireFoxDriver.TakeScreenShot("pic");
        fireFoxDriver.close();
    }
}
