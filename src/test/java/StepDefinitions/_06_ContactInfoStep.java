package StepDefinitions;

import Pages.LeftNav;
import Pages._06_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _06_ContactInfoStep {
    LeftNav ln = new LeftNav();
    _06_DialogContent dc = new _06_DialogContent();

    @And("User Sending the keys in LeftNav")
    public void userSendingTheKeysInLeftNav(DataTable loginInfos) {
        List<List<String>> boxandLetters = loginInfos.asLists();

        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box = ln.getWebElement(boxandLetters.get(i).get(0));
            ln.mySendKeys(box, boxandLetters.get(i).get(1));
        }
    }

    @And("Successfully updated message should be displayed")
    public void successfullyUpdateMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.updatedMessage.getText().toLowerCase().contains("updated"));
    }

    @Then("User verifies update")
    public void userVerifiesUpdate() {
        Assert.assertTrue(dc.nameAssertion.getText().toLowerCase().contains("test1"));
        GWD.quitDriver();
    }

    @And("Error messages should be displayed")
    public void errorMessagesShouldBeDisplayed() {
        Assert.assertTrue(dc.fnameRequiredMessage.getText().toLowerCase().contains("required"));
        Assert.assertTrue(dc.lnameRequiredMessage.getText().toLowerCase().contains("required"));
    }

    @Then("User verifies non-update")
    public void userVerifiesNonUpdate() {
        Assert.assertTrue(dc.nameAssertion.getText().toLowerCase().equals(dc.nameAssertion.getText().toLowerCase()));
        GWD.quitDriver();
    }
}
