package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.pageobjects.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_Stepdef {
	
	
	private static final Logger LOGGER = LogManager.getLogger(SignIn_Stepdef.class);
	SignInPage signinpage;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	signinpage = new SignInPage(driver);
	}
	

	@Given("The user is on register page {string}")
	public void the_user_is_on_register_page(String url) {
		driver.get(url);
		LOGGER.info("user in register page");
		signinpage.verifycurrenturl(url);
	    
	}
	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		
	    signinpage.clickonsigninbutton();
	    LOGGER.info("user clicks on signin button");
	    
		
	}
	@Then("The user redirected to Registration page from signin page {string}")
	public void the_user_redirected_to_registration_page_from_signin_page(String url) {
		
		LOGGER.info("user in signIn page");
		signinpage.verifycurrenturl(url);
	   
	}
	
	//TC02
	@Given("The user is on login page {string}")
	public void the_user_is_on_login_page(String url) {
	    driver.get(url);
	}
	@When("The user enter invalid username and password")
	public void the_user_enter_invalid_username_and_password() throws IOException {
		
		LOGGER.info("enters invalid username and password");
		signinpage.invalidusername();
		
	    
	}
	@Then("click login button to verify {string}")
	public void click_login_button_to_verify(String string) {
		
		LOGGER.info("verifying user in right page");
		signinpage.verifymessage();
		
	}
	
	//TC03
	@When("The user enter valid and invalid input from excel sheet")
	public void the_user_enter_valid_and_invalid_input_from_excel_sheet() throws IOException {
		
		LOGGER.info("user enter valid user name and password from excel sheet");
		signinpage.testdatausernameandpwsd();
	   
	}
	
		
	@Then("click login button")
	public void click_login_button() throws AWTException, IOException {
		LOGGER.info("user clicks login button");
		signinpage.Capture_ScreenShot();
	}
	
	
	//TC04
	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
		
		LOGGER.info("validate user in home page");
	}
	
	@When("The user clicks Sign out")
	public void the_user_clicks_sign_out() {
		LOGGER.info("singout page");
	    
	}
	@Then("The user redirected to homepage {string}")
	public void the_user_redirected_to_homepage(String url) {
		signinpage.verifycurrenturl(url);
	    
	}

}
