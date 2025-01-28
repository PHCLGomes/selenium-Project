package runner;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Cancel_flow",
        plugin = "pretty",
        features = "src/test/resources/features",
        glue = {"steps","Hooks"}
)
public class runner
{
    public static WebDriver driver;
}










