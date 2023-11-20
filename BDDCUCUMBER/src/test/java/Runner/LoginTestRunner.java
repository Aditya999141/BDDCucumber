package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(features="src\\test\\java\\Features\\Login.feature",glue={"StepDefination"},
plugin= {"pretty","html:target/JSON REPORTS/reports.html",
		"pretty","json:target/JSON REPORTS/reports.json",
		"pretty","junit:target/JUNIT REPORTS/reports.xml"
	}
		
		
		
		
		
		
		
		
		)

public class LoginTestRunner
{

}
