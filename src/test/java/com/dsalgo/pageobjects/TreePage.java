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

public class TreePage {
	
	public static WebDriver driver;
	By SignInButton = By.linkText("Sign in");
	By UsernameBox = By.name("username");
	By SigninPgPwd = By.id("id_password");
	By LoginBtn = By.xpath("//input[@value='Login']");
	By DropdownClick = By.xpath("//a[@href='#'][@data-toggle='dropdown']");
	By TreeDropdown = By.xpath("//a[text()='Tree']");
	By OverviewOfTreesLink = By.linkText("Overview of Trees");
	By TerminologiesLink = By.linkText("Terminologies");
	By TypesOfTreesLink = By.linkText("Types of Trees");
	By TreeTraversalsLink = By.linkText("Tree Traversals");
	By TraversalsIllustrationLink = By.linkText("Traversals-Illustration");
	By BinaryTreesLink = By.linkText("Binary Trees");
	By TypesOfBinaryTreesLink = By.linkText("Types of Binary Trees");
	By ImplementationInPythonLink = By.linkText("Implementation in Python");
	By BinaryTreeTraversalsLink = By.linkText("Binary Tree Traversals");
	By ImplementationofBinaryTreesLink = By.linkText("Implementation of Binary Trees");
	By ApplicationsofBinaryTreesLink = By.linkText("Applications of Binary trees");
	By BinarySearchTreesLink = By.linkText("Binary Search Trees");
	By ImplementationOfBSTLink = By.linkText("Implementation Of BST");
	By PracticeQuestionsLink = By.linkText("Practice Questions");
	By TryHereButton = By.linkText("Try here>>>");
	By TryEditorInput = By.xpath("//textarea[@tabindex='0']");
	By RunButton = By.xpath("//button[text()='Run']");
	By RunOutputMessage = By.id("output");
	By signoutbtn = By.xpath("//a[@href='/logout']");
	public String Pythoncode;
	
	public TreePage(WebDriver driver) {
		
		TreePage.driver=driver;
		
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
	
	public void TreeDropDownClick() {
		
		driver.findElement(TreeDropdown).click();
		
	}
	public void OverviewofTreesClick() {
		
		driver.findElement(OverviewOfTreesLink).click();
		
	}
	public void TerminologiesClick() {
		
		driver.findElement(TerminologiesLink).click();
		
	}
	public void TypesofTreesClick() {
		
		driver.findElement(TypesOfTreesLink).click();
		
	}
	public void TreeTraversalsClick() {
		
		driver.findElement(TreeTraversalsLink).click();
		
	}
	public void TraversalsIllustrationClick() {
		
		driver.findElement(TraversalsIllustrationLink).click();
		
	}
	public void BinaryTreesClick() {
		
		driver.findElement(BinaryTreesLink).click();
		
	}
	public void TypesofBinaryTreesClick() {
		
		driver.findElement(TypesOfBinaryTreesLink).click();
		
	}
	public void ImplementationinPythonClick() {
		
		driver.findElement(ImplementationInPythonLink).click();
		
	}
	public void BinaryTreeTraversalsClick() {
		
		driver.findElement(BinaryTreeTraversalsLink).click();
		
	}
	public void ImplementationofBinaryTreesClick() {
		
		driver.findElement(ImplementationofBinaryTreesLink).click();
		
	}
	public void ApplicationsofBinaryTreesClick() {
		
		driver.findElement(ApplicationsofBinaryTreesLink).click();
		
	}
	public void BinarySearchTreesClick() {
		
		driver.findElement(BinarySearchTreesLink).click();
		
	}
	public void ImplementationOfBSTClick() {
		
		driver.findElement(ImplementationOfBSTLink).click();
		
	}
	public void  PracticeQuestionsClick() {
		
		driver.findElement(OverviewOfTreesLink).click();
		driver.findElement(PracticeQuestionsLink).click();
		
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
	
	public void Enter_Valid_SheetInputs(String Sheetname,int Rownumber) throws IOException, InvalidFormatException, InterruptedException {
		
		
		Thread.sleep(200);
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
	
	public String Get_Alert_Message() {
		
		String Alert_Message = driver.switchTo().alert().getText();
		return Alert_Message;
	}
	
	public void Navigate_To_TreeUrl() {
		
		driver.navigate().to(Constants.TreePageUrl);
	}
	
	public void Capture_ScreenShot() throws AWTException, IOException {
		
		Robot robot = new Robot();
		java.awt.Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(ScreenSize);
		BufferedImage SourceFile = robot.createScreenCapture(rectangle);
		File DestinationFile = new File("C:\\Users\\jsri3\\WorkSpace2\\ProjectWork\\src\\test\\resources\\ScreenShots\\TreePage.png");
		ImageIO.write(SourceFile, "png", DestinationFile);
		
	}
	
	public void Close_Browser() {
		
		driver.close();
		
	}

	public void signout() {
		// TODO Auto-generated method stub
		driver.findElement(signoutbtn).click();
		
	}
}
