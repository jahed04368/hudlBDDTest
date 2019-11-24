package Runner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/Features"},
        plugin = {

        //all the reports
                "pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt",
                "html:target/html/native-cucumber-reporting.html"
        },
        glue = {"StepsDef"},
        tags = {"@hudlTest"}

)
public class testRunner {

}
