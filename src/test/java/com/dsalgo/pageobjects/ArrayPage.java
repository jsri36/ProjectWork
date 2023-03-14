package com.dsalgo.pageobjects;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ArrayPage {

	WebDriver driver;

	public ArrayPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	String arrayurl = "https://dsportalapp.herokuapp.com/array/";
	String practiceurl = "https://dsportalapp.herokuapp.com/array/practice";
	By arrayinpythonlink = By.xpath("//a[@href='arrays-in-python']");
	By tryherelink = By.xpath("//a[@href='/tryEditor']");
	By alertMessage = By.xpath("//div[@class='alert alert-primary']");
	By textarea = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By Runbutton = By.xpath("//button[@type='button']");
	By submitbutton = By.xpath("//button[@type='submit']");
	By arrayusinglist = By.xpath("//a[@href='arrays-using-list']");
	By basicoperationlink = By.xpath("//a[@href='basic-operations-in-lists']");
	By Applicationslink = By.xpath("//a[@href='applications-of-array']");
	By PracticeQuestion = By.xpath("//a[@href='/array/practice']");
	By question1 = By.xpath("//a[@href='/question/1']");
	By question2 = By.xpath("//a[@href='/question/2']");
	By question3 = By.xpath("//a[@href='/question/3']");
	By question4 = By.xpath("//a[@href='/question/4']");
	By GetStartedbutton = By.xpath("//button[@class='btn']");
	By signinbutton = By.xpath("//a[@href='/login']");
	By Username = By.id("id_username");
	By Password = By.id("id_password");
	By loginbutton = By.xpath("//input[@type='submit']");
	By dropdown = By.xpath("//div[@class='nav-item dropdown']");
	By selectopt = By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By output = By.xpath("//pre[@id='output']");
	By signoutbtn = By.xpath("//a[@href='/logout']");
	 String tryeditorurl="https://dsportalapp.herokuapp.com/tryEditor";

	
     
	public void presteps() {

		driver.findElement(GetStartedbutton).isDisplayed();
		driver.findElement(GetStartedbutton).click();
		driver.findElement(signinbutton).click();

	}

	public void userlogin() throws IOException {

		// driver.findElement(Username).sendKeys("LathaRajini");
		// .findElement(Password).sendKeys("Latha123");
		// driver.findElement(loginbutton).click();

		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdataforusername.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);

		for (int i = 1; i <sheet.getLastRowNum(); i++) {
			try {
				System.out.println("Row Number " + i + "col " + 0 + "total sheet rows " + sheet.getLastRowNum());
				cell = sheet.getRow(i).getCell(0);
				driver.findElement(Username).sendKeys(cell.getStringCellValue());

				System.out.println("Row Number " + i + "col " + 1);
				cell = sheet.getRow(i).getCell(1);
				driver.findElement(Password).sendKeys(cell.getStringCellValue());

				driver.findElement(loginbutton).click();

			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void verifyhomepage() {
		// TODO Auto-generated method stub

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("home")) {
			System.out.println("user in home page");
		} else {
			System.out.println("user in some other page");
		}

	}

	public void selectoption() {

		driver.findElement(dropdown).click();
		driver.findElement(selectopt).click();
	}

	public void verifyarraypage() {

		String actualurl = driver.getCurrentUrl();
		if (actualurl.contains("array")) {
			System.out.println("user in array page");
		} else {
			System.out.println("user in some other page");
		}

	}

	public void clickonarraypage()

	{

		driver.findElement(arrayinpythonlink).click();

	}

	public void verifypage(String url) {
		// TODO Auto-generated method stub
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, url);

	}

	public void clickontryherebutton() {
		// TODO Auto-generated method stub

		driver.findElement(tryherelink).click();

	}

	public void Pythoncode() throws IOException, InterruptedException

	{
		
		Thread.sleep(200);
		
		Actions action = new Actions(driver);
		//action.moveToElement(text); 
		//driver.findElement(textarea).sendKeys("print('hello')");
		
		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\TestdataforSPC.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);

		for (int i = 0; i <=sheet.getLastRowNum(); i++) {
			try {
				
				cell = sheet.getRow(i).getCell(0);
				WebElement text=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
				action.moveToElement(text); 
				text.sendKeys(cell.getStringCellValue());
			}catch (Exception e) {
				e.printStackTrace();
			}
			}}

		
	

	public void clickonrunbutton() throws InterruptedException {

		Thread.sleep(200);
		driver.findElement(Runbutton).click();
		
	}
	
	

	public void output()

	{

		String outputresult = driver.findElement(output).getText();
		System.out.println("the output is" + outputresult);

	}

	public void clickonarraylist() {

		driver.navigate().to(arrayurl);
		driver.findElement(arrayusinglist).click();

	}

	public void clickOnBasicOpertaion() {

		driver.navigate().to(arrayurl);
		driver.findElement(basicoperationlink).click();

	}

	public void clickOnApplicationsofArray() {

		driver.navigate().to(arrayurl);
		driver.findElement(Applicationslink).click();

	}

	public void clickonPracticeQuestions() {

		driver.navigate().to(arrayurl);
		driver.findElement(arrayinpythonlink).click();
		driver.findElement(PracticeQuestion).click();

	}

	public void clickonSearchtheArray() {
		// TODO Auto-generated method stub

		driver.findElement(question1).click();

	}

	public void clickonMaxConsecutiveones() {
		// TODO Auto-generated method stub

		driver.navigate().to(practiceurl);
		driver.findElement(question2).click();
	}

	public void clickonfindoddoreven() {
		// TODO Auto-generated method stub

		driver.navigate().to(practiceurl);
		driver.findElement(question3).click();
	}

	public void clickonSquareonSortedArray() {
		// TODO Auto-generated method stub

		driver.navigate().to(practiceurl);
		driver.findElement(question4).click();
	}

public void codeforsearcharray() throws IOException, InterruptedException {
	// TODO Auto-generated method stub
	
	
	Actions action = new Actions(driver);
		 
	 File src=new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdataforqn1.xlsx");
	FileInputStream finput=new FileInputStream(src);
	workbook=new XSSFWorkbook(finput);
	sheet=workbook.getSheetAt(0);
	
	
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		try {
			
			cell = sheet.getRow(i).getCell(0);
			WebElement text=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
			action.moveToElement(text); 
			text.sendKeys(cell.getStringCellValue());
	          
	                  				
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}

	public void codeformaxconservno() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		Actions action = new Actions(driver);
		
		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdata.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(4);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {

				cell = sheet.getRow(i).getCell(0);
				WebElement text=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
				action.moveToElement(text); 
				text.sendKeys(cell.getStringCellValue());
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void codeforoddoreven() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Actions action = new Actions(driver);
		
		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdataforqn3.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {

				cell = sheet.getRow(i).getCell(0);
				WebElement text=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
				action.moveToElement(text); 
				text.sendKeys(cell.getStringCellValue());

			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void codeforsortedSqauare() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		Actions action = new Actions(driver);
		
		
		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdataforqn4.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			try {

				cell = sheet.getRow(i).getCell(0);
				WebElement text=driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
				action.moveToElement(text); 
				text.sendKeys(cell.getStringCellValue());

			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void submitonqns() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(300);
		
		driver.findElement(submitbutton).isDisplayed();
		driver.findElement(submitbutton).click();
	}

	public void Cleartext() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(500);
		driver.findElement(textarea).sendKeys(Keys.CONTROL,"a");
		driver.findElement(textarea).sendKeys(Keys.DELETE);
		
	}

	public void usersignout() {
		// TODO Auto-generated method stub
		
		driver.navigate().back();
		driver.findElement(signoutbtn).click();
		
	}
	
public void TryeditorPage() {
		
		driver.navigate().to(tryeditorurl);
	}

	public void Alert_Accept() {
		driver.switchTo().alert().accept();
	}

	

	public void invalidpythoncode() throws InterruptedException, IOException {

		{

			Thread.sleep(200);

			Actions action = new Actions(driver);

			File src = new File(
					"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\InvalidTestdata.xlsx");
			FileInputStream finput = new FileInputStream(src);
			workbook = new XSSFWorkbook(finput);
			sheet = workbook.getSheetAt(0);

			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				try {

					cell = sheet.getRow(i).getCell(0);
					WebElement text = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea"));
					action.moveToElement(text);
					text.sendKeys(cell.getStringCellValue());
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	
public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\ArrayPage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}
}
