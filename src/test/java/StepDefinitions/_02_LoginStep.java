package StepDefinitions;

import Pages.LeftNav;
import Pages._02_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginStep {

    LeftNav ln = new LeftNav();
    _02_DialogContent dc2 = new _02_DialogContent();

    @When("Enter username and password to login")
    public void enterUsernameAndPasswordToLogin() {


        ln.mySendKeys(ln.userName, "f");
        ln.mySendKeys(ln.password, "f");
        ln.myClick(ln.login);
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc2.MessageContainsText("Account");
        GWD.quitDriver();
    }

    @And("Enter wrong username or password to login")
    public void enterWrongUsernameOrPasswordToLogin() {
        ln.mySendKeys(ln.userName, "");
        ln.mySendKeys(ln.password, "");
        ln.myClick(ln.login);
    }

    @Then("success message should not be displayed")
    public void successMessageShouldNotBeDisplayed() {
        dc2.NegaiveMessageContainsText("could not be verified");
        GWD.quitDriver();
    }


}
