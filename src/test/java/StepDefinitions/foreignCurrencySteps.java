package StepDefinitions;

import Pages.dialogContent;
import cucumber.api.java.en.And;

public class foreignCurrencySteps {
    dialogContent dc=new dialogContent();

    @And("^Click to Purchase Foreign Currency button$")
    public void clickToPurchaseForeignCurrencyButton()
    {
        dc.findAndClickJavaScriptExecutor("foreignCurrency");
    }

    @And("^select currency as \"([^\"]*)\"$")
    public void selectCurrencyAs(String value)
    {
        dc.findAndSelect("currencySelect",value);
    }

    @And("^Enter to Amount as \"([^\"]*)\"$")
    public void enterToAmountAs(String amount)
    {
        dc.findAndSend("amount",amount);
    }

    @And("^Click to Dollar checkbox$")
    public void clickToDollarCheckbox()
    {
        dc.findAndClick("dollarCheckbox");
    }

    @And("^Click to calculate$")
    public void clickToCalculate()
    {
        dc.findAndClick("calculate");
    }

    @And("^Click to purchase$")
    public void clickToPurchase()
    {
        dc.findAndClick("purchaseButton");
    }

    @And("^Click to selected currency checkbox$")
    public void clickToSelectedCurrencyCheckbox()
    {
        dc.findAndClick("selectedCurrencyCheckbox");
    }


}
