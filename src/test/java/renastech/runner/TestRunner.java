package renastech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //this is for feature files path
        glue = "renastech/stepDefinitions", //this is for steps path /renastech
        tags =  "@TC_2",//"@TC100", // @LoginWithoutParams or @Smoke
        dryRun = false, // when it is true it will check if there is any undefined steps
        plugin={"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        }

         )

public class TestRunner {

}
