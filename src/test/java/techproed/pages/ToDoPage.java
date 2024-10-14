package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class ToDoPage {
    public ToDoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(tagName = "input")
    public WebElement addNewTodo;


    @FindBy(xpath = "//li")
    public List<WebElement> todoList;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteButtonList ;







}
