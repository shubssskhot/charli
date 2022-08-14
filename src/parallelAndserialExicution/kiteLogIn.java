package parallelAndserialExicution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kiteLogIn {
  @Test
  public void f() throws InterruptedException {System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(500);
	driver.findElement(By.id("userid")).sendKeys("ELR321");
	driver.findElement(By.id("password")).sendKeys("Dhana1111");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}
