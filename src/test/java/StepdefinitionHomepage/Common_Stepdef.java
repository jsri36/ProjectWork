package StepdefinitionHomepage;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.utilities.CommonUtils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Stepdef {

	
	//Launch Browser()
	
	
	private static final Logger LOGGER=LogManager.getLogger(Common_Stepdef.class);
	
	
	
    @Before
	public void beforeScenario() {
		
		LOGGER.info("Execution Started");
		try {
			LOGGER.info("Instantiate the commonUtils");
			CommonUtils commonutils=new CommonUtils();
			
			LOGGER.info("Loading the properties file");
			commonutils.loadProperties();
			
					
			LOGGER.info("Checking the Driver is NuLL or not");
			if(DriverManager.getDriver()==null) {
			
				LOGGER.info("Driver is NuLL");
				DriverManager.launchBrowser();
				
		}}
		catch(Exception e) {
			//e.printStackTrace();
	}
				
			
		}
		
    @AfterStep
    public void attachScreenshot(Scenario scenario) {
    	
    	if(scenario.isFailed()) {
    		final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    	scenario.attach(screenshot, "image/png", scenario.getName());
    		
    	}
    	
    	
    	
	
	}}
	
	
	
	

