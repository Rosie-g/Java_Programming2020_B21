package day49_Abstraction.RemoteDriverTask;

public class ChromeDriver extends RemoteDriver {


    @Override
    public void executeScript(String script) {
        System.out.println("Script " + script + " is executed on Chrome");
    }

    @Override
    public void TakeScreenShot(String name) {
        System.out.println("Taking Screenshot on chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to"+ URL+ "on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser");
    }

    @Override
    public void quit() {
        System.out.println("Quiting Chrome browser");
    }
}
