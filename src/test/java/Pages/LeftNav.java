package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='Solutions']")
    public WebElement solutions;

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='About Us']")
    public WebElement about_us;

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='Services']")
    public WebElement services;

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='Products']")
    public WebElement products;

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='Locations']")
    public WebElement locations;

    @FindBy(xpath = "//ul[@class='leftmenu']/li[text()='Admin Page']")
    public WebElement admin_page;

    @FindBy(xpath = "//div[@class='login']/input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='login']/input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//div[@class='login']/input[@value='Log In']")
    public WebElement login;


    @FindBy(xpath = "//div[@id='loginPanel']/p/a[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Accounts Overview']")
    public WebElement accountsOverview;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Transfer Funds']")
    public WebElement transferFunds;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Bill Pay']")
    public WebElement billPay;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Find Transactions']")
    public WebElement findTransactions;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Update Contact Info']")
    public WebElement updateContactInfo;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Request Loan']")
    public WebElement requestLoan;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Log Out']")
    public WebElement logOut;


    public WebElement getWebElement(String strElementName){

        switch (strElementName)
        {
            case "register": return this.register;

        }

        return null;
    }

}
