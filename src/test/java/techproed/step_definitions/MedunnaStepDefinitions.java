package techproed.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import techproed.pages.MedunnaPage;
import techproed.utilities.ActionsUtils;
import techproed.utilities.BrowserUtils;
import techproed.utilities.ConfigReader;
import techproed.utilities.WaitUtils;

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
}
