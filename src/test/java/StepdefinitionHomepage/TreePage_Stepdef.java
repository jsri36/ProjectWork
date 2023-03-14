package StepdefinitionHomepage;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.dsalgo.pageobjects.*;
import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.constants.*;

public class TreePage_Stepdef {
	
	private static final Logger LOGGER = LogManager.getLogger(TreePage_Stepdef.class);
	
	static TreePage Tree;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	Tree = new TreePage(driver);
	}
	
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		
		Tree.SignInButtonClick();
		LOGGER.info("User is on Sigin in Page");
		String ExpectedURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpectedURL);
		assertEquals(Constants.SiginPageUrl, ExpectedURL);
		
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String Username, String Password) {
		
		LOGGER.info("User enters valid username as "+Username+" and password as "+Password);
		Tree.Enter_Valid_Inputs(Username, Password);
		Tree.LoginButtonClick();
		
	}

	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		
		LOGGER.info("User is on the "+string+ " Page after logged in");
		
	}

	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
		
		LOGGER.info("The user select Tree item from the drop down menu");
		Tree.MainDropDownClick();
		Tree.TreeDropDownClick();
		
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		
		LOGGER.info("The user should be directed to Tree Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.TreePageUrl, ExpPgURL);
		
	}

	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		
		LOGGER.info("The user clicks on the Overview of Trees link");
		Tree.OverviewofTreesClick();
		
	}

	@Then("The user should then be directed to Overview of Trees Page")
	public void the_user_should_then_be_directed_to_overview_of_trees_page() {
		
		LOGGER.info("The user should then be directed to Overview of Trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActOverviewOfTreesURL, ExpPgURL);
		
	}

	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
		
		LOGGER.info("The user clicks "+string+ " button in "+string2+" page");
		Tree.TryHereButtonClick();
		
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		LOGGER.info("The user should be redirected to a page having an tryEditor with a Run button to test");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTryEditorPgURL, ExpPgURL);
		
	}

	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		
		LOGGER.info("The user is in trees page having an tryEditor with a Run button to test");
		
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException, InterruptedException {
		
		LOGGER.info("User enter valid inputs from Excel");
		Tree.Enter_Valid_SheetInputs(Sheetname, Rownumber);
		
	}

	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
		
		LOGGER.info("The user clicks on Run button after Entering valid python code in trees tryEditor");
		Tree.RunButtonClick();
		
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() throws AWTException, IOException {
		
		Tree.Capture_ScreenShot();
		LOGGER.info("The user should be presented with Run output for trees");
		String ExpRunOutput = Tree.Get_Output_Message();
		Tree.Page_Refresh();
		LOGGER.info("Output Message : " + ExpRunOutput);
		assertEquals(Constants.ActualOutputMsg, ExpRunOutput);
		
	}

	@When("The user gets invalid input from sheet {string} and {int} in trees")
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException, InterruptedException {
		
		LOGGER.info("User enter invalid inputs from Excel");
		Tree.Enter_Valid_SheetInputs(Sheetname, Rownumber);
		
	}

	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
		
		LOGGER.info("The user clicks on Run button after Entering invalid python code in trees tryEditor");
		Tree.RunButtonClick();
		
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
		
		LOGGER.info("The user should get the error message for trees");
		String AlertMsg = Tree.Get_Alert_Message();
		Tree.Alert_Accept();
		Tree.Navigate_To_TreeUrl();
		LOGGER.info("Output Message : " + AlertMsg);
		assertEquals("NameError: name '"+Tree.Pythoncode+"' is not defined on line 1", AlertMsg);
		
	}

	@When("The user clicks Terminologies button")
	public void the_user_clicks_terminologies_button() {
		
		LOGGER.info("The user clicks on the Terminologies link");
		Tree.TerminologiesClick();
		
	}

	@Then("The user should be directed to Terminologies Page")
	public void the_user_should_be_directed_to_terminologies_page() {
		
		LOGGER.info("The user should then be directed to Terminologies Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTerminologiesURL, ExpPgURL);
		
	}

	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
		LOGGER.info("The user clicks on the Types of Trees link");
		Tree.TypesofTreesClick();
		
	}
	
	@Then("The user should be directed to Types of Trees Page")
	public void the_user_should_be_directed_to_types_of_trees_page() {
		
		LOGGER.info("The user should then be directed to Types of Trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTypesOfTreesURL, ExpPgURL);
		
	}

	@When("The user clicks Tree Traversals button")
	public void the_user_clicks_tree_traversals_button() {
		
		LOGGER.info("The user clicks on the Tree Traversals link");
		Tree.TreeTraversalsClick();
		
	}

	@Then("The user should be directed to Tree Traversals Page")
	public void the_user_should_be_directed_to_tree_traversals_page() {
		
		LOGGER.info("The user should then be directed to Tree Traversals Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTreeTraversalsURL, ExpPgURL);
		
	}

	@When("The user clicks on the Traversals Illustration button")
	public void the_user_clicks_on_the_traversals_illustration_button() {
		
		LOGGER.info("The user clicks on the Traversals Illustration link");
		Tree.TraversalsIllustrationClick();
		
	}
	
	@Then("The user should be directed to Traversals Illustration Page")
	public void the_user_should_be_directed_to_traversals_illustration_page() {
		
		LOGGER.info("The user should then be directed to Traversals Illustration Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTraversalsIllustrationURL, ExpPgURL);
		
	}

	@When("The user clicks on the Binary Trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
		
		LOGGER.info("The user clicks on the Binary Trees link");
		Tree.BinaryTreesClick();
		
	}

	@Then("The user should be directed to Binary Trees Page")
	public void the_user_should_be_directed_to_binary_trees_page() {
		
		LOGGER.info("The user should then be directed to Binary Trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActBinaryTreesURL, ExpPgURL);
		
	}

	@When("The user clicks on the types of binary trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
		
		LOGGER.info("The user clicks on the types of binary trees link");
		Tree.TypesofBinaryTreesClick();
		
	}

	@Then("The user should be directed to types of binary trees Page")
	public void the_user_should_be_directed_to_types_of_binary_trees_page() {
		
		LOGGER.info("The user should then be directed to types of binary trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActTypesOfBinaryTreesURL, ExpPgURL);
		
	}

	@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
		
		LOGGER.info("The user clicks on the Implementation in Python link");
		Tree.ImplementationinPythonClick();
		
	}
	
	@Then("The user should be directed to Implementation in Python Page")
	public void the_user_should_be_directed_to_implementation_in_python_page() {
		
		LOGGER.info("The user should then be directed to Implementation in Python Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActImplementationInPythonURL, ExpPgURL);
		
	}

	@When("The user clicks on the binary tree traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
		
		LOGGER.info("The user clicks on the binary tree traversals link");
		Tree.BinaryTreeTraversalsClick();
		
	}
	
	@Then("The user should be directed to Binary Tree Traversals Page")
	public void the_user_should_be_directed_to_Binary_Tree_Traversals_page() {
		
		LOGGER.info("The user should then be directed to Binary Tree Traversals Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActBinaryTreeTraversalsURL, ExpPgURL);
		
	}

	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
		
		LOGGER.info("The user clicks on the Implementation of Binary Trees link");
		Tree.ImplementationofBinaryTreesClick();
		
	}
	       
	@Then("The user should be directed to Implementation of Binary Trees Page")
	public void the_user_should_be_directed_to_implementation_of_binary_trees_page() {
		
		LOGGER.info("The user should then be directed to Implementation of Binary Trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActImplementationofBinaryTreesURL, ExpPgURL);
		
	}

	@When("The user clicks on the Applications of Binary trees button")
	public void the_user_clicks_on_the_applications_of_binary_trees_button() {
		
		LOGGER.info("The user clicks on the Applications of Binary trees link");
		Tree.ApplicationsofBinaryTreesClick();
		
	}
	
	@Then("The user should be directed to Applications of Binary trees Page")
	public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
		
		LOGGER.info("The user should then be directed to Applications of Binary trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActApplicationsofBinaryTreesURL, ExpPgURL);
		
	}

	@When("The user clicks on the Binary Search Trees button")
	public void the_user_clicks_on_the_binary_search_trees_button() {
		
		LOGGER.info("The user clicks on the Binary Search Trees link");
		Tree.BinarySearchTreesClick();
		
	}
	
	@Then("The user should be directed to Binary Search Trees Page")
	public void the_user_should_be_directed_to_binary_search_trees_page() {
		
		LOGGER.info("The user should then be directed to Binary Search Trees Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActBinarySearchTreesURL, ExpPgURL);
		
	}

	@When("The user clicks on the Implementation Of BST button")
	public void the_user_clicks_on_the_implementation_of_bst_button() {
		
		LOGGER.info("The user clicks on the Implementation Of BST link");
		Tree.ImplementationOfBSTClick();
		
	}
	
	@Then("The user should be directed to Implementation Of BST Page")
	public void the_user_should_be_directed_to_implementation_of_BST_page() {
		
		LOGGER.info("The user should then be directed to Implementation Of BST Page");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActImplementationOfBSTURL, ExpPgURL);
		
	}

	@When("The user clicks on the Practice Questions in Overview of Trees")
	public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
		
		LOGGER.info("The user clicks on the Practice Questions Link in Overview of Trees");
		Tree.PracticeQuestionsClick();
		
	}

	@Then("The user should be redirected to Practice Questions of tree page")
	public void the_user_should_be_redirected_to_practice_questions_of_tree_page() {
		
		LOGGER.info("The user should be redirected to Practice Questions in Overview of Trees page ");
		String ExpPgURL = Tree.GetCurrentUrl();
		LOGGER.info("URL of current page is : " + ExpPgURL);
		assertEquals(Constants.ActPracticeQuestionsURL, ExpPgURL);
		Tree.signout();
		Tree.Close_Browser();
	}
	
	
}