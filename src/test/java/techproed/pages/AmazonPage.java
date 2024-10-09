package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonPage {

    /*
    PageFactory.initElements() code matches the elements in this class with the webdriver.
    In this way, annotations that help PageFactory such as @FindBy can be used to access the webelements in the class
    */

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        //initElements(); This method allows the web elements that we will store in the page class to be initialized via the driver.
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;


    @FindBy(xpath = "//*[contains(text(),'Try different image')]")
    public WebElement captchaHandling;

    public void handleCaptcha() {
        try {
            ReusableMethods.click(captchaHandling);
        } catch (Exception e) {
            // If the captcha does not appear, we will ignore the exception we will receive by leaving this blank.
        }
    }

}
