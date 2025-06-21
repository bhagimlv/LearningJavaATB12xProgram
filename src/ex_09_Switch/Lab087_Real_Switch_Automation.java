package ex_09_Switch;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    // Web Automation-user input the browser so that automation starts in that browser

    public static void main(String[] args) {
        // String browser  = args[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser;

        if(scanner.hasNext()) {
            browser = scanner.next();
            browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome
            System.out.println("browser value "+browser);

            switch (browser) {
                case "chrome":
                    System.out.println("Starting the chrome");
                    System.out.println("........");
                    System.out.println("TC1");
                    System.out.println("TC2");
                    break;
                case "firefox":
                    System.out.println("Starting the firefox browser");
                    // Further code to start the Firefox
                    // Webdriver driver = new Firfox(); // Selenium Code
                    break;
                case "edge":
                    System.out.println("Execute the Edge Code");
                    break;
                default:
                    System.out.println("I have no idea which browser is this");
                    break;
            }
        }
        else
        {
            System.out.println("Non String values ");
        }
   }
}
