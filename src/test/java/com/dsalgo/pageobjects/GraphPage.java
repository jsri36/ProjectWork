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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GraphPage {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	WebDriver driver;

	public GraphPage(WebDriver driver) {

		this.driver = driver;
	}

	By GetStartedbutton = By.xpath("//button[@class='btn']");
	By signinbutton = By.xpath("//a[@href='/login']");
	By Username = By.id("id_username");
	By Password = By.id("id_password");
	By loginbutton = By.xpath("//input[@type='submit']");
	By dropdown = By.xpath("//div[@class='nav-item dropdown']");
	By selectopt = By.xpath("//div[@class='dropdown-menu show']/a[6]");
	By output = By.xpath("//pre[@id='output']");
	By signoutbtn = By.xpath("//a[@href='/logout']");
	By Graphlink = By.xpath("//a[@href='graph']");
	By GraphRep = By.xpath("//a[@href='graph-representations']");
	By Practice = By.xpath("//a[@href='/graph/practice']");
	By tryherelink = By.xpath("//a[@href='/tryEditor']");
	By alertMessage = By.xpath("//div[@class='alert alert-primary']");
	By textarea = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By Runbutton = By.xpath("//button[@type='button']");
	String Graphurl="https://dsportalapp.herokuapp.com/graph/";
    String tryeditorurl="https://dsportalapp.herokuapp.com/tryEditor";
	public void presteps() {

		driver.findElement(GetStartedbutton).isDisplayed();
		driver.findElement(GetStartedbutton).click();
		driver.findElement(signinbutton).click();

	}

	public void userlogin() throws IOException {

		File src = new File(
				"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdataforusername.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);

		for (int i = 1; i < sheet.getLastRowNum(); i++) {
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

	public void clickonGraph() {
		driver.findElement(Graphlink).click();
	}

	public void clickonGraphRepresentation() {
		
		driver.findElement(GraphRep).click();
	}
	
	public void clickonTryherebutton() {
		
		driver.findElement(tryherelink).click();
	}
	
	public void TryeditorPage() {
		
		driver.navigate().to(tryeditorurl);
	}

	public void Alert_Accept() {
		driver.switchTo().alert().accept();
	}

	public void clickOnPracticeQns() {
		// TODO Auto-generated method stub

		
		driver.findElement(Practice).click();

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

	public void Validpythoncode() throws InterruptedException, IOException {

		{

			Thread.sleep(200);

			Actions action = new Actions(driver);

			File src = new File(
					"C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\TestdataforSPC.xlsx");
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

	public void ClickonRunButton() {
		
		driver.findElement(Runbutton).click();
	}
	

	public void output()

	{

		String outputresult = driver.findElement(output).getText();
		System.out.println("the output is" + outputresult);

	}

	public void usersignout() {
		
		driver.findElement(signoutbtn).click();
	}

	public void verifypage() {
		// TODO Auto-generated method stub
		
		String url=driver.getCurrentUrl();
		if(url.contains("tryeditor")){
			System.out.println("user in tryeditor page");
		}else
		{
			System.out.println("user in Someother page");
		}
		
		
	}
	
public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\GraphPage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}


}
