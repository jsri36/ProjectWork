package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.constants.Constants;
import com.dsalgo.pageobjects.LinkedListPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList_Stepdef {
	
	
	private static final Logger LOGGER = LogManager.getLogger(LinkedList_Stepdef.class);
	LinkedListPage Linkedlistpage = null;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	Linkedlistpage = new LinkedListPage(driver);
	}
	
	//TC 01
	
	@Given("user is on Signin page of DS Algo portal")
	public void user_is_on_signin_page_of_ds_algo_portal() {
		LOGGER.info("Launching a browser");
		driver.get(Constants.APP_URL);
		Linkedlistpage.presteps();
		
	}
	@When("user enter valid credential")
	public void user_enter_valid_credential() {
		Linkedlistpage.userlogin();
	}
	@Then("user redirected to home")
	public void user_redirected_to_home() {
		Linkedlistpage.verifyhomepage();
		LOGGER.info("user verifies home page");
	    
	}
	
	@When("The user select LinkedList item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
		Linkedlistpage.selectoption();
		LOGGER.info("user click on linked list option");
		
		
	}
	
	@Then("The user be directed to LinkedList Data Structure Page {string}")
	public void the_user_be_directed_to_linked_list_data_structure_page(String url) {
		
		Linkedlistpage.verifyurl(url);
	}
	

	
	//TC02

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() throws AWTException, IOException {
		
		Linkedlistpage.clickonIntroductionLink();
		LOGGER.info("user clicks the Introduction link");
		Linkedlistpage.Capture_ScreenShot();
	    
	}
	@Then("The user should be redirected to Introduction page {string}")
	public void the_user_should_be_redirected_to_introduction_page(String url) {
	    
		Linkedlistpage.verifyurl(url);
	}
	
	@When("user clicks Try Here button")
	public void user_clicks_try_here_button() {
		Linkedlistpage.clickontryherebutton();
		LOGGER.info("user click clicks on try here button");
	    
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test {string}")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test(String url) {
		Linkedlistpage.verifyurl(url);
		LOGGER.info("user verifies a code");
	}
	
	@Then("Enter invalid python code and click Run button handle the alert")
	public void enter_invalid_python_code_and_click_run_button_handle_the_alert() throws InterruptedException, IOException {
		Linkedlistpage.invalidpythoncode();
		Linkedlistpage.clickonrunbutton();
		Linkedlistpage.Alert_Accept();
		
	}

	@When("user enter valid python code in tryEditor from sheet")
	public void user_enter_valid_python_code_in_try_editor_from_sheet() throws IOException, InterruptedException {
		Linkedlistpage.TryeditorPage();
		Linkedlistpage.pythoncode();
		LOGGER.info("user enter python code through excel sheet");
	    
	}

	@When("user clicks on run button")
	public void user_clicks_on_run_button() {
		Linkedlistpage.clickonrunbutton();
		LOGGER.info("user clicks Run button");
	    
	}

	@Then("user should be presented with Run result")
	public void user_should_be_presented_with_run_result() {
		Linkedlistpage.output();
	    
	}




	//TC03
	@When("The user clicks creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		
		Linkedlistpage.clickoncreatinglinkedlistLink();
		LOGGER.info("user clicks on creating linked list link");
	   
	}
	
	@Then("The user should be redirected to creating Linked List link {string}")
	public void the_user_should_be_redirected_to_creating_linked_list_link(String url) {
		
		Linkedlistpage.verifyurl(url);
		LOGGER.info("user verifies a page");
	    
	}



	//TC04
	
	@When("The user clicks Types of Linked List page")
	public void the_user_clicks_types_of_linked_list_page() {
	    Linkedlistpage.clickontypeoflinkedlistLink();
	    LOGGER.info("user click on Types of Linked List Page");
	}

	@Then("The user should be redirected to Types of Linked List page {string}")
	public void the_user_should_be_redirected_to_types_of_linked_list_page(String url) {
		
		Linkedlistpage.verifyurl(url);
	   
	}

	//TC05
	@When("The user clicks Implement Linked List in python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		
		Linkedlistpage.clickonimplementlistLink();
		LOGGER.info("user click on Implement Linked List Page");
	}
	
	@Then("The user should be redirected to Implement Linked List page {string}")
	public void the_user_should_be_redirected_to_implement_linked_list_page(String url) {
	    Linkedlistpage.verifyurl(url);
	}


//tc06
	@When("The user clicks on Traversal page")
	public void the_user_clicks_on_traversal_page() {
	   
		Linkedlistpage.clickontraversallink();
		LOGGER.info("user click on Travesal link");
	}

	@Then("The user should be redirected to Traversal page page {string}")
	public void the_user_should_be_redirected_to_traversal_page_page(String url) {
	    
		Linkedlistpage.verifyurl(url);
	}
	
//tc07
	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		Linkedlistpage.clickonInsertionlink();
		LOGGER.info("user click on Insertion link");
	    
	}

	@Then("The user should be redirected to Insertion page {string}")
	public void the_user_should_be_redirected_to_insertion_page(String url) {
		
		Linkedlistpage.verifyurl(url);
	    
	}
	

	//tC08
	
	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		
		Linkedlistpage.clickondeletionlink();
		LOGGER.info("user click on Deletion link");
	    
	}
	
	@Then("The user should be redirected to Deletion page {string}")
	public void the_user_should_be_redirected_to_deletion_page(String url) {
		Linkedlistpage.verifyurl(url);
	}
	
	//Tc09
	
	@Given("user clicks Practice Questions link")
	public void user_clicks_practice_questions_link() {
	    Linkedlistpage.clickonpracticeQuestion();
	    LOGGER.info("user click on Practice Question");
	}

	@Given("user should be redirected to Practice page {string}")
	public void user_should_be_redirected_to_practice_page(String url) {
	    
		Linkedlistpage.verifyurl(url);
	}

	@When("user clicks signout button")
	public void user_clicks_signout_button() {
		
		Linkedlistpage.clickonsignoutbtn();
		LOGGER.info("user clicks on signout button");
	}

	@Then("user successfully signed out")
	public void user_successfully_signed_out() {
	    LOGGER.info("user successfully logged out");
	}


}
