package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty","html:target/cucumberreport.html",
				"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features={"src/test/resources/features"},
		glue="StepdefinitionHomepage",
		dryRun=false,
		monochrome=true
		
			
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

	
	
}
