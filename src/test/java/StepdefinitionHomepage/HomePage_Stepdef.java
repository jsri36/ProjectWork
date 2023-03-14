package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.constants.Constants;

import com.dsalgo.pageobjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_Stepdef {

	private static final Logger LOGGER = LogManager.getLogger(HomePage_Stepdef.class);
	HomePage homePage = null;
	WebDriver driver = null;

	@Given("Launch DS Algo portal link")
	public void launch_ds_algo_portal_link() {
		// launch browser
		LOGGER.info("Launching a browser");
		
		driver = DriverManager.getDriver();
		driver.get(Constants.APP_URL);
		homePage = new HomePage(driver);

	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_button() {

		LOGGER.info("click on getstarted button");
		homePage.ClickonGetStarted();

	}

	
	@Then("The user redirected to home page url as the home")
	public void the_user_redirected_to_home_page_url_as_the_home() throws AWTException, IOException {
	    
		homePage.Verifyhomepage();
		homePage.Capture_ScreenShot();
				
	}

	@Then("The user clicks on data structure dropdown")
	public void the_user_clicks_on_data_structure_dropdown() {
	
		homePage.clickondropdown();
		LOGGER.info("click the dropdown option");
	}

	@When("The user select one of the dropdown menu")
	public void the_user_select_one_of_the_dropdown_menu() {
	   
		homePage.selecttheoption();
		LOGGER.info("select the anyone of dropdown option");
		
	}

	@Then("It should Alert the user with the message")
	public void it_should_alert_the_user_with_the_message() {
	    
		homePage.errormsg();
	}

	@When("The user click any of thr Get started button in home page")
	public void the_user_click_any_of_thr_get_started_button_in_home_page() {
	    
		homePage.clickagaingetstartbtn();
	}

	@When("The user click on Register")
	public void the_user_click_on_register() {
	    
		homePage.clickonRegisterlink();
	}

	@Then("The user should be redirected to Register page as title {string}")
	public void the_user_should_be_redirected_to_register_page_as_title(String string) {
	  
		homePage.verifyRegisterPage();
		
	}
}