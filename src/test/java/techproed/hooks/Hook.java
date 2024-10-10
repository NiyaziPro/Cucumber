package techproed.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;


public class Hook {
    @Before
    public void setUp() throws Exception{
        System.out.println("The @Before method in the Hook class is executed before all scenarios.");
    }

    @Before("@audi")
    public void setUp2() throws Exception{
        System.out.println("The @Before method in the Hook class is executed before all scenarios.");
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png", scenario.getName());
            Driver.closeDriver();
        }
    }

    @After("@mercedes")
    public void tearDown2(Scenario scenario) throws Exception {

        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png", scenario.getName());
            Driver.closeDriver();
        }
    }

}
