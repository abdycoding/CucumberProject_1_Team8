package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _01_DialogContent extends ParentPage {

    public _01_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line
    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.address.street")
    public WebElement  address;
    @FindBy(id = "customer.lastName")
    public WebElement  lastName;
    @FindBy(id = "customer.address.city")
    public WebElement  city;
    @FindBy(id = "customer.address.state")
    public WebElement  state;
    @FindBy(id = "customer.address.zipCode")
    public WebElement  zipCode;
    @FindBy(id = "customer.phoneNumber")
    public WebElement  phoneNumber;
    @FindBy(id = "customer.ssn")
    public WebElement  ssN;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement passWord;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement register;

    @FindBy(xpath = "//div[@id='rightPanel']/p[text()]")
    public WebElement successMessage;


    public WebElement getWebElement(String strElementName){

        switch (strElementName.trim())
        {
            case "firstName": return  this.firstName;
            case "lastName": return  this.lastName;
            case "address": return  this.address;
            case "city": return  this.city;
            case "state": return  this.state;
            case "zipCode": return  this.zipCode;
            case "phoneNumber": return  this.phoneNumber;
            case "ssn": return  this.ssN;
            case "userName": return  this.userName;
            case "password": return  this.passWord;
            case "confirm": return  this.confirmPassword;
            case "registerDC": return  this.register;
        }

        return null;
    }

    public void verifyMessageContainsText(String value){
        Assert.assertTrue( this.successMessage.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

    }

}