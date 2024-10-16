package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class MedunnaPage {


    public MedunnaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /////////////// --  Login Page -- /////////////////////
    @FindBy(id = "account-menu")
    public WebElement accountMenuDropDown;


    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[.='Admin Batch210']")
    public WebElement loginVerify;

    @FindBy(id = "login-item")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    /////////////// --  Register Page -- /////////////////////

    @FindBy(xpath = "//*[.='Register']")
    public WebElement registerButton;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "username")
    public WebElement userNameTextBox;


    @FindBy(id = "email")
    public WebElement emailTextBox;


    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerSubmitButton;

    @FindBy(xpath = "//*[text()='Registration Saved']")
    public WebElement registrationSavedText;

    ////////////////// -- Password Strength -- //////////////////////

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthRed;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement passwordStrengthOrange;

    @FindBy (xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement passwordStrengthGreen1;

    @FindBy (xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement passwordStrengthGreen2;


    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsAndTitles;

    @FindBy(xpath = "//a/span[text()='Room']")
    public WebElement room;


    @FindBy(id = "jh-create-entity")
    public WebElement createANewRoomButton;

    @FindBy(id = "room-roomNumber")
    public WebElement roomNumberBox;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeSelect;

    @FindBy(id = "room-status")
    public WebElement statusCheckbox;

    @FindBy(id = "room-price")
    public WebElement priceBox;

    @FindBy(id = "room-description")
    public WebElement descriptionBox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;


    @FindBy(xpath = "//div[contains(text(),'A new Room is created with identifier')]")
    public WebElement successfullyCreatedMsg;

    @FindBy(xpath = "//span[text()='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> roomList;

    @FindBy(className = "Toastify__toast-body")
    public WebElement registrationSuccessOrNotMsg;

    @FindBy(className = "invalid-feedback")
    public List<WebElement> requiredMessageList;



}
