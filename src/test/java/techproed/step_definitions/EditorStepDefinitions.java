package techproed.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.EditorPage;

public class EditorStepDefinitions {
    EditorPage editorPage = new EditorPage();
    @When("user clicks new button")
    public void userClicksNewButton() {
        editorPage.newButton.click();
    }

    @And("user enters the given information {string} , {string}, {string} , {string} , {string} , {string} , {string}")
    public void userEntersTheGivenInformation(String name, String lastName, String position, String office, String extention, String startDate, String salary) {
        editorPage.firstNameBox.sendKeys(name,
                Keys.TAB,
                lastName,
                Keys.TAB,
                position,
                Keys.TAB,
                office,
                Keys.TAB,
                extention,
                Keys.TAB,
                startDate,
                Keys.TAB,
                salary);
    }

    @And("user clicks create button")
    public void userClicksCreateButton() {
        editorPage.createButton.click();

    }

    @And("user enters {string} into the search box")
    public void userEntersIntoTheSearchField(String name) {
        editorPage.searchBox.sendKeys(name);
    }

    @Then("verifies that user {string} was able to successfully register")
    public void verifiesThatUserWasAbleToSuccessfullyRegister(String name) {
        Assert.assertTrue(editorPage.nameVerify.getText().contains(name));
    }
}
