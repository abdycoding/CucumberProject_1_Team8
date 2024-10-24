package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _03_DialogContent extends ParentPage {

    public _03_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line

    @FindBy(xpath = "//*[text()='Bill Pay']")
    public WebElement BillPay;

    @FindBy(xpath = "//*[@name='payee.name']")
    public WebElement name;

    @FindBy(xpath = "//*[@name='payee.address.street']")
    public WebElement adres;

    @FindBy(xpath = "//*[@name='payee.address.city']")
    public WebElement sehir;

    @FindBy(xpath = "//*[@name='payee.address.state']")
    public WebElement bolge;

    @FindBy(xpath = "//*[@name='payee.address.zipCode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@name='payee.phoneNumber']")
    public WebElement phone;

    @FindBy(xpath = "//*[@name='payee.accountNumber']")
    public WebElement accountno;

    @FindBy(xpath = "//*[@name='verifyAccount']")
    public WebElement verifyaccount;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement amount;

    @FindBy(xpath = "//*[@value='Send Payment']")
    public WebElement sendpaybutton;

    @FindBy(xpath = "//*[text()='Bill Payment Complete']")
    public WebElement complate;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "BillPay":
                return this.BillPay;
            case "name":
                return this.name;
            case "adres":
                return this.adres;
            case "sehir":
                return this.sehir;
            case "bolge":
                return this.bolge;
            case "zipcode":
                return this.zipcode;
            case "phone":
                return this.phone;
            case "accountno":
                return this.accountno;
            case "verifyaccount":
                return this.verifyaccount;
            case "amount":
                return this.amount;
            case "sendpaybutton":
                return this.sendpaybutton;
        }

        return null;
    }
    public void message(String value){
        Assert.assertTrue(this.complate.isDisplayed());

    }

}

