package com.dsalgo.pageobjects;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	public WebDriver driver;

	
	By Username=By.name("username");
	By Password=By.name("password1");
	By Confirmpswd=By.name("password2");
	By registerbutton=By.xpath("//input[@type='submit']");
	By errormsg2=By.xpath("//div[@class='alert alert-primary']");
	By successmsg=By.xpath("//div[@class='alert alert-primary']");
	
public RegistrationPage(WebDriver driver) {
		
	this.driver=driver;
		// TODO Auto-generated constructor stub
}


public void clickonRegisterButton()
{
	driver.findElement(registerbutton).click();
	String registerurl=driver.getCurrentUrl();
	Assert.assertEquals(registerurl,"https://dsportalapp.herokuapp.com/register");
	System.out.println("verifying whether username is on register Page");
	
}


public void verifyErrorMessage(String errmsg) {
	
	
	 String actualerr="Please fill out this field";
     Assert.assertEquals(errmsg,actualerr);
	
	
}

public void passthevalue(String username) {
	
	driver.findElement(Username).sendKeys(username);
	clickonRegisterButton();
}

public void passthevalue(String username,String password) {
	
	driver.findElement(Username).sendKeys(username);
	driver.findElement(Password).sendKeys(password);
	clickonRegisterButton();
}


public void passthevalue(String username, String password, String passwordconfirmation) {
	// TODO Auto-generated method stub
	
	driver.findElement(Username).sendKeys(username);
	driver.findElement(Password).sendKeys(password);
	driver.findElement(Confirmpswd).sendKeys(passwordconfirmation);
	clickonRegisterButton();
}

public String errormessagevalidation(String expectedmsg) {
	
	String actualmsg = driver.findElement(errormsg2).getText();
	Assert.assertEquals(actualmsg,expectedmsg);
	
return(actualmsg);
	
}

public void verifysucessmsg() {
	
	String successmsg1=driver.findElement(successmsg).getText();
	System.out.println(""   +successmsg1);
	
}
public void Capture_ScreenShot() throws AWTException, IOException {
	
	Robot robot = new Robot();
	java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rectangle = new Rectangle(ScreenSize);
	BufferedImage SourceFile = robot.createScreenCapture(rectangle);
	File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\RegisterPage.png");
	ImageIO.write(SourceFile, "png", DestinationFile);
	
}


}
