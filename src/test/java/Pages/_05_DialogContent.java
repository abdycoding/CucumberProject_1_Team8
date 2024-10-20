package Pages;

import Utilities.GWD;
import org.openqa.selenium.support.PageFactory;

public class _05_DialogContent extends ParentPage {

    public _05_DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    // locatorlar bu satırdan alta yazılacak.
    // locators should be written down under this line
}

