package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(id = "APjFqb")
    public WebElement searchBox;

    @FindBy(id = "W0wltc")
    public WebElement cookiesHandle;

    public void handleCookies() {
        try {
            ReusableMethods.click(cookiesHandle);
        } catch (Exception e) {
            // If the cookie is not displayed, we will ignore the exception we will receive by leaving this blank.
        }
    }







}
