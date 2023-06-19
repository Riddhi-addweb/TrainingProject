package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/addweb/Desktop/IdeaProjects/HooksProject/src/test/java/Feature"},
        glue = {"Steps"},
        plugin = {"pretty", "html:TickTalk_Timelogs_Report.html"},
        //dryRun = true
        //monochrome = true
        tags = "@TimeLogs"
        //name = {"TimeLog"}
)
public class TestRunner {
}