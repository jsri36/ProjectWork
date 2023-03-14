package com.dsalgo.pageobjects;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dsalgo.constants.Constants;

public class QueuePage {

	public static WebDriver driver;
	
	By name = By.name("username");
	By pass = By.name("password");
	By login = By.xpath("//input[@value='Login']");
	By dropdown_menu = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By queue_dropdown = By.xpath("//div[@class='dropdown-menu show']/a[4]");
	By imp_queue = By.linkText("Implementation of Queue in Python");
	By imp_using_collections = By.linkText("Implementation using collections.deque");
	By imp_using_array = By.linkText("Implementation using array");
	By queue_operations = By.linkText("Queue Operations");
	By practice_questions = By.linkText("Practice Questions");
	By tryhere_btn = By.xpath("//a[@class='btn btn-info']");
	By editor_box = By.xpath("//*[@id='answer_form']/div/div//textarea");
	By oldcode = By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre/span/span");
	By run_btn = By.xpath("//*[@id='answer_form']/button");
	By output = By.id("output");
	By logout = By.xpath("//a[@href='/logout']");
	
	public QueuePage(WebDriver driver)
	{
		QueuePage.driver = driver;
	}	
	public void openPage()
	{
		driver.navigate().to(Constants.SIGNIN);
	}
	public void validUsernamePassword(String username,String password)
	{
		driver.findElement(name).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	}
	public void clickSignin()
	{
		driver.findElement(login).click();
	}
	public String compareTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
    } 
	public void selectDropdown()
	{
		driver.findElement(dropdown_menu).click();
		driver.findElement(queue_dropdown).click();	
	}
	public void clickImplementationOfQueueLink()
	{
		driver.findElement(imp_queue).click();
	}
	public void clickTryHereButton()
	{
		driver.findElement(tryhere_btn).click();
	}
	public void getValidInputFromExcelSheet(int RowNumber) throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/ExcelInput.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("pythonCode");
		
		XSSFRow row = sheet.getRow(RowNumber);
        String code = row.getCell(0).getStringCellValue();
     
        driver.findElement(editor_box).sendKeys(code);
        
		workbook.close();
	}
	public void clickRunButton()
	{
		driver.findElement(run_btn).click();
	}
	public void displayOutput()
	{
		WebElement outputtext = driver.findElement(output);
		String getoutput = outputtext.getText();
		if(!getoutput.isBlank())
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
	public void getInvalidInputFromExcelSheet(int RowNumber) throws IOException, InterruptedException
	{
		String path = System.getProperty("user.dir")+"/src/test/resources/testdata/ExcelInput.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet("pythonCode");
		
		XSSFRow row = sheet.getRow(RowNumber);
        String code = row.getCell(0).getStringCellValue();
        
        WebElement clearbox = driver.findElement(oldcode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clearbox.click();       
        driver.findElement(editor_box).sendKeys(Keys.chord(Keys.CONTROL,"a"),code);
		workbook.close();
	}
	public void displayErrorMessage()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement outputtext = driver.findElement(output);
		String getoutput = outputtext.getText();
		if(getoutput.isBlank())
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		driver.navigate().to(Constants.QUEUE);
	}
	public void clickImplementationUsingCollectionsLink()
	{
		driver.findElement(imp_using_collections).click();
	}
	public void clickImplementationUsingArrayLink()
	{
		driver.findElement(imp_using_array).click();
	}
	public void clickQueueOperationsLink()
	{
		driver.findElement(queue_operations).click();
	}
	public void navigateToQueueOpPage()
	{
		driver.navigate().to(Constants.QUEUE_OP);
	}
	public void clickPracticeQuestionsLink()
	{
		driver.findElement(practice_questions).click();
	}
	public void clickSignout()
	{
		driver.findElement(logout).click();
	}
public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\QueuePage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}
	
	
	
	
}
