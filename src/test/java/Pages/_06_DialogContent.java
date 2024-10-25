package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _06_DialogContent extends ParentPage {

    public _06_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement  lastName;

    @FindBy(id = "customer.address.street")
    public WebElement  address;

    @FindBy(id = "customer.address.city")
    public WebElement  city;

    @FindBy(id = "customer.address.state")
    public WebElement  state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement  zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement  phoneNumber;

    @FindBy(xpath = "//input[@value = 'Update Profile']")
    public WebElement updateButton;

    @FindBy(xpath = "//*[@id='firstName-error']")
    public WebElement fnameRequiredMessage;

    @FindBy(xpath = "//*[@id='lastName-error']")
    public WebElement lnameRequiredMessage;

    @FindBy(xpath = "//*[@id='updateProfileResult']/h1")
    public WebElement updatedMessage;

    @FindBy(xpath = "//*[@id='leftPanel']/p")
    public WebElement nameAssertion;

    @FindBy(xpath = "//div[@id='leftPanel']/ul//a[text()='Log Out']")
    public WebElement logOut;

     public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "firstname": return  this.firstName;
            case "lastname": return  this.lastName;
            case "address": return  this.address;
            case "city": return  this.city;
            case "state": return  this.state;
            case "zipCode": return  this.zipCode;
            case "phone": return  this.phoneNumber;
            case "updateButton": return  this.updateButton;
            case "fnameRequiredMessage": return  this.fnameRequiredMessage;
            case "lnameRequiredMessage": return  this.lnameRequiredMessage;
            case "updatedMessage": return  this.updatedMessage;
            case "nameAsseriton": return  this.nameAssertion;
            case "logout": return  this.logOut;
        }

        return null;
    }

}

