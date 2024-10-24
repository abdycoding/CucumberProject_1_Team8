
package StepDefinitions;

import Pages.ParentPage;
import Pages._04_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _04_AccountCreationStep extends ParentPage {
    _04_DialogContent dc=new _04_DialogContent();

    @And("The user is directed to the bank account opening page")
    public void theUserIsDirectedToTheBankAccountOpeningPage() {
        String Url= GWD.getDriver().getCurrentUrl();
        String Url2 = "https://parabank.parasoft.com/parabank/openaccount.htm";
        wait.until(ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/openaccount.htm"));
        Assert.assertEquals(Url,Url2, "URL does not match!");
    }


    @And("The user selects the account type as {string} from the drop-down menu")
    public void theUserSelectsTheAccountTypeAsFromTheDropDownMenu(String name) {
        dc.selectText(dc.selectType, name);

    }

    @And("The user receives a warning that the new bank account must have a minimum balance")
    public void theUserReceivesAWarningThatTheNewBankAccountMustHaveAMinimumBalance() {
        dc.waitUntilVisibilityOf(dc.message);
        System.out.println(dc.message.getText());
    }


    @And("The user selects the account of {int}  the minimum balance from the drop-down menu")
    public void theUserSelectsTheAccountOfTheMinimumBalanceFromTheDropDownMenu(int num) {
        dc.selectIndex(dc.select,num);
    }

    @Then("The user confirms that their account has been created and sees the account number.")
    public void theUserConfirmsThatTheirAccountHasBeenCreatedAndSeesTheAccountNumber() {
        dc.waitUntilVisibilityOf(dc.successMessage);
        System.out.println(dc.successMessage.getText());
    }



}

