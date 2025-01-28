package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.utils;
import java.time.Duration;


public class inventoryItemPage extends utils{

    public By addToCartBtn = By.id("add-to-cart");

    public void clickAddToCartBtn() {
        utils.clickElement(addToCartBtn);
    }
}
