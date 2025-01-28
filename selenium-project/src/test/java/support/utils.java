package support;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Locale;
import java.util.Random;
import static Hooks.Hooks.driver;


public class utils extends runner.runner {

    Faker Faker = new Faker(new Locale("pt-BR"));

    public static void waitingElement(By element, Duration timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            Assert.assertTrue("element founded" + element.toString(), true);
        } catch (Exception e) {
            Assert.fail("Element not found: " + element);
        }
    }

    public static void waitingMessage(By element, String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(element, message));
            Assert.assertTrue("message founded by " + element.toString(), true);
        } catch (Exception e) {
            Assert.fail("Message not found: " + message);
        }
    }

    public static void clickElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Assert.assertTrue("Element founded by " + element.toString(), true);
            driver.findElement(element).click();
        } catch (Exception e) {
            Assert.fail("Element not found: " + element);
        }
    }

    public static void writeElement(By element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Assert.assertTrue("Element founded by " + element.toString(), true);
            driver.findElement(element).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Element not found: " + element);
        }
    }

    public static void ElementIsNotVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(element)));
            Assert.assertTrue("Element not found by " + element.toString(), true);
        }catch (Exception e) {
            Assert.fail("Element found: " + element);
        }
    }

    public static void ElementIsVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
            Assert.assertTrue("Element is visible by " + element.toString(), true);
        }catch (Exception e) {
            Assert.fail("Element is not visible: " + element);
        }
    }

    public static void AssertUrl(String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.urlContains(""+url+""));
            Assert.assertTrue("Url founded", true);
        }catch (Exception e) {
            Assert.fail("Url not found: " + e);
        }

    }
}

