package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.pageobjects.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class Registration_Stepdef {
	
	private static final Logger LOGGER = LogManager.getLogger(Registration_Stepdef.class);
	RegistrationPage registrationpage;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	registrationpage = new RegistrationPage(driver);
	}
	
	@Given("The user opens Register Page {string}")
	public void the_user_opens_register_page(String url) {
	    LOGGER.info("user in Register page");
	   
		driver.get(url);
			    
	}

	

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		
		registrationpage.clickonRegisterButton();
		LOGGER.info("user clicked on register button");
	    
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String msg) {
		
		registrationpage.verifyErrorMessage(msg);
		LOGGER.info("verifying a error message");
	    
	}
	
	

	@When("The user clicks Register button after entering username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(DataTable dataTable) {
		
	   List<String> crendential= dataTable.asList(String.class);
	   String username=crendential.get(0);
	   registrationpage.passthevalue(username);
	   
	   
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String msg) throws AWTException, IOException {
		
		registrationpage.verifyErrorMessage(msg);
		LOGGER.info("verifying a error message");
		registrationpage.Capture_ScreenShot();
	   
	}
	
	

	@When("The user clicks Register button after entering username and password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty(DataTable dataTable) {
	    
		 List<String> crendential= dataTable.asList(String.class);
		   String username=crendential.get(0);
		   String password=crendential.get(1);
		   registrationpage.passthevalue(username,password);
		   
		   
		
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String msg) {
		registrationpage.verifyErrorMessage(msg);
		LOGGER.info("verifying a error message");
	}

	

	@When("The user enters a username with characters other than Letters, digits")
	public void the_user_enters_a_username_with_characters_other_than_letters_digits(DataTable dataTable) {
	    
		 List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
		   LOGGER.info("passing a username with characters and number");
			
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expectedmsg) {
	    
		registrationpage.errormessagevalidation(expectedmsg);
		
	}

	@When("The user enters a valid existing username with password and password confirmation")
	public void the_user_enters_a_valid_existing_username_with_password_and_password_confirmation(DataTable dataTable) {
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
	    
	}

	@When("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields")
	public void the_user_clicks_register_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(DataTable dataTable) {
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
		
		
	}

	@When("The user enters a valid username and password with characters less than eight")
	public void the_user_enters_a_valid_username_and_password_with_characters_less_than_eight(DataTable dataTable) {
		
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
	    
	}

	@When("The user enters a valid username and password with only numbers")
	public void the_user_enters_a_valid_username_and_password_with_only_numbers(DataTable dataTable) {
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
		
		
	}

	@When("The user enters a valid username and password similar to username")
	public void the_user_enters_a_valid_username_and_password_similar_to_username(DataTable dataTable) {
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
	   
	}

	@When("The user enters a valid username and commonly used password password")
	public void the_user_enters_a_valid_username_and_commonly_used_password_password(DataTable dataTable) {
		
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
	    
	}

	@When("The user enters a valid username and password and password confirmation")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation(DataTable dataTable) {
	    
		List<Map<String,String>> crendential= dataTable.asMaps(String.class,String.class);
		 String username=crendential.get(0).get("username");
		   String password=crendential.get(0).get("password");
		   String passwordconfirmation=crendential.get(0).get("passwordconfirmation");
		   registrationpage.passthevalue(username,password,passwordconfirmation);
		
		
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    
		registrationpage.verifysucessmsg();
		LOGGER.info(" successfully New Account Created");
		
	}
	

}
