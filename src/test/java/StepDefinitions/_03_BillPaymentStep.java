package StepDefinitions;

import Pages.LeftNav;
import Pages._02_DialogContent;
import Pages._03_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _03_BillPaymentStep {
    LeftNav ln = new LeftNav();
    _03_DialogContent dc3 = new _03_DialogContent();

    @And("User Sending the keys in DialogContent_three")
    public void userSendingTheKeysInDialogContent_three() {
        dc3.BillPay.click();
        dc3.name.sendKeys("a");
        dc3.adres.sendKeys("e");
        dc3.sehir.sendKeys("w");
        dc3.bolge.sendKeys("q");
        dc3.zipcode.sendKeys("23");
        dc3.phone.sendKeys("3423");
        dc3.accountno.sendKeys("7");
        dc3.verifyaccount.sendKeys("7");
        dc3.amount.sendKeys("300");
        dc3.sendpaybutton.click();
    }
    @Then("success message should display")
    public void successMessageShouldDisplay() {
        dc3.message("Bill Payment Complete");
        GWD.quitDriver();
    }
}
