package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",

                "pretty", // console'da senaryolarla ilgili ayrintili bilgiler verir


        },
        features = "src/test/resources/features",
        glue = {"techproed/step_definitions"},
        tags ="@US009a",
        dryRun = false

)

public class Runner {

}
