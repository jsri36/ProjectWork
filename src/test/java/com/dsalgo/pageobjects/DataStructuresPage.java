package com.dsalgo.pageobjects;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.dsalgo.constants.*;
import com.dsalgo.utilities.*;

public class DataStructuresPage {

	public static WebDriver driver;
	String DataStructuresURL="https://dsportalapp.herokuapp.com/data-structures-introduction/";
	By SignInButton = By.linkText("Sign in");
	By UsernameBox = By.name("username");
	By SigninPgPwd = By.id("id_password");
	By LoginBtn = By.xpath("//input[@value='Login']");
	By SignOut = By.xpath("//a[@href='/logout']");
	By DropdownClick = By.xpath("//a[@href='#'][@data-toggle='dropdown']");
	By DataStrGetStartedBt = By.xpath("//a[contains(@href,'data')]");
	By TimeComplexityLink = By.xpath("//a[@href='time-complexity']");
	By TryHereButton = By.linkText("Try here>>>");
	By TryEditorInput = By.xpath("//textarea[@tabindex='0']");
	By RunButton = By.xpath("//button[text()='Run']");
	By RunOutputMessage = By.id("output");
	public String Pythoncode;
	
	public DataStructuresPage(WebDriver driver) {
		
		DataStructuresPage.driver=driver;
		
	}
	
	public void SignInButtonClick() {

		driver.findElement(SignInButton).click();

	}
	
	public void LoginButtonClick() {

		driver.findElement(LoginBtn).click();

	}
	
	public void Enter_Valid_Inputs(String Username,String Password) {
		
		driver.findElement(UsernameBox).sendKeys(Username);
		driver.findElement(SigninPgPwd).sendKeys(Password);
		
	}
	
	public void MainDropDownClick() {
		
		driver.findElement(DropdownClick).click();
		
	}
	
	public void DS_GetStartedButtonClick() {
		
		driver.findElement(DataStrGetStartedBt).click();
		
	}
	
	public void TimeComplexityLinkClick() {
		
		driver.findElement(TimeComplexityLink).click();
		
	}
	
	public String GetCurrentUrl() {

		String CurrentUrl = driver.getCurrentUrl();
		return CurrentUrl;
		
	}
	
	public void TryHereButtonClick() {
		
		driver.findElement(TryHereButton).click();
		
	}
	
	public void RunButtonClick() {
		
		driver.findElement(RunButton).click();
		
	}
	
	public void Alert_Accept() {
		
		driver.switchTo().alert().accept();
		
	}
	
	public void Enter_Valid_SheetInputs(String Sheetname,int Rownumber) throws IOException, InvalidFormatException {
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> TestData = reader.getData(Constants.Excelpath, Sheetname);
		Pythoncode = TestData.get(Rownumber).get("pythonCode");
		driver.findElement(TryEditorInput).sendKeys(Pythoncode);
		
	}
	
	public String Get_Output_Message() {
		
		String Output_Message = driver.findElement(RunOutputMessage).getText();
		return Output_Message;
	}
	
	public void Page_Refresh() {
		
		driver.navigate().refresh();
		
	}
	
	public void Navigate_To_DataStructuresUrl() {
		
		driver.navigate().to(Constants.DataStructuresURL);
		
	}
	
	public void SignOutButtonClick() {
		
		driver.findElement(SignOut).click();
		
	}
	
	public String Get_Alert_Message() {
		
		String Alert_Message = driver.switchTo().alert().getText();
		return Alert_Message;
	}
	
	public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\DataStructPage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}
}
