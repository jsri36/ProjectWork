package StepdefinitionHomepage;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.constants.Constants;
import com.dsalgo.pageobjects.GraphPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPage_Stepdef {
	
	
	
	
	private static final Logger Logger = LogManager.getLogger(GraphPage_Stepdef.class);
	GraphPage graph;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	graph = new GraphPage(driver);
	}
	
	//TC_01
	@Given("Signin with user credential")
	public void signin_with_user_credential() throws IOException {
		
		Logger.info("User enters login credentail");
		driver.get(Constants.APP_URL);
		graph.presteps();
		graph.userlogin();
	   
	}

	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
		
		graph.selectoption();
	   
	}

	@When("The user be directed to Graph from Data Structure Page")
	public void the_user_be_directed_to_graph_from_data_structure_page() {
	    
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(Constants.Graphurl,currenturl );
		
	}

	@Then("verify user is on Graph page")
	public void verify_user_is_on_graph_page() {
		
		Logger.info("User is on Graph Page");
	   
	}
	
	
//TC_02
	@Given("User clicks Graph hyperlink")
	public void user_clicks_graph_hyperlink() {
		
		graph.clickonGraph();
	    
	}

	
	@Given("user clicks on tryhere button")
	public void user_clicks_on_tryhere_button() {
	    graph.clickonTryherebutton();
		
	}

	@Given("verify user is redirected to tryeditor page")
	public void verify_user_is_redirected_to_tryeditor_page() {
	   
		graph.verifypage();
	}

	@When("user enter invalid python code and click Run button")
	public void user_enter_invalid_python_code_and_click_run_button() throws InterruptedException, IOException {
	    graph.invalidpythoncode();
	    graph.ClickonRunButton();
	}

	@When("user handle the alert")
	public void user_handle_the_alert() {
		
		graph.Alert_Accept();
	    
	}

	@When("user enter valid python code and click the Run button")
	public void user_enter_valid_python_code_and_click_the_run_button() throws InterruptedException, IOException {
		graph.TryeditorPage();
		graph.Validpythoncode();
		graph.ClickonRunButton();
	}

	@Then("The output success message should be displayed")
	public void the_output_success_message_should_be_displayed() {
	    graph.output();
	}

	
	//TC_03
	@Given("User clicks Graph Representation hyperlink")
	public void user_clicks_graph_representation_hyperlink() throws AWTException, IOException {
		
		driver.navigate().to(Constants.Graphurl);
	    graph.clickonGraphRepresentation();
	    graph.Capture_ScreenShot();
		
	}

	@Given("verify user is on Graph Representation page")
	public void verify_user_is_on_graph_representation_page() {
	   
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(Constants.GraphRepresentationURL,currenturl );
	}

	
	//TC_04
	@Given("User clicks Practice page hyperlink")
	public void user_clicks_practice_page_hyperlink() {
		
		driver.navigate().to(Constants.GraphRepresentationURL);
		graph.clickOnPracticeQns();
	   
	}

	@When("Verify user is on Practice page")
	public void verify_user_is_on_practice_page() {
		
		Logger.info("User is practice page");
	    
	}

	@Then("User Signout from Application")
	public void user_signout_from_application() {
		
		graph.usersignout();
		
	    	}

	
	

}
