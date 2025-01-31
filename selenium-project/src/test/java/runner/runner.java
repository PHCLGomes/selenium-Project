package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


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










