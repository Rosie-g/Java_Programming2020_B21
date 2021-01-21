package day49_Abstraction.RemoteDriverTask;

public class FireFoxDriver extends RemoteDriver {

    @Override
    public void executeScript(String script) {
        System.out.println("Script " + script + " is executed on Firefox");
    }

    @Override
    public void TakeScreenShot(String name) {

    }

    @Override
    public void get(String URL) {

    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }
}
