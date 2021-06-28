package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dialogContent extends Parent {

    public dialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='pay_bills_tab']/a")
    private WebElement payBills;

    @FindBy(xpath = "//li/a[@href='#ui-tabs-2']")
    private WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    private WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    private WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    private WebElement account;

    @FindBy(id = "np_new_payee_details")
    private WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    private WebElement addBtn;

    @FindBy(id = "alert_content")
    private WebElement successMessage;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    private WebElement foreignCurrency;

    @FindBy(css = "#pc_currency")
    public WebElement currencySelect;

    @FindBy(css = "input[id='pc_amount']")
    private WebElement amount;

    @FindBy(id = "pc_inDollars_true")
    private WebElement dollarCheckbox;

    @FindBy(id = "pc_inDollars_false")
    private WebElement selectedCurrencyCheckbox;

    @FindBy(id = "pc_calculate_costs")
    private WebElement calculate;

    @FindBy(id = "purchase_cash")
    private WebElement purchaseButton;

    WebElement myElement;

    public void findAndClick(String elementName) {

        switch (elementName) {
            case "addBtn":
                myElement = addBtn;
                break;

            case "dollarCheckbox":
                myElement = dollarCheckbox;
                break;

            case "selectedCurrencyCheckbox":
                myElement = selectedCurrencyCheckbox;
                break;

            case "calculate":
                myElement = calculate;
                break;

            case "purchaseButton":
                myElement = purchaseButton;
                break;
        }
        clickFunction(myElement);
    }


    public void findAndSend(String elementName, String value) {
        switch (elementName) {
            case "payeeName":
                myElement = payeeName;
                break;

            case "payeeAddress":
                myElement = payeeAddress;
                break;

            case "account":
                myElement = account;
                break;

            case "payeeDetails":
                myElement = payeeDetails;
                break;

            case "amount":
                myElement = amount;
                break;
        }
        sendKeysFunction(myElement, value);
    }


    public void findAndContainsText(String elementName, String message) {
        switch (elementName) {
            case "successMessage":
                myElement = successMessage;
                break;
        }
        verifyContainsText(myElement, message);
    }


    public void findAndContainsAttribute(String elementName, String message) {
        switch (elementName) {
            case "account":
                myElement = account;
                break;
        }
        verifyContainsAttribute(myElement, message);
    }


    public void findAndSelect(String elementName, String value1) {

        switch (elementName) {
            case "currencySelect":
                myElement = currencySelect;
                break;
        }
        selectedAndClick(currencySelect, value1);
    }


    public void findAndClickJavaScriptExecutor(String elementName) {
        switch (elementName) {
            case "payBills":
                myElement = payBills;
                break;

            case "addNewPayee":
                myElement = addNewPayee;
                break;

            case "foreignCurrency":
                myElement = foreignCurrency;
                break;
        }
        javaScriptExecutorClick(myElement);
    }
}
