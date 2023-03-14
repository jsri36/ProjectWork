package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.constants.Constants;
import com.dsalgo.pageobjects.ArrayPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array_Stepdef {
	
	private static final Logger LOGGER = LogManager.getLogger(Array_Stepdef.class);
	ArrayPage arraypage = null;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	arraypage = new ArrayPage(driver);
	}
	
	
	//TC 01
	@Given("Signin page of DS Algo portal")
	public void signin_page_of_ds_algo_portal() {
		
		LOGGER.info("Launching a browser");
		driver.get(Constants.APP_URL);
		arraypage.presteps();
	   
	}

	@When("The user enter valid credential")
	public void the_user_enter_valid_credential() throws IOException {
		
		arraypage.userlogin();
	    
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		
	    arraypage.verifyhomepage();
	}

	@When("The user select Array item from the drop down menu")
	public void the_user_select_array_item_from_the_drop_down_menu() {
		
		arraypage.selectoption();
	    
	}

	@Then("The user be directed to ARRAY Data Structure Page")
	public void the_user_be_directed_to_array_data_structure_page() {
		
		arraypage.verifyarraypage();
	   
	}

	//TC 02
	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() throws AWTException, IOException {
		
		arraypage.clickonarraypage();
		arraypage.Capture_ScreenShot();
	}

	
	@Then("The user should be redirected to Arrays in Python page {string}")
	public void the_user_should_be_redirected_to_arrays_in_python_page(String url) {
		
		arraypage.verifypage(url);
	   
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		
	    arraypage.clickontryherebutton();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test(String url) {
		
		LOGGER.info("user in editor page");
		arraypage.verifypage(url);
	   
	}
	
	@Then("The user enter invalid python code and click Run button")
	public void the_user_enter_invalid_python_code_and_click_run_button() throws InterruptedException, IOException {
	    arraypage.invalidpythoncode();
	    arraypage.clickonrunbutton();
	    arraypage.Alert_Accept();
	}


	@When("The user enter valid python code in tryEditor from sheet")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet() throws IOException, InterruptedException {
	    
		LOGGER.info("User enter a single line of python code");
		arraypage.TryeditorPage();
		arraypage.Pythoncode();
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws InterruptedException {
	   
		arraypage.clickonrunbutton();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		
		arraypage.output();
	    
	}

	
	//TC03
	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
	    
		arraypage.clickonarraylist();
	}

	@Then("The user should be redirected to Arrays Using List page {string}")
	public void the_user_should_be_redirected_to_arrays_using_list_page(String url) {
		
	    arraypage.verifypage(url);
		
	}

	//TC04
	@When("The user clicks Basic Operation List link")
	public void the_user_clicks_basic_operation_list_link() {
		
	    arraypage.clickOnBasicOpertaion();
	}
	

	@Then("The user should be redirected to Basic Operation List page {string}")
	public void the_user_should_be_redirected_to_basic_operation_list_page(String url) {
		
		arraypage.verifypage(url);
		
	   	}
	
//TC05
	@When("The user clicks Application of Array link")
	public void the_user_clicks_application_of_array_link() {
		
	    arraypage.clickOnApplicationsofArray();
	}

	@Then("The user should be redirected to Application of Array page {string}")
	public void the_user_should_be_redirected_to_application_of_array_page(String url) {
		
		arraypage.verifypage(url);
	    	}

	//TC06
	
	@Given("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
	    arraypage.clickonPracticeQuestions();
		
	}

	@And("The user should be redirected to Practice page {string}")
	public void the_user_should_be_redirected_to_practice_page(String url) {
		arraypage.verifypage(url);
	   
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		arraypage.clickonSearchtheArray();
	   
	}

	@Given("The user should be redirected to question page {string}")
	public void the_user_should_be_redirected_to_question_page(String url) {
		arraypage.verifypage(url);
	
	}

	@When("user write the valid python code for search the array")
	public void user_write_the_valid_python_code_for_search_the_array() throws IOException, InterruptedException {
		
	   arraypage.Cleartext();
	   //arraypage.codeforsearcharray();
	   arraypage.Pythoncode();
	}

	@When("click the Run button")
	public void click_the_run_button() throws InterruptedException {
	    arraypage.clickonrunbutton();
	}

	@When("user verify the message")
	public void user_verify_the_message() {
		arraypage.output();
	}

	@When("clicks the Submit Button")
	public void clicks_the_submit_button() throws InterruptedException {
	    //arraypage.submitonqns();
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		
	    arraypage.output();
	}

	//TC07
	@When("The user clicks the  Max Consecutive ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		
		arraypage.clickonMaxConsecutiveones();
	    
	}
	@When("user write the valid python code for Max Consecutive ones page")
	public void user_write_the_valid_python_code_for_max_consecutive_ones_page() throws IOException, InterruptedException {
		
		arraypage.Cleartext();
		//arraypage.codeformaxconservno();
		arraypage.Pythoncode();
	    
	}

	//TC08
	@When("The user clicks the find odd or even number link")
	public void the_user_clicks_the_find_odd_or_even_number_link() {
				
	    arraypage.clickonfindoddoreven();
	}
	@When("user write the valid python code for find odd or even number page")
	public void user_write_the_valid_python_code_for_find_odd_or_even_number_page() throws IOException, InterruptedException {
	    
		arraypage.Cleartext();
		//arraypage.codeforoddoreven();
		arraypage.Pythoncode();
	}

	//TC09
	@When("The user clicks the Square of Sorted Array link")
	public void the_user_clicks_the_square_of_sorted_array_link() {
	   
		arraypage.clickonSquareonSortedArray();
		
	}
	
	@When("user write the valid python code for Square of Sorted Array link")
	public void user_write_the_valid_python_code_for_square_of_sorted_array_link() throws IOException, InterruptedException {
	    
		arraypage.Cleartext();
		//arraypage.codeforsortedSqauare();
		arraypage.Pythoncode();
	}
	
	@Then("The user will signout successfully")
	public void the_user_will_signout_successfully() {
	   arraypage.usersignout();
		
	}



	
	
}
