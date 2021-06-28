package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.Locale;

public class Parent {

    static WebDriverWait wait;

    public Parent() {
        wait = new WebDriverWait(BaseDriver.getDriver(), 15);
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public static void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waiting(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase(Locale.ROOT).contains(msg.toLowerCase()));
    }

    public void selectedAndClick(WebElement elementName, String value) {
        waitUntilClickable(elementName);
        Select slc = new Select(elementName);
        slc.selectByValue(value);
    }


    public void verifyContainsAttribute(WebElement element, String msg) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getAttribute("validationMessage").toLowerCase(Locale.ROOT).contains(msg.toLowerCase(Locale.ROOT)));
    }

    public void javaScriptExecutorClick(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].click()", element);
    }
}
