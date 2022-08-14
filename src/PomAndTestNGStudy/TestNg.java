package PomAndTestNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
	
public class TestNg {
	WebDriver driver;
	loginPage login;
	SecondPage Pin;
	ThirdPage home;
	File myfile;
	Sheet Excel;
	
	@BeforeClass
	
	public void beforeClass() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		 myfile =new File ("E:\\\\shubham.xlsx");
		Excel =WorkbookFactory.create(myfile).getSheet("sheet1");
		
		login=new loginPage(driver);
		Pin=new SecondPage(driver);
		home=new ThirdPage(driver);
		
		
	}
	
	
	
	@BeforeMethod
	  public void beforeMethod() {
		
		
	  }
	@Test
  public void f() {
		
		
		
		
		
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("closeing the browser");
  driver.close();
  
  }
  
  

}
