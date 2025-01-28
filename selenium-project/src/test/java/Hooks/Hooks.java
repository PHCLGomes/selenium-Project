package Hooks;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks extends runner.runner{

    @Before
    public static void start () {
        driver = new ChromeDriver();
        System.out.println("Starting Cucumber na pasta Hooks");
    }

    @After
    public static void stop() {
        driver.quit();
        System.out.println("Stopping Cucumber Suite na pasta Hooks");
    }

}
