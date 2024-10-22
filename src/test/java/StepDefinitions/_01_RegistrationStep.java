package StepDefinitions;

import Pages.LeftNav;
import Pages._01_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_RegistrationStep {
    LeftNav ln=new LeftNav();
    _01_DialogContent dc=new _01_DialogContent();

    @Given("Navigate to the Website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
            dc.verifyMessageContainsText("success");
            GWD.quitDriver();
    }
}
