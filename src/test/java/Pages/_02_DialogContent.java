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

public class _02_DialogContent extends ParentPage {

    public _02_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line
}
