package aaaTestNGClasses;

import org.testng.annotations.Test;

import aaaBaseClasses.baseClass;
import aaaPOMClasses.HomePage;
import aaaPOMClasses.LogInPage;
import aaaPOMClasses.PinPage;
import aaaUtilityClasses.UtilityKite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestClassNew extends baseClass {
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
		lp.userid(UtilityKite.testData(0, 1));
		lp.Password(UtilityKite.testData(1, 1));
		waits(1000);
		pp.pin(UtilityKite.testData(2, 1));
		pp.clickonContinue();
		Thread.sleep(1000);
	}
@Test
	public void f() throws EncryptedDocumentException, IOException {
		String ext = "12234";
		Assert.assertEquals(HomePage.userid(), UtilityKite.testData(0, 1), "TC failled");
		waits(5000);
		UtilityKite.screenshot(driver, ext);
	}
@AfterMethod
	public void afterMethod() {
		waits(5000);
		HomePage.logouts();
	}
@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
