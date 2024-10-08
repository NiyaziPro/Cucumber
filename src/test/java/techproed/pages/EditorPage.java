package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class EditorPage {
    public EditorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='New']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement nameVerify;



}
