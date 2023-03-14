package projectWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login{
	
	public static WebDriver driver = new ChromeDriver();
	
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	
	
	By GetStartedbutton=By.xpath("//a[@href='/home']");
	By Registerlink=By.xpath("//a[@href='/register']");
	By Username=By.name("username");
	By password=By.name("password1");
	By confirmpswd=By.name("password2");
	By registerbutton=By.xpath("//input[@type='submit']");
	By loginlink=By.xpath("//a[@href='/login']");

	public void register() throws IOException {
		driver.findElement(GetStartedbutton).click();
		driver.findElement(Registerlink).click();
		
		File src=new File("C:\\Users\\bsethur\\eclipse-workspace\\ProjectWork\\src\\test\\resources\\testdata\\Testdata.xlsx");
		FileInputStream finput=new FileInputStream(src);
		workbook=new XSSFWorkbook(finput);
		sheet=workbook.getSheetAt(0);
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			cell = sheet.getRow(i).getCell(0);
	         driver.findElement(Username).sendKeys(cell.getStringCellValue());
	          
	         cell = sheet.getRow(i).getCell(1);
	         driver.findElement(password).sendKeys(cell.getStringCellValue());
	         
	         cell = sheet.getRow(i).getCell(2);
	         driver.findElement(confirmpswd).sendKeys(cell.getStringCellValue());
			
			
		}
		}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "/Lavanya-selenium/src/test/resources/Driver/chromedriver.exe");
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		login l=new login();
		l.register();
		
	}

}
