package asu.example.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by april.granroth on 1/25/17.
 */
@RunWith(Cucumber.class)

@CucumberOptions(format = {"pretty", "junit:target/cucumber-integration-junit-report.xml", "json:target/cucumber-integration-json-report.json", "html:target/cucumber-integration-html-report.html"},
        features="classpath:features",
        tags={"~@pending","~@ignore"})

public class RunCucumber {

}
