package day12_NestedIf;

public class BrowserName {

    public static void main(String[] args) {

        String name = "Cybertek";
        String browser = "";

        if(name=="chrome"|| name=="firefox" || name=="opera" || name=="safari" ){
            if(name=="opera"){
                browser = "Opera browser is selected";
            }else if(name=="firefox"){
                browser = "firefox browser is selected";
            }else if(name=="safari"){
                browser = "safari browser is selected";
            }else{
                browser = "chrome browser is selected";
            }


        }else{
            browser = "Invalid browser is selected";
        }

        System.out.println(browser);




    }
}
/*
4. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name

 */