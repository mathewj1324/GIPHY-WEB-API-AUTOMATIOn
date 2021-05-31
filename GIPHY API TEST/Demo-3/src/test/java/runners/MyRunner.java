package runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue= {"stepDefinitions","utilities"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {"@runit,@run","~@ignore"},
        monochrome = true
)


public class MyRunner {
}