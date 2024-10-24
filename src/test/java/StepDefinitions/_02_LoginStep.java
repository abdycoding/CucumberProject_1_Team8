package StepDefinitions;

import Pages.LeftNav;
import Pages._02_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginStep {

    LeftNav ln = new LeftNav();
    _02_DialogContent dc2=new _02_DialogContent();

    @When("Enter username and password to login")
    public void enterUsernameAndPasswordToLogin() {


        ln.mySendKeys(ln.userName, "frkn07");
        ln.mySendKeys(ln.password, "1907");
        ln.myClick(ln.login);
}

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc2.MessageContainsText("Account");
        GWD.quitDriver();
    }
}
