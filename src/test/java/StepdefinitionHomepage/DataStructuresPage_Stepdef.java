package StepdefinitionHomepage;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.dsalgo.pageobjects.*;
import com.dsalgo.constants.*;


public class DataStructuresPage_Stepdef {
	
	private static final Logger LoggerLoad = LogManager.getLogger(DataStructuresPage_Stepdef.class);
	static DataStructuresPage DataStructures;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	DataStructures = new DataStructuresPage(driver);
	}
	
	
	
	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		
		LoggerLoad.info("The user clicks the "+string+" button in Data Structure Page introduction Panel");
		DataStructures.DS_GetStartedButtonClick();
	}

	@Then("The user be directed to {string} page")
	public void the_user_be_directed_to_page(String string) throws InterruptedException {
		
		LoggerLoad.info("The user be directed to "+string+" page");
		Thread.sleep(100);
		String ExpPgURL = DataStructures.GetCurrentUrl();
		LoggerLoad.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.DataStructuresURL, ExpPgURL);

	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		
		LoggerLoad.info("The user clicks Time Complexity link");
		DataStructures.TimeComplexityLinkClick();

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) throws InterruptedException {
		
		LoggerLoad.info("The user be redirected to "+string+" page");
		Thread.sleep(100);
		String ExpPgURL = DataStructures.GetCurrentUrl();
		LoggerLoad.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.TimeComplexityURL, ExpPgURL);
		
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		
		LoggerLoad.info("The user clicks "+string+ " button on "+string2+" page");
		DataStructures.TryHereButtonClick();

	}

	@Given("The user is in page having an tryEditor with a Run button to test")
	public void the_user_is_in_page_having_an_try_editor_with_a_run_button_to_test() {

		LoggerLoad.info("The user is in page having an tryEditor with a Run button to test");
		
	}

	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException {

		LoggerLoad.info("User enter valid inputs from Excel");
		DataStructures.Enter_Valid_SheetInputs(Sheetname, Rownumber);
		
	}

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {

		LoggerLoad.info("The user clicks on Run button after Entering valid python code in tryEditor");
		DataStructures.RunButtonClick();
		
	}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		
		LoggerLoad.info("The user should be presented with Run output for trees");
		String ExpRunOutput = DataStructures.Get_Output_Message();
		DataStructures.Page_Refresh();
		LoggerLoad.info("Output Message : " + ExpRunOutput);
		assertEquals(Constants.ActualOutputMsg, ExpRunOutput);
		
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException {

		LoggerLoad.info("User enter invalid inputs from Excel");
		DataStructures.Enter_Valid_SheetInputs(Sheetname, Rownumber);
		
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() throws AWTException, IOException {
		
		LoggerLoad.info("The user should get the error message for trees");
		String AlertMsg = DataStructures.Get_Alert_Message();
		LoggerLoad.info("Output Message : " + AlertMsg);
		//assertEquals("NameError: name '"+DataStructures.Pythoncode+"' is not defined on line 1", AlertMsg);
		DataStructures.Capture_ScreenShot();
		DataStructures.Alert_Accept();
		DataStructures.Navigate_To_DataStructuresUrl();
		DataStructures.SignOutButtonClick();
	}

}
