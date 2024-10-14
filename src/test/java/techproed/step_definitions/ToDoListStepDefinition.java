package techproed.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import techproed.pages.ToDoPage;
import techproed.utilities.ActionsUtils;
import techproed.utilities.Driver;

import java.util.List;

public class ToDoListStepDefinition {
    ToDoPage toDoPage = new ToDoPage();

    @Given("go to the url")
    public void goToTheUrl() {
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
    }


    @When("add todo list")
    public void addTodoList(List<String> todoList) {

        for (String w : todoList) {
            toDoPage.addNewTodo.click();
            toDoPage.addNewTodo.sendKeys(w,
                    Keys.ENTER);
        }
    }


    @And("cross out all the to-dos")
    public void crossOutAllTheToDos() {
        List<WebElement> todos = toDoPage.todoList;

        //1.Yol
        for (WebElement w : todos){
            w.click();
        }
      /*  //2.Yol
        todos.forEach(WebElement::click);*/
    }

    @And("delete all to-dos")
    public void deleteAllToDos() {
        List<WebElement> deleteTodos=toDoPage.deleteButtonList;
        deleteTodos.forEach(WebElement::click);

    }

    @Then("verify that all to-dos have been deleted.")
    public void verifyThatAllToDosHaveBeenDeleted() {
        Assert.assertTrue(toDoPage.todoList.isEmpty());
    }
}
