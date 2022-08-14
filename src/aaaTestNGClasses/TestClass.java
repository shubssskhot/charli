package aaaTestNGClasses;

import org.testng.annotations.Test;

import aaaBaseClasses.baseClass;
import aaaPOMClasses.HomePage;
import aaaPOMClasses.LogInPage;
import aaaPOMClasses.PinPage;
import aaaUtilityClasses.NewUtilityKite;
import aaaUtilityClasses.UtilityKite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestClass extends baseClass {
	LogInPage lp;
	PinPage pp;
	HomePage hp;
@BeforeClass
	public void beforeClass() {
		launchBrowser();
		lp = new LogInPage(driver);
		pp = new PinPage(driver);
		hp = new HomePage(driver);
	}
@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException {
		lp.userid(NewUtilityKite.readDataFromPropertyFile("UN"));
		lp.Password(NewUtilityKite.readDataFromPropertyFile("PWD"));
		waits(2000);
		pp.pin(NewUtilityKite.readDataFromPropertyFile("PIN"));
		pp.clickonContinue();
		Thread.sleep(1000);
	}
@Test
	public void f() throws EncryptedDocumentException, IOException {
		String ext = "12234";
		Assert.assertEquals(HomePage.userid(), NewUtilityKite.readDataFromPropertyFile("UN"), "TC failled");
		waits(5000);
		UtilityKite.screenshot(driver, ext);
	}
@AfterMethod	public void afterMethod() {
		waits(5000);
		HomePage.logouts();
	}
@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
