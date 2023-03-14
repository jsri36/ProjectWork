package StepdefinitionHomepage;

import com.dsalgo.Webdriver_Manager.DriverManager;
import com.dsalgo.pageobjects.*;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePage_StepDef {

	
	
	private static final Logger LoggerLoad = LogManager.getLogger(QueuePage_StepDef.class);
	QueuePage queue;
	WebDriver driver=null;
	{
	driver = DriverManager.getDriver();
	queue = new QueuePage(driver);
	}
	
	@When("The user clicks the Queue item from drop down menu")
	public void the_user_clicks_the_queue_item_from_drop_down_menu() {
		LoggerLoad.info("Selecting Queue from drop down");
		queue.selectDropdown();
	}
	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		LoggerLoad.info("Directed to Queue Data Structure Page");
		//Assert.assertTrue(queue.compareTitle().contentEquals("Queue"));
	}
	@Given("The user is in Queue Page")
	public void the_user_is_in_queue_page() {
		LoggerLoad.info("User is in the Queue page");
		//Assert.assertTrue(queue.compareTitle().contentEquals("Queue"));
	}
	@When("The user clicks on Implementation of queue in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() throws AWTException, IOException {
		LoggerLoad.info("Clicking Implementation of queue in Python Link");
		queue.clickImplementationOfQueueLink();
		queue.Capture_ScreenShot();
	}
	@Then("The user should be directed to Implementation of queue in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
		LoggerLoad.info("Directed to Implementation of queue in Python Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation of Queue in Python"));
	}
	@Given("The user is in Implementation of queue in Python Page")
	public void the_user_is_in_implementation_of_queue_in_python_page() {
		LoggerLoad.info("User is in Implementation of Queue in Python page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation of Queue in Python"));
	}
	@Then("The user gets an Error Message")
	public void the_user_gets_an_error_message() {
		LoggerLoad.info("Queue - Display error message");
		queue.displayErrorMessage();
	}
	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
		LoggerLoad.info("Queue - Clicking Implementation using collections.deque Link");
		queue.clickImplementationUsingCollectionsLink();
	}
	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		LoggerLoad.info("Directed to Implementation using collections deque Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using collections.deque"));
	}
	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
		LoggerLoad.info("User is in Implementation using collections.deque page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using collections.deque"));
	}
	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
		LoggerLoad.info("Queue - Clicking Implementation using array Link");
		queue.clickImplementationUsingArrayLink();
	}
	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		LoggerLoad.info("Directed to Implementation using array Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using array"));
	}
	@Given("The user in Implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		LoggerLoad.info("User is in Implementation using array page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Implementation using array"));	
	}
	@When("The user clicks on Queue Operations link")
	public void the_user_clicks_on_queue_operations_link() {
		LoggerLoad.info("Queue - Clicking Queue Operations Link");
		queue.clickQueueOperationsLink();
	}
	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		LoggerLoad.info("Directed to Queue Operations Page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue Operations"));
	}
	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
		LoggerLoad.info("User is in Queue Operations page");
		Assert.assertTrue(queue.compareTitle().contentEquals("Queue Operations"));
	}
	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		LoggerLoad.info("Queue - navigates to QueueOp page");
		queue.navigateToQueueOpPage();
	}
	@When("The user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		LoggerLoad.info("Queue - Clicking Practice Questions Link");
		queue.clickPracticeQuestionsLink();
	}
	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		LoggerLoad.info("Queue - Directed to Practice Questions Page");
		//Assert.assertTrue(queue.compareTitle().contentEquals("Practice Questions"));
		queue.clickSignout();
	}
}
