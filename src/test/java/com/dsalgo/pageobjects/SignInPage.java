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

public class SignInPage {

	public WebDriver driver;
	
	    XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
		
		
		By signinbutton=By.xpath("//a[@href='/login']");
	    By Username=By.id("id_username");
		By Password=By.id("id_password");
		By loginbutton=By.xpath("//input[@type='submit']");
		By message=By.xpath("//div[@class='alert alert-primary']");
		By signoutbtn=By.xpath("//a[@href='/logout']");
	
		
	

	public SignInPage(WebDriver driver) {
					
		this.driver=driver;
		
		}


	public void verifycurrenturl(String expurl) {
		// TODO Auto-generated method stub
		
		String actualurl=driver.getCurrentUrl();
		if(actualurl.contains(expurl))
		{
			System.out.println("user in current page");
		}else
		{
			System.out.println("user in some other page");
		}
		
		
		}


	public void clickonsigninbutton() {
		// TODO Auto-generated method stub
		driver.findElement(signinbutton).click();
	}
	
	
	public void verifymessage() {
		
		String msg=driver.findElement(message).getText();
		System.out.println(""  +msg);
		
		
	}
	
	public void invalidusername() {
		
		
		driver.findElement(Username).sendKeys("Luckcharm");
		 driver.findElement(Password).sendKeys("Luck123");
		 driver.findElement(loginbutton).click();
		 
	}
	
	public void testdatausernameandpwsd() throws IOException {
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_username")));
		
		
		File src=new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\testdata\\Testdata2.xlsx");
		FileInputStream finput=new FileInputStream(src);
		workbook=new XSSFWorkbook(finput);
		sheet=workbook.getSheetAt(0);
		
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			try {
				System.out.println("Row Number " + i + "col "+ 0 + "total sheet rows " + sheet.getLastRowNum());
				cell = sheet.getRow(i).getCell(0);
		         driver.findElement(Username).sendKeys(cell.getStringCellValue());
		          
		         System.out.println("Row Number " + i + "col "+ 1);
		         cell = sheet.getRow(i).getCell(1);
		         driver.findElement(Password).sendKeys(cell.getStringCellValue());
                      				
				 driver.findElement(loginbutton).click();
		         String msg=driver.findElement(message).getText();
		         String currenturl=driver.getCurrentUrl();
		         if(msg.contains("Invalid"))
		         {
		        	 System.out.println("username and password is invalid");
		         }else if(currenturl.contains("home")) {
		        	 driver.findElement(signoutbtn).click();
		         }
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					 				         			
		}
			
	//workbook.close();
	
	}
	
		
				
		public void clickonsignoutbtn() {
			
			
						
			driver.findElement(signoutbtn).click();
		}
		
		public void Capture_ScreenShot() throws AWTException, IOException {
			
			Robot robot = new Robot();
			java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle = new Rectangle(ScreenSize);
			BufferedImage SourceFile = robot.createScreenCapture(rectangle);
			File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\SignInPage.png");
			ImageIO.write(SourceFile, "png", DestinationFile);
			
		}
		
		
	}
	
