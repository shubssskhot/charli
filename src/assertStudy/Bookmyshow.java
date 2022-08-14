package assertStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Bookmyshow {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		WebElement city=driver.findElement(By.xpath("//input[@type='text']"));
		city.sendKeys("kolhapur");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.manage().window().maximize();
		//Thread.sleep(600);
		driver.findElement(By.xpath("//div[@class='sc-chbbiW fcsTnZ']")).click();
		
  }
}
