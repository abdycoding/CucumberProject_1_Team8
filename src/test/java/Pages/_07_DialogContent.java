package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _07_DialogContent extends ParentPage {

    public _07_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement loanAmountBox;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPaymentBox;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccountDropDown;

    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//td[@id='loanProviderName']")
    public WebElement loanProvider; // ParaBank

    @FindBy(xpath = "//td[@id='loanStatus']")
    public WebElement loanStatus; // "Denied" or "Approved"

    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountNumberLink;

    @FindBy(xpath = "//p[contains(text(),'approved')]")
    public WebElement approvalMessage; //Congratulations, your loan has been approved.

    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;

    @FindBy(xpath = "//td[@id='accountType']")
    public WebElement accountType;

    @FindBy(xpath = "//td[@id='balance']")
    public WebElement accountBalance;

    @FindBy(xpath = "//td[@id='availableBalance']")
    public WebElement accountAvailableBalance;

    @FindBy(xpath = "//b[.='No transactions found.']")
    public WebElement transactionsMessage; //No transactions found.
}

