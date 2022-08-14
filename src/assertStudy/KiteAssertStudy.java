package assertStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteAssertStudy {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/dashboard");
		Thread.sleep(500);
		driver.findElement(By.id("userid")).sendKeys("ELR321");
		driver.findElement(By.id("password")).sendKeys("Dhana1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1800);
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
		String Expected="ELR321";
		String Actual=UID.getText();
		System.out.println(Actual);
		Assert.assertEquals(Expected, Actual);
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Kite logo']"));
		boolean a = logo.isDisplayed();
		Assert.assertTrue(a, "Logo is not vissible");
		
		
		
  }
}
