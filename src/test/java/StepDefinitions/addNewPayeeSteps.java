package StepDefinitions;

import Pages.dialogContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;


public class addNewPayeeSteps {

    dialogContent dc=new dialogContent();

    @And("^Click to Pay Bills button$")
    public void clickToPayBillsButton() {
      dc.findAndClickJavaScriptExecutor("payBills");
    }

    @And("^Click to Add New Payee button$")
    public void clickToAddNewPayeeButton() {
        dc.findAndClickJavaScriptExecutor("addNewPayee");
    }

    @And("^Enter payee name as \"([^\"]*)\"$")
    public void enterPayeeNameAs(String name) {
        dc.findAndSend("payeeName",name);
    }

    @And("^Enter payee address as \"([^\"]*)\"$")
    public void enterPayeeAddressAs(String address) {
       dc.findAndSend("payeeAddress",address);
    }

    @And("^Enter account as \"([^\"]*)\"$")
    public void enterAccountAs(String account)  {
      dc.findAndSend("account",account);
    }

    @And("^Enter payee details as \"([^\"]*)\"$")
    public void enterPayeeDetailsAs(String details) {
       dc.findAndSend("payeeDetails",details);
    }

    @When("^Click to add button$")
    public void clickToAddButton() {
        dc.findAndClick("addBtn");
    }

    @Then("^successfully message should be displayed$")
    public void successfullyMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","successfully");
    }

    @And("^Fill in your information$")
    public void fillInYourInformation(DataTable elements) {
        List<List<String>> listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1) );
        }
    }

    @Then("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
       dc.findAndContainsAttribute("account","alanı doldurun");
    }
}
