package com.dsalgo.Webdriver_Manager;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dsalgo.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	

	
	private static final Logger LOGGER=LogManager.getLogger(DriverManager.class);

	public static WebDriver driver=null;
	
	

	public static void launchBrowser() {
		// TODO Auto-generated method stub
		
		try {
			
			switch(Constants.BROWSER){

			case "CHROME":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching" +Constants.BROWSER);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
				
			case "FIREFOX":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching" +Constants.BROWSER);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
				
			case "EDGE":
				WebDriverManager.edgedriver().setup();
				LOGGER.info("Launching" +Constants.BROWSER);
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
				
											
			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching" +Constants.BROWSER);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
								
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
			
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
	
}
