package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends Parent{

    public loginPage() {

        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(id = "signin_button")
    private WebElement signInButton;

    @FindBy(id = "user_login")
    private WebElement login;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(css = "[name='submit']")
    private WebElement loginButton;

    @FindBy(id = "details-button")
            private WebElement warningButton;

    @FindBy(id = "proceed-link")
            private WebElement warningLink;

    WebElement myElement;

    public void findAndClick(String elementName) {
        switch (elementName) {
            case "signInButton":
                myElement = signInButton;
                break;

            case "loginButton":
                myElement = loginButton;
                break;

            case "warningButton":
                myElement = warningButton;
                break;

            case "warningLink":
                myElement = warningLink;
                break;

        }

        clickFunction(myElement);
    }


    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "login":
                myElement = login;
                break;

            case "password":
                myElement = password;
                break;
        }

        sendKeysFunction(myElement, value);
    }


}
