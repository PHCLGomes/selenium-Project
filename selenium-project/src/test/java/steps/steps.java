package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.loginPage;
import pages.homePage;
import pages.inventoryItemPage;
import pages.cartPage;
import support.utils;


public class steps extends runner.runner {

    homePage homePage = new homePage();
    loginPage loginPage = new loginPage();
    inventoryItemPage inventoryItemPage = new inventoryItemPage();
    cartPage cartPage = new cartPage();

    @Given("user is logged in site")
    public void user_is_logged_in_site () {
        loginPage.goToSite();
        loginPage.login("standard_user", "secret_sauce");
    }

    @And("select the product {string}")
    public void selectTheProduct(String productName) {
        homePage.selectProduct(productName);
    }


    @And("click on the button {string}")
    public void clickOnTheButton(String buttonName) {
        switch (buttonName) {
            case "Add to cart":
                inventoryItemPage.clickAddToCartBtn();
                break;

            case "Shooping Cart":
                homePage.click_shopping_cart();
                break;

            case "Checkout":
                cartPage.clickCheckoutBtn();
                break;

            case "Continue":
                cartPage.clickContinueBtn();
                break;

            case "Cancel":
                cartPage.clickCancelBtn();
                break;

            case "Finish":
                cartPage.clickFinishBtn();
                break;

            case "Remove":
                cartPage.clickRemoveBtn();
                break;
        }
    }

    @When("fill in the fields First name, Last Name and ZIP")
    public void fillInTheFieldsFirstNameLastNameAndZIP() {
            cartPage.fillSomeFields("Automation","Test","3000");
            clickOnTheButton("Continue");
    }

    @Then("must see the message {string}")
    public void shouldSeeTheMessage(String arg0) {
        utils.waitingMessage(By.xpath("//*[@class=\"complete-header\"]"),"Thank you for your order!");
    }

    @Then("The item removed did not show on the cart")
    public void theItemRemovedDidNotShowOnTheCart() {
        utils.ElementIsNotVisible(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]"));
    }

    @Then("must return to products page")
    public void mustReturnToProductsPage() {
        utils.AssertUrl("inventory");
        //utils.ElementIsVisible(By.xpath("//*[@class='title'][text()='Products']"));,

    }
}
