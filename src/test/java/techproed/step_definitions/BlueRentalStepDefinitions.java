package techproed.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

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

}
