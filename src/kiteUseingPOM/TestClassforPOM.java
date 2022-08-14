package kiteUseingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassforPOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(900);
		SignupPage sp=new SignupPage(driver);
		sp.senduserid();
		sp.sendpassword();
		sp.clickonsubmit();
		Thread.sleep(900);
		SecondPage sc=new SecondPage(driver);
		sc.pin();
		sc.clickonContinue();
		Thread.sleep(900);
		ThirdPage tp=new ThirdPage(driver);
		tp.useridclick();
		Thread.sleep(900);
		tp.logout();
		Thread.sleep(900);
		driver.close();
		
		
		
	}

}
