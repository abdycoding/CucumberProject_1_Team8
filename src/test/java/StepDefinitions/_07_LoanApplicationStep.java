package StepDefinitions;

import Pages.LeftNav;
import Pages._07_DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _07_LoanApplicationStep {
    LeftNav ln = new LeftNav();
    _07_DialogContent dc7 = new _07_DialogContent();
    @When("User clicks on Request Loan link")
    public void userClicksOnRequestLoanLink() {
        ln.myClick(ln.requestLoan);
    }

    @Then("User applies for loan")
    public void userAppliesForLoan() {
        dc7.mySendKeys(dc7.loanAmountBox, "1000");
        dc7.mySendKeys(dc7.downPaymentBox,"300");
        dc7.myClick(dc7.fromAccountDropDown);
        dc7.myClick(dc7.applyNowButton);

    }


    @Then("User validates Loan Request Processed fields")
    public void userValidatesLoanRequestProcessedFields() {
        Assert.assertEquals(dc7.loanProvider.getText(),"ParaBank");
        Assert.assertEquals(dc7.loanStatus.getText(),"Approved");
    }

    @Then("User validates approval message")
    public void userValidatesApprovalMessage() {
        Assert.assertTrue(dc7.approvalMessage.getText().toLowerCase().contains("approved"));
    }

    @Then("User clicks on the credit account number link")
    public void userClicksOnTheCreditAccountNumberLink() {
        dc7.myClick(dc7.newAccountNumberLink);
    }

    @Then("User validates information under Account Details")
    public void userValidatesInformationUnderAccountDetails() {
        Assert.assertEquals(dc7.accountType.getText(),"LOAN");
        Assert.assertTrue(dc7.accountNumber.isDisplayed());
        Assert.assertTrue(dc7.accountBalance.isDisplayed());
        Assert.assertTrue(dc7.accountAvailableBalance.isDisplayed());

    }

    @And("User validates message under Account Activity")
    public void userValidatesMessageUnderAccountActivity() {
        Assert.assertEquals(dc7.transactionsMessage.getText(),"No transactions found.");
    }
}
