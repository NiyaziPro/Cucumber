package techproed.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("User goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperties("amazonUrl"));
    }

    @When("search for iphone in the search box")
    public void search_for_iphone_in_the_search_box() {

        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("search for samsung in the search box")
    public void search_for_samsung_in_the_search_box() {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("samsung");
        amazonPage.searchBox.submit();
    }

    @Then("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

    @When("search for nokia in the search box")
    public void searchForNokiaInTheSearchBox() {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("nokia");
        amazonPage.searchBox.submit();
    }


    @Given("user goes to {string} page")
    public void userGoesToPage(String url) {
        Driver.getDriver().get(ConfigReader.getProperties(url));
    }

    @When("search for {string} in the search box")
    public void searchForInTheSearchBox(String searchWord) {
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys(searchWord);
        amazonPage.searchBox.submit();
    }
}
