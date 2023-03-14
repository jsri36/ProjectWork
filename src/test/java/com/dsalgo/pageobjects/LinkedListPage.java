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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LinkedListPage {

	WebDriver driver;

	public LinkedListPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	String linkedurl = "https://dsportalapp.herokuapp.com/linked-list/";
	By dropdown = By.xpath("//div[@class='nav-item dropdown']");
	By selectopt = By.xpath("//div[@class='dropdown-menu show']/a[2]");
	By practicequestionlink = By.xpath("//a[@href='/linked-list/practice']");
	By introductionlink = By.xpath("//a[@href='introduction']");
	By creatinglinkedlistlink = By.xpath("//a[@href='creating-linked-list']");
	By typeoflinkedlistlink = By.xpath("//a[@href='types-of-linked-list']");
	By Implementlinkedlistlink = By.xpath("//a[@href='implement-linked-list-in-python']");
	By Insertionlink = By.xpath("//a[@href='insertion-in-linked-list']");
	By traversallink = By.xpath("//a[@href='traversal']");
	By deletionlink = By.xpath("//a[@href='deletion-in-linked-list']");
	By GetStartedbutton = By.xpath("//button[@class='btn']");
	By signinbutton = By.xpath("//a[@href='/login']");
	By Username = By.id("id_username");
	By Password = By.id("id_password");
	By loginbutton = By.xpath("//input[@type='submit']");
	By output = By.xpath("//pre[@id='output']");
	By textarea = By.xpath("//div[@class='CodeMirror-scroll']");
	By textarea1 = By.xpath("//div[@class='CodeMirror-scroll']");
	By Runbutton = By.xpath("//button[@type='button']");
	By submitbutton = By.xpath("//button[@type='submit']");
	By tryherelink = By.xpath("//a[@href='/tryEditor']");
	By signoutbtn = By.xpath("//a[@href='/logout']");
	 String tryeditorurl="https://dsportalapp.herokuapp.com/tryEditor";

	public void presteps() {

		driver.findElement(GetStartedbutton).isDisplayed();
		driver.findElement(GetStartedbutton).click();
		driver.findElement(signinbutton).click();

	}

	public void userlogin() {

		driver.findElement(Username).sendKeys("LathaRajini");
		driver.findElement(Password).sendKeys("Latha123");
		driver.findElement(loginbutton).click();

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

	public void clickontryherebutton() {
		// TODO Auto-generated method stub

		driver.findElement(tryherelink).click();

	}

	public void pythoncode() throws IOException, InterruptedException

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

		

	public void clickonrunbutton() {

		driver.findElement(Runbutton).click();

	}

	public void output()

	{

		String outputresult = driver.findElement(output).getText();
		System.out.println("the output is" + outputresult);

	}

	public void selectoption() {

		driver.findElement(dropdown).click();
		driver.findElement(selectopt).click();
	}

	public void verifyurl(String url) {
		// TODO Auto-generated method stub

		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, url);

	}

	public void clickonIntroductionLink() {
		// TODO Auto-generated method stub

		driver.findElement(introductionlink).click();

	}

	public void clickoncreatinglinkedlistLink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(creatinglinkedlistlink).click();

	}

	public void clickonimplementlistLink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(Implementlinkedlistlink).click();

	}

	public void clickontypeoflinkedlistLink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(typeoflinkedlistlink).click();

	}

	public void clickonInsertionlink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(Insertionlink).click();

	}

	public void clickontraversallink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(traversallink).click();

	}

	public void clickondeletionlink() {
		// TODO Auto-generated method stub

		driver.navigate().to(linkedurl);
		driver.findElement(deletionlink).click();

	}

	public void clickonpracticeQuestion() {

		driver.navigate().to(linkedurl);
		driver.findElement(introductionlink).click();
		driver.findElement(practicequestionlink).click();
	}

	public void clickonsignoutbtn() {

		
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
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\LinkedListPage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}

}
