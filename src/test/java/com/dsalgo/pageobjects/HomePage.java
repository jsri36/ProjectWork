package com.dsalgo.pageobjects;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
    public WebDriver driver;
	  By GetStartedbutton=By.xpath("//button[@class='btn']");
	  By dropdown=By.xpath("//div[@class='nav-item dropdown']");
	 By selectopt=By.xpath("//div[@class='dropdown-menu show']/a[2]");
	 By getstart2=By.xpath("//a[@href='linked-list']");
	 By ErrorMsg=By.xpath("//div[@class='alert alert-primary']");
	By Registerlink=By.xpath("//a[@href='/register']");
	By loginlink=By.xpath("//a[@href='/login']");
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public   void ClickonGetStarted() {
		
		try {
			driver.findElement(GetStartedbutton).isDisplayed();
			driver.findElement(GetStartedbutton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void Verifyhomepage() {
		
		String actualtitle=driver.getTitle();
		String exptitle="Numpy Ninja"	;
		if(actualtitle.equalsIgnoreCase(exptitle)) {
			System.out.println("Title is matched");
		}else {
				System.out.println("Title is matched");
		}
		}
		
	
		
	
	public  void clickondropdown() {
		
		
		driver.findElement(dropdown).click();
			
	}
	
	public void selecttheoption() {
		
	driver.findElement(selectopt).click();
		
	}
	
	public  void errormsg() {
		
		String err=driver.findElement(ErrorMsg).getText();
		System.out.println("Error message" +err);
		
		
	}
	
	public void clickagaingetstartbtn() {
		
		driver.findElement(getstart2).click();
	}
	
    public void clickonRegisterlink()
    
    {
    	driver.findElement(Registerlink).click();
    }
    
    
    public void verifyRegisterPage()
    
    {
    	String actualurl=driver.getCurrentUrl();
		String expurl="register";
		if(actualurl.equalsIgnoreCase(expurl)) {
			System.out.println("url is matched");
		}else {
				System.out.println("url is matched");
		}
		}

public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\HomePage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}



}









