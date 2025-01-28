package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.utils;
import java.time.Duration;


public class homePage extends utils{

    public By titleLogo = By.xpath("//*[@class='login_logo']");
    public By usernameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By loginBtn = By.id("login-button");
    public By shoppingCartBtn = By.id("shopping_cart_container");

    public void goToSite() {
        driver.get("https://www.saucedemo.com/");
        utils.waitingElement(titleLogo, Duration.ofSeconds(10));
    }

    public void login(String username, String password) {
        utils.writeElement(usernameField, username);
        utils.writeElement(passwordField, password);
        utils.clickElement(loginBtn);
        utils.waitingElement(titleLogo, Duration.ofSeconds(10));
    }

    public void selectProduct(String productName) {
        utils.clickElement(By.xpath("//*[@class='inventory_item_name '][text()='"+productName+"']"));
    }

    public void click_shopping_cart() {utils.clickElement(shoppingCartBtn);}

}

