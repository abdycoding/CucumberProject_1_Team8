
package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_DialogContent extends ParentPage {

    public _04_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

//    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
//    public WebElement openNewAccount;

    @FindBy(xpath = "//select[@id='type']")
    public WebElement selectType;

    @FindBy(xpath = "//*[contains(text(),'Please choose an existing account to transfer funds')]")
    public WebElement message;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement select;

    @FindBy(xpath = "//p[contains(text(),'Congratulations, your account is now open.')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@id='rightPanel']//a[@id='newAccountId']")
    public WebElement account;

    @FindBy(xpath = "(//div[@class='ng-scope'])[2]")
    public WebElement details;


    public void selectText(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select slct = new Select(element);
        slct.selectByVisibleText(text);
    }

    public void waitUntilVisibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectIndex(WebElement element, int num) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select mu = new Select(element);
        mu.selectByIndex(num);
    }


    public WebElement getWebElement(String strWebElement){
        switch (strWebElement){
//            case "openNewAccount": return this.openNewAccount;
            case "selectType": return this.selectType ;
            case "message": return this.message ;
            case "select": return this.select;
            case "successMessage": return this.successMessage ;
            case "account": return this.account ;
            case "details": return this.details;

        }
        return null;
    }
}

