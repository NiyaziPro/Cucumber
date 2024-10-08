package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", // console'da senaryolarla ilgili ayrintili bilgiler verir


        },
        features = "src/test/resources/features",
        glue = {"techproed/step_definitions"},
        tags ="@US005",
        dryRun = false

)

public class Runner {

}
