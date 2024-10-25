package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _05_DialogContent extends ParentPage {

    public _05_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
//    @FindBy (xpath = "//a[@href='transfer.htm']")
//    public WebElement transferButton;

//    @FindBy (id = "toAccountId option[value='15564']")
//    public WebElement toAccountValue;

    @FindBy (xpath = "//*[@name='input']")
    public WebElement amount;

    @FindBy (xpath = "//input[@value='Transfer']")
    public WebElement trnsfrBtn;

    @FindBy (id = "amountResult")
    public WebElement amountRslt;

    @FindBy (id = "fromAccountIdResult")
    public WebElement fromAccountResult;

    @FindBy (id = "toAccountIdResult")
    public WebElement toAccountResult;

    @FindBy (xpath = "//a[@href='overview.htm']")
    public WebElement AccountsOverview;

    @FindBy (xpath = "//a[@href='activity.htm?id=14010']")
    public WebElement accounts14010;


}

