package StepDefinitions;

import Pages.loginPage;
import Utilities.baseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginSteps {

    loginPage lp=new loginPage();
    @Given("^Navigate to website$")
    public void navigateToWebsite()
    {
        WebDriver driver= baseDriver.getDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();
    }

    @And("^Click to Sign in button$")
    public void clickToSignInButton()
    {
        lp.findAndClick("signInButton");
    }

    @And("^Enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterUsernameAsAndPasswordAs(String login1, String password1)
    {
        lp.findAndSend("login",login1);
        lp.findAndSend("password",password1);
    }

    @When("^click login button$")
    public void clickLoginButton()
    {
        lp.findAndClick("loginButton");
        lp.findAndClick("warningButton");
        lp.findAndClick("warningLink");
    }

    @Then("^Verify that you are logged in\\.$")
    public void verifyThatYouAreLoggedIn()
    {
        String expected="http://zero.webappsecurity.com/bank/account-summary.html";
        String actual= baseDriver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,actual);
    }
}
