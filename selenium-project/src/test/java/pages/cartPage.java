package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.utils;
import java.time.Duration;

public class cartPage extends utils{

    public By checkoutBtn = By.id("checkout");
    public By continueBtn = By.id("continue");
    public By finishBtn = By.id("finish");
    public By cancelBtn = By.id("cancel");
    public By removeBtn = By.id("remove-sauce-labs-backpack");
    public By firstNameField = By.id("first-name");
    public By lastNameField = By.id("last-name");
    public By zipCodeField = By.id("postal-code");


    public void clickCheckoutBtn() {utils.clickElement(checkoutBtn);}
    public void clickContinueBtn() {utils.clickElement(continueBtn);}
    public void clickFinishBtn() {utils.clickElement(finishBtn);}
    public void clickCancelBtn() {utils.clickElement(cancelBtn);}
    public void clickRemoveBtn() {utils.clickElement(removeBtn);}

    public void fillSomeFields(String FirstName, String LastName, String ZipCode) {
        utils.waitingElement(firstNameField, Duration.ofSeconds(10));
        utils.writeElement(firstNameField, FirstName);
        utils.waitingElement(lastNameField, Duration.ofSeconds(10));
        utils.writeElement(lastNameField, LastName);
        utils.waitingElement(zipCodeField, Duration.ofSeconds(10));
        utils.writeElement(zipCodeField, ZipCode);
    }



}
