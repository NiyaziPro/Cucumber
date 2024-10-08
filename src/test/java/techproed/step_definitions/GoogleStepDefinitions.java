package techproed.step_definitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();



    @When("searched for {string} in the search box")
    public void searchedForInTheSearchBox(String searchWord) {
        googlePage.handleCookies();
        googlePage.searchBox.sendKeys(searchWord);
        googlePage.searchBox.submit();
    }

    @But("user waits {int} seconds")
    public void userWaitsSeconds(int seconds) {
        WaitUtils.waitFor(seconds);
    }

    @Then("verifies if the page title contains {string}")
    public void verifiesIfThePageTitleContains(String searchedWord) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchedWord) );
    }
}
