package techproed.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import techproed.pages.MedunnaPage;
import techproed.utilities.*;

public class MedunnaStepDefinitions {
    MedunnaPage medunnaPage = new MedunnaPage();
    Faker faker =new Faker();
    @Then("click on the User icon")
    public void clickOnTheUserIcon() {
        medunnaPage.accountMenuDropDown.click();
    }

    @And("click on the Sign In option")
    public void clickOnTheSignInOption() {
        medunnaPage.loginButton.click();
    }

    @And("enter username in the Username field: {string}")
    public void enterUsernameInTheUsernameField(String username) {
        medunnaPage.userNameTextBox.sendKeys(ConfigReader.getProperties(username));

    }

    @And("enter password in the Password field: {string}")
    public void enterPasswordInThePasswordField(String password) {
        medunnaPage.passwordBox.sendKeys(ConfigReader.getProperties(password));
    }

    @And("click on the Sign In button")
    public void clickOnTheSignInButton() {
        medunnaPage.signInButton.click();
    }

    @Then("click on Items&Titles")
    public void clickOnItemsTitles() {
        medunnaPage.itemsAndTitles.click();
    }

    @And("click on the room option")
    public void clickOnTheRoomOption() {
        medunnaPage.room.click();
    }

    @And("click on the Create New Room button")
    public void clickOnTheCreateNewRoomButton() {
        medunnaPage.createANewRoomButton.click();
    }

    String roomNumber;
    @Then("enter room number in the Room Number field: {string}")
    public void enterRoomNumberInTheRoomNumberField(String roomNumber) {
        this.roomNumber=roomNumber;
        medunnaPage.roomNumberBox.sendKeys(roomNumber);
    }

    @And("select SUIT from the Room Type menu - select: {int}")
    public void selectSUITFromTheRoomTypeMenuSelect(int type) {
        BrowserUtils.dropdownSelectByIndex(medunnaPage.roomTypeSelect,type-1);
    }

    @And("check the Status checkbox")
    public void checkTheStatusCheckbox() {
        if (!medunnaPage.statusCheckbox.isSelected()){
            medunnaPage.statusCheckbox.click();
        }
    }

    @And("enter price in the Price field: {string}")
    public void enterPriceInThePriceField(String price) {
        medunnaPage.priceBox.sendKeys(price);
    }

    @And("enter description in the description field:{string}")
    public void enterDescriptionInTheDescriptionField(String description) {
        medunnaPage.descriptionBox.sendKeys(description);
    }

    @Then("click the Save button")
    public void clickTheSaveButton() {
        medunnaPage.saveButton.click();
    }

    @And("verify that a room has been successfully created")
    public void verifyThatARoomHasBeenSuccessfullyCreated() {
        WaitUtils.waitForVisibility(medunnaPage.successfullyCreatedMsg,20);
        Assert.assertTrue(medunnaPage.successfullyCreatedMsg.isDisplayed());

    }


    @But("wait for {int} seconds")
    public void waitForSeconds(int seconds) {
        WaitUtils.waitFor(seconds);
    }

    @And("click on the Created Date")
    public void clickOnTheCreatedDate() {
        medunnaPage.createdDate.click();
    }

    @Then("verify that the created room is in the list")
    public void verifyThatTheCreatedRoomIsInTheList() {
        Assert.assertTrue(medunnaPage.roomList.stream().anyMatch(t->t.getText().contains(roomNumber)));

    }

    String randomRoomNumber;
    @Then("enter room number in the Room Number field")
    public void enterRoomNumberInTheRoomNumberField() {
        randomRoomNumber = faker.number().digits(8);
        medunnaPage.roomNumberBox.sendKeys(randomRoomNumber);
    }

    @And("enter price in the Price field")
    public void enterPriceInThePriceField() {
        medunnaPage.priceBox.sendKeys(faker.number().digits(3));
    }

    @And("enter description in the description field")
    public void enterDescriptionInTheDescriptionField() {
        medunnaPage.descriptionBox.sendKeys(faker.lorem().paragraph());
    }
    @Then("verify that the created room is in the list.")
    public void verifyThatTheCreatedRoomIsInTheList2() {
        Assert.assertTrue(medunnaPage.roomList.stream().anyMatch(t->t.getText().contains(randomRoomNumber)));

    }

    @Given("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String url) {
        Driver.getDriver().get(ConfigReader.getProperties(url));
    }

    @And("enter username in the Username field")
    public void enterUsernameInTheUsernameField() {
        medunnaPage.userNameTextBox.sendKeys(ConfigReader.getProperties("medunna_username"));
    }

    @And("enter password in the Password field")
    public void enterPasswordInThePasswordField() {
        medunnaPage.passwordBox.sendKeys(ConfigReader.getProperties("medunna_password"));
    }

    @And("enter a room number in the Room Number field")
    public void enterARoomNumberInTheRoomNumberField() {
        int roomNumber = Faker.instance().number().numberBetween(100000,1000000);
        medunnaPage.roomNumberBox.sendKeys(roomNumber+"");
    }

    @And("select SUIT from the Room Type menu")
    public void selectSUITFromTheRoomTypeMenu() {
        BrowserUtils.dropdownSelectByVisibleText(medunnaPage.roomTypeSelect,"SUITE");
    }

    @And("click on the Status checkbox")
    public void clickOnTheStatusCheckbox() {
        medunnaPage.statusCheckbox.click();
    }

    @And("enter {string} in the Price field")
    public void enterInThePriceField(String price) {
        medunnaPage.priceBox.sendKeys(price);
    }

    @And("enter {string} in the Description field")
    public void enterInTheDescriptionField(String description) {
        medunnaPage.descriptionBox.sendKeys(description);
    }

    @And("click on the Save button")
    public void clickOnTheSaveButton() {
        medunnaPage.saveButton.click();
    }

    @Then("verify a new room created successfully")
    public void verifyANewRoomCreatedSuccessfully() {
        WaitUtils.waitForVisibility(medunnaPage.successfullyCreatedMsg,20);
        Assert.assertTrue(medunnaPage.successfullyCreatedMsg.isDisplayed());
    }

    @And("click on the Register")
    public void clickOnTheRegister() {
        medunnaPage.registerButton.click();
    }

    @And("enter {string} in the SSN field")
    public void enterInTheSSNField(String ssn) {
        medunnaPage.ssnTextBox.sendKeys(ssn);
    }

    @And("enter {string} in the First Name field")
    public void enterInTheFirstNameField(String firstName) {
        medunnaPage.firstNameTextBox.sendKeys(firstName);
    }

    @And("enter {string} in the Last Name field")
    public void enterInTheLastNameField(String lastName) {
        medunnaPage.lastNameTextBox.sendKeys(lastName);
    }

    @And("enter {string} in the Username field")
    public void enterInTheUsernameField(String username) {
        medunnaPage.userNameTextBox.sendKeys(username);
    }

    @And("enter {string} in the Email field")
    public void enterInTheEmailField(String email) {
        medunnaPage.emailTextBox.sendKeys(email);
    }

    @And("enter {string} in the New Password field")
    public void enterInTheNewPasswordField(String password) {
        medunnaPage.firstPasswordTextBox.sendKeys(password);
    }

    @And("enter {string} in the New password confirmation field")
    public void enterInTheNewPasswordConfirmationField(String confirmPassword) {
        medunnaPage.secondPasswordTextBox.sendKeys(confirmPassword);
    }

    @And("click Register button")
    public void clickRegisterButton() {
        ActionsUtils.scrollToElementUsingActions(medunnaPage.registerSubmitButton);
        medunnaPage.registerSubmitButton.click();
    }

    @Then("verify a registration created successfully")
    public void verifyARegistrationCreatedSuccessfully() {
        WaitUtils.waitForVisibility(medunnaPage.registrationSavedText,20);
        Assert.assertTrue(medunnaPage.registrationSavedText.isDisplayed());
       // System.out.println(medunnaPage.registrationSuccessOrNotMsg.getText());

    }

    @Then("verify a registration not created successfully")
    public void verifyARegistrationNotCreatedSuccessfully() {
        Assert.assertTrue(medunnaPage.requiredMessageList.stream().allMatch(WebElement::isDisplayed));
    }
}
