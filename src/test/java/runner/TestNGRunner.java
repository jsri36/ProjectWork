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
		dryRun=false,//The default value is false. True - Cucumber will verify individual steps in the Feature file and the implementation code of steps in Feature file within the Step Definition file.
		monochrome=false  
		
			
		)
public class TestNGRunner extends AbstractTestNGCucumberTests{

	
	
}

// Jenkins reference
//https://medium.com/@rajee.mozhi/a-guide-for-beginners-to-configure-maven-project-with-jenkins-9414955ad07c 
//https://www.youtube.com/watch?v=SGe3LT-Ufrk&ab_channel=ProgramsBuzz 
//https://www.youtube.com/watch?v=F8Nfjwneeb4&t=2077s&ab_channel=SDET-QAAutomationTechie


//Extent report reference - http://ghchirp.online/1697/  & https://www.youtube.com/watch?v=IuEO9AUbwwc&ab_channel=JahmalRichard
//https://www.extentreports.com/docs/versions/4/java/v3-html-reporter.html

//Coding refer -(pom to stepdef) https://qaautomation.expert/2021/04/12/page-objects-with-selenium-and-cucumber/

//to implement Corss browser for testng refer below code
//https://www.numpyninja.com/post/cross-browser-testing-cucumber-with-testng
//https://www.toolsqa.com/testng/cross-browser-testing-using-testng/

//Other refer
//https://www.toolsqa.com/selenium-cucumber-framework/read-configurations-from-property-file/