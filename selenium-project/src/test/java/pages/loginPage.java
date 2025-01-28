package pages;
import org.openqa.selenium.By;
import support.utils;
import java.time.Duration;


public class loginPage extends utils {

    public By titleLogo = By.xpath("//*[@class='login_logo']");
    public By usernameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By LoginBtn = By.id("login-button");


    public void goToSite() {
        driver.get("https://www.saucedemo.com/");
        utils.waitingElement(titleLogo, Duration.ofSeconds(10));
    }


    public void login(String username, String password) {
        utils.writeElement(usernameField, username);
        utils.writeElement(passwordField, password);
        utils.clickElement(LoginBtn);
        //utils.waitingElement(titleLogo, Duration.ofSeconds(10));
    }
}