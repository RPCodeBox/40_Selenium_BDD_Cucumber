package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class) // Uncomment @RunWith if you are using Junit to run Test
@CucumberOptions(
		features={"src//test//java//features"},
		glue={"stepdefinations","utility"},
		//plugin = {"pretty", "html:target/cucumber"},
		tags = {"@newtours"},
	    format = {"pretty",
	            "html:target/cucumber-reports/cucumber-pretty",
	            "html:target/cucumber-reports/advanced-reports",
	            "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
	            "rerun:target/cucumber-reports/rerun-reports/rerun.txt"},
		monochrome = true
		)

@Test
public class RunTest extends AbstractTestNGCucumberTests{
}
