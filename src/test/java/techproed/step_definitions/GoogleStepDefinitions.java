package techproed.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

import java.util.List;

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

    @And("user searches with the given information")
    public void userSearchesWithTheGivenInformation(DataTable data) {
        googlePage.handleCookies();
        System.out.println(data.asList());
        for (int i = 1; i < data.asList().size(); i++) {
            googlePage.searchBox.sendKeys(data.asList().get(i), Keys.ENTER);
            WaitUtils.waitFor(1);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            WaitUtils.waitFor(1);
            googlePage.searchBox.clear();
        }

    }

    @And("user searches with the given information second way")
    public void userSearchesWithTheGivenInformationSecondWay(List<String> list) {
        googlePage.handleCookies();

        for (String w : list) {
            googlePage.searchBox.sendKeys(w, Keys.ENTER);
            WaitUtils.waitFor(1);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(w));
            WaitUtils.waitFor(1);
            googlePage.searchBox.clear();
        }

    }
}
