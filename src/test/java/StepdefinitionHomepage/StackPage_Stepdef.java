package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.pageobjects.*;


public class StackPage_Stepdef {
	
	
	
	private static final Logger LoggerLoad = LogManager.getLogger(StackPage_Stepdef.class);
	StackPage stack;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	stack = new StackPage(driver);
	}
	
	@When("The user select stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
		LoggerLoad.info("Selecting Stack from drop down");
		stack.selectDropdown();
	}

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() throws AWTException, IOException {
		LoggerLoad.info("Clicking Operations Stack Link");
		stack.clickOperationsStackLink();
		stack.Capture_ScreenShot();
	}

	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
		LoggerLoad.info("Directed Operations in Stack Page");
	}

	@Given("The user is on the Operations in Stack page after logged in")
	public void the_user_is_on_the_operations_in_stack_page_after_logged_in() {
		LoggerLoad.info("User is in Operations in Stack Page");
	}

	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		LoggerLoad.info("Stack - Clicking Implementation Link");
		stack.clickImplementationLink();
	}

	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
		LoggerLoad.info("Directed to Implementation Page");
	}

	@Given("The user is on {string} after logged in")
	public void the_user_is_on_after_logged_in(String string) {
		LoggerLoad.info("User is on Stack Implementation page");
	}

	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		LoggerLoad.info("Stack - Clicking Applications Link");
		stack.clickApplicationsLink();
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
		LoggerLoad.info("Directed to Applications Page");
	}

	@Given("The user is on the Applications stack page after logged in")
	public void the_user_is_on_the_applications_stack_page_after_logged_in() {
		LoggerLoad.info("User is on the Applications Stack Page");
	}

	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		LoggerLoad.info("Stack - Clicking Practice Questions Link");
		stack.clickPracticeQuestionsLink();
	}
	

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_directed_to_stack_page() {
		LoggerLoad.info("Directed to Stack Page");
	}

	@Then("The user should be presented with error message in stack page")
	public void the_user_should_be_presented_with_error_message_in_stack_page() {
		LoggerLoad.info("Stack - Display error message");
		stack.displayErrorMessage();
	}
	
	@Then("The user should be directed to Practice Questions Page")
	public void the_user_should_be_directed_to_practice_questions_page() {
		LoggerLoad.info("Directed to Practice Questions Page");
		Assert.assertTrue(stack.compareTitle().contentEquals("Practice Questions"));
		stack.clickSignout();
	}

}
