package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "G:\\Selenium\\Sel@10.30AM(EST)\\workspace\\CucumberBDD\\src\\main\\java\\features"
		,glue={"stepDefinations"}
		,dryRun=false
		,plugin = {"pretty","json:target/myReports/report.json","junit:target/myReports/report.xml"}
		
		)
public class TestRunner {

}
