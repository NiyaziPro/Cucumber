package techproed.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.WaitUtils;

import java.nio.file.Files;
import java.util.List;

public class BlueRentalStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();

    @Given("User goes to BlueRentalCar page")
    public void user_goes_to_blue_rental_car_page() {
        Driver.getDriver().get(ConfigReader.getProperties("blueRentalCarUrl"));
    }

    @When("click on the login button")
    public void click_on_the_login_button() {
        blueRentalCarPage.loginButton.click();

    }

    @When("login with email and password information")
    public void login_with_email_and_password_information() {
        blueRentalCarPage.emailBox.sendKeys(ConfigReader.getProperties("blueRentalEmail"));
        blueRentalCarPage.passwordBox.sendKeys(ConfigReader.getProperties("blueRentalPassword"));
    }

    @And("user must enter {string} and {string}")
    public void userMustEnterAnd(String email, String password) {
        blueRentalCarPage.emailBox.sendKeys(email);
        blueRentalCarPage.passwordBox.sendKeys(password, Keys.ENTER);
    }

    @Then("verifies user is logged in")
    public void verifiesUserIsLoggedIn() {
        Assert.assertNotEquals("Login", blueRentalCarPage.dropDownMenu.getText());
    }

    @Then("verifies user is logged in {string}")
    public void verifiesUsersEmailIsLoggedIn(String email) {
        blueRentalCarPage.dropDownMenu.click();
        blueRentalCarPage.profileLink.click();

        Assert.assertEquals(email, blueRentalCarPage.emailVerify.getText());

    }

    @And("login with the given user information")
    public void loginWithTheGivenUserInformation(DataTable data) {
        List<List<String>> emailPassword = data.asLists();

        for (int i = 1; i < emailPassword.size(); i++) {

            String email = emailPassword.get(i).get(0);
            String password = emailPassword.get(i).get(1);

            blueRentalCarPage.emailBox.sendKeys(email);
            blueRentalCarPage.passwordBox.sendKeys(password, Keys.ENTER);
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().back();

        }

        //2.yol
        for (int i = 1; i < data.asLists().size(); i++) {

            String email = data.row(i).get(0);
            String password = data.row(i).get(1);

            blueRentalCarPage.emailBox.sendKeys(email);
            blueRentalCarPage.passwordBox.sendKeys(password, Keys.ENTER);
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().back();

        }

    }

    @And("login with the given user information test")
    public void loginWithTheGivenUserInformationTest(DataTable data) {
        List<List<String>> emailPassword = data.asLists();
        // [[email, password],
        // [ayhancan@bluerentalcars.com, ayhan],
        // [beyhancan@bluerentalcars.com, beyhan],
        // [sam.walker@bluerentalcars.com, sami],
        // [john_doe@gmail.com, johndoe],
        // [johnson@bluerentalcars.com, johnson]]

        for (int i = 1; i < emailPassword.size(); i++) {
            String email = emailPassword.get(i).get(0);
            String password = emailPassword.get(i).get(1);

            blueRentalCarPage.emailBox.sendKeys(email);
            blueRentalCarPage.passwordBox.sendKeys(password, Keys.ENTER);

            WaitUtils.waitFor(2);
            blueRentalCarPage.dropDownMenu.click();
            blueRentalCarPage.profileLink.click();

            Assert.assertEquals(email, blueRentalCarPage.emailVerify.getText());

            blueRentalCarPage.dropDownMenu.click();
            blueRentalCarPage.logoutLink.click();
            blueRentalCarPage.oKButton.click();
            blueRentalCarPage.loginButton.click();
        }
    }


    @And("login with the information on the {string} page in Excel")
    public void loginWithTheInformationOnThePageInExcel(String sheetName) {

        String path = "src/test/resources/adminTestData.xlsx";
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);

        for (int i = 1; i < excelUtils.rowCount(); i++) {
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            blueRentalCarPage.emailBox.sendKeys(email);
            blueRentalCarPage.passwordBox.sendKeys(password, Keys.ENTER);
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().back();
        }

    }
}
