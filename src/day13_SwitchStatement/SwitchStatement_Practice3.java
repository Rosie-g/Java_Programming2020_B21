package day13_SwitchStatement;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        String browser = "cybertek";

        String selectedBrowser = "";

        switch (browser){

            case "chrome":
                selectedBrowser = "CHROME BROWSER";
                break;

            case "firefox":
                selectedBrowser = "FIREFOX BROWSER";
                break;

            case "opera":
                selectedBrowser = "OPERA BROWSER";
                break;

            case "safari":
                selectedBrowser = "SAFARI BROWSER";
                break;

            case "edge":
                selectedBrowser = "EDGE BROWSER";
                break;

            case "ie":
                selectedBrowser = "INTERNET EXPLORER BROWSER";
                break;

            case"cybertek":
                selectedBrowser = "CYBERTEK BROWSER";
                        break;

            default:
                selectedBrowser = "Invalid browser";

        }


        System.out.println(selectedBrowser);
    }
}
